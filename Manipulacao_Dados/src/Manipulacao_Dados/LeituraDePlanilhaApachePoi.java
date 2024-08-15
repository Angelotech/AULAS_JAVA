package Manipulacao_Dados;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class LeituraDePlanilhaApachePoi {
	public static void main(String[] args) throws Throwable {
		
		FileInputStream entrada = new FileInputStream(new File("C:\\Users\\angel\\eclipse-workspace\\Manipulacao_Dados\\src\\Manipulacao_Dados\\Ficha_De_Cadrastro1.xls"));
		HSSFWorkbook worbook = new HSSFWorkbook(entrada);/*PREPARANDO A ENTRADA DO ARQUIVO EXCEL PARA LER*/
		HSSFSheet planilha = worbook.getSheetAt(0);/*PRIMEIRA PLANILHA DO ARQUIVO EXCEL*/
		
		Iterator<Row> linhainteretor = planilha.iterator();/*INTERAÇÃO DAS LINHAS*/
		
		List<Dados> dados = new ArrayList<Dados>();
		
		while (linhainteretor.hasNext()) {/*ENQUANTO TIVER LINHA NO EXCEL*/
			Row linha = linhainteretor.next(); /*DADOS DA PESSOA NA LINHA*/
			
			Iterator<Cell> celula = linha.iterator();
			
			Dados dados1 = new Dados();
			
			while(celula.hasNext()) { /*percorre as celulas*/
				Cell cell = celula.next();
				
				
				
				/*VERIFICAÇÃO E POPPULARIZAÇÃO*/
				switch (cell.getColumnIndex()) { /*PEGAMOS O INDEX DA CELULAR*/
				case 0:
					dados1.setNome(cell.getStringCellValue());
					break;
					
				case 1:
					dados1.setPais(cell.getStringCellValue());
					break;
					
				case 2:
					dados1.setCpf(cell.getStringCellValue());
					break;
					
				}
					
			}/*	FIM DA CELULA DA LINHA*/
			
			dados.add(dados1);
		
		}
		entrada.close();/*TERMINO DE LER O ARQUIVO EXCEL*/
		
		for (Dados contador : dados) {
			System.out.println("A SUA PLANILHA " + contador);
			
		}
		
			
			
		
	}
	

}
