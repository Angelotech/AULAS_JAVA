package Manipulacao_Dados;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class EditandoApachePoi {
	
	public static void  main(String[] args ) throws Exception{
		/* PASSANDO ARQUIVO*/
		File file = new File("C:\\Users\\angel\\eclipse-workspace\\Manipulacao_Dados\\src\\Manipulacao_Dados\\documento.xls");
		
		
		FileInputStream entrada = new FileInputStream(file);
		try (HSSFWorkbook hssworkbook = new HSSFWorkbook(entrada)) {
			HSSFSheet planilha = hssworkbook.getSheetAt(0);/*PEGANDO PLANILHA*/
			
			Iterator<Row> linhaIterator = planilha.iterator();/*INTERAÇÃO DE LINHAS*/
			
			while(linhaIterator.hasNext()) {/*ENQUANTO ESTIVER LINHA, LINHA RECEBE LINHA ITERATOR*/
				Row linha = linhaIterator.next();/*dados da pessoa na linha*/
				
				int numeroCelulas = linha.getPhysicalNumberOfCells();/*retorna o número de células que contêm dados efetivos naquela linha específica. */
				
				Cell cell = linha.createCell(numeroCelulas);/*cria nova celular na linha*/
				cell.setCellValue("5.345,20");			
			}
			entrada.close();
			
			FileOutputStream saida = new FileOutputStream(file);
			hssworkbook.write(saida);
			saida.flush();
			saida.close();
		}
		System.out.println("planilha atualizada");
		
	

	
 }
}