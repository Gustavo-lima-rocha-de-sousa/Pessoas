package ArquivosJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.ServerError;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import Aluno.Pessoa;

public class ApachePoi2 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream entrada = new FileInputStream(new File("C:\\Users\\dougl\\git\\Pessoas\\Pessoas\\src\\ArquivosJava\\arquivo_excel.xls"));
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);/*Prepara a entrada*/
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);/*Primeira planilha excel*/
		
		
		Iterator<Row> linhaInterator = planilha.iterator();
		
		List<PessoaArquivo> pessoas = new ArrayList<PessoaArquivo>();
		
		while(linhaInterator.hasNext()) {
			Row linha = linhaInterator.next();
			
			Iterator<Cell> celula = linha.iterator();
			
			PessoaArquivo pessoa = new PessoaArquivo();
			
			while(celula.hasNext()) {
				Cell cell = celula.next();
				
				switch (cell.getColumnIndex()) {
				case 0:
					pessoa.setNome(cell.getStringCellValue());
					break;
					
				case 1:
					pessoa.setEmail(cell.getStringCellValue());
					break;
					
				case 2:
					pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
					break;
					
				}
				
			}/*Fim celula da linha*/
			
			pessoas.add(pessoa);
			
		}
		
		entrada.close();/*Terminou de ler o arquivo*/
		
		for (PessoaArquivo pessoaArquivo : pessoas) {/*Poderia gravar no banco, mandar email*/
			System.out.println(pessoaArquivo);
		}
		
	}
}