package Manipulacao_Dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class Adicionando_Nova_Célula_No_Excel_ApachePoi {

	public static void main(String[] args) throws Exception {
		/*ENTRADA DE ARQUIVO*/
		File file = new File("C:\\Users\\angel\\eclipse-workspace\\Manipulacao_Dados\\src\\Manipulacao_Dados\\docum.xls"); /* CAMINHO DO ARQUIVO*/
		
		FileInputStream entrada = new FileInputStream(file); /*ESNTRAD DO CAMINHO*/
		
		HSSFWorkbook hssfworbook = new HSSFWorkbook(entrada);/* PREPARA O ARQUIVO*/
		
		HSSFSheet planilha = hssfworbook.getSheetAt(0); /*PEGANDO A PLANILHA*/
		
		Iterator<Row> linhaIterator = planilha.iterator(); /*INTERAÇÃO DA LINHA DA PLANILHA*/
		
		while (linhaIterator.hasNext()) { /*ENQUANTO TIVER LINHA*/
			Row linha = linhaIterator.next(); /* DADOS DA LINHA*/
			
			int numeroCelulas = linha.getPhysicalNumberOfCells(); /*QUANTIDADE DE CELULA*/
			
			Cell cell = linha.createCell(numeroCelulas);/*CRIA NOVA CELULA NA LINHA*/
			cell.setCellValue("50.646.555");
			
		}
		 entrada.close();
		 
		 FileOutputStream saida = new FileOutputStream(file);
		 hssfworbook.write(file);
		 hssfworbook.close();
		 saida.flush();
		 saida.close();
		 System.out.print("planilha atualizada");
	}
}
