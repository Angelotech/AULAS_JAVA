package Manipulacao_Dados;
import java.io.File;
import java.io.FileOutputStream;

import java.util.ArrayList;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class Planilhas_ApachePoi {
	public static void main(String[] args ) throws Throwable {
		
		/*CRIACAO DOS ARQUIVO*/
		
		File file = new File("C:\\Users\\angel\\eclipse-workspace\\Manipulacao_Dados\\src\\Manipulacao_Dados\\documento.xls");		
		
		if (!file.exists()) {
			file.createNewFile();		
		}
		
		/* SETANDO VALORES*/
		Dados dados = new Dados();
		dados.setNome("angelo");
		dados.setPais("brasil");
		dados.setCpf("1111111111");
		
		
		Dados dados1 = new Dados();
		dados1.setNome("luiz");
		dados1.setPais("venezuela");
		dados1.setCpf("511.444.555.444-85");
		
		
		/*CRIACAO DA LISTA*/
		
		List<Dados> Mdados = new ArrayList<Dados>();
		Mdados.add(dados);
		Mdados.add(dados1);
		
		/*CRIACAO DA PLANILHA*/
		
		try (HSSFWorkbook workbook = new HSSFWorkbook()) {
			Sheet LinhaPlanilha =  workbook.createSheet("planilha criada com sucesso");/*RESPONSAVEL POR CRIAR PLANILHA*/
			
			int linhas = 0;
			
			for (Dados d : Mdados) {
				 
				Row linha = LinhaPlanilha.createRow(linhas ++);/*CRIACAO DA LINHA NA PLANILHA*/
				
				int celula = 0;
				
				Cell cellnome = linha.createCell(celula ++);
				cellnome.setCellValue(d.getNome());
				
				Cell cellpais = linha.createCell(celula++);
				cellpais.setCellValue(d.getPais());
				
				Cell cellcpf = linha.createCell(celula++);
				cellcpf.setCellValue(d.getCpf());
				
				

					}/*FIM DA CRIACAO DA PLANILHA*/
					
						FileOutputStream arquivo = new FileOutputStream(file);
						workbook.write(arquivo);
						arquivo.flush();
						arquivo.close();
		}
		System.out.println("Planilha criada com sucesso!");
			
			}
	

	

	}

