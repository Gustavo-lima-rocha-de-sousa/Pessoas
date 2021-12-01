package ArquivosJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.ServerError;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws Exception {
		
		
		
		File file = new File("C:\\Users\\dougl\\git\\Pessoas\\Pessoas\\src\\ArquivosJava\\arquivo_excel.xls");
		
		if(!file.exists()) {
			file.createNewFile();
			
			PessoaArquivo pessoa1 = new PessoaArquivo();
			pessoa1.setEmail("pessoa1@gmail.com");
			pessoa1.setIdade(50);
			pessoa1.setNome("Alex egidio");
			
			PessoaArquivo pessoa2 = new PessoaArquivo();
			pessoa2.setEmail("pessoa2@gmail.com");
			pessoa2.setIdade(25);
			pessoa2.setNome("Marcos Tadeu");
			
			PessoaArquivo pessoa3 = new PessoaArquivo();
			pessoa3.setEmail("pessoa3@gmail.com");
			pessoa3.setIdade(21);
			pessoa3.setNome("Gustavo Lima");
			
			PessoaArquivo pessoa4 = new PessoaArquivo();
			pessoa4.setEmail("pessoa4@gmail.com");
			pessoa4.setIdade(19);
			pessoa4.setNome("Barbara Silva");
			
			/*A Lista Pode Vir do banco de dados 
			 * ou qual quer tipo de fonte*/
			
			List<PessoaArquivo> pessoas = new ArrayList<PessoaArquivo>();
			pessoas.add(pessoa1);
			pessoas.add(pessoa2);
			pessoas.add(pessoa3);
			pessoas.add(pessoa4);
			
			HSSFWorkbook hssfWorkbook = new HSSFWorkbook();/*Usado para escrever a planilha*/
			HSSFSheet linhasPessoa = hssfWorkbook.createSheet("Planilha de Pessoas jDev");

			int numerolinha = 0;
			for (PessoaArquivo p : pessoas) {
				Row linha = linhasPessoa.createRow(numerolinha++);
				
				int celula = 0;
				
				Cell celNome = linha.createCell(celula++);		
				celNome.setCellValue(p.getNome());
				
				Cell celemail = linha.createCell(celula++);		
				celemail.setCellValue(p.getEmail());
				
				Cell celIdade = linha.createCell(celula++);		
				celIdade.setCellValue(p.getIdade());
	
			
			FileOutputStream saida = new FileOutputStream(file);
			hssfWorkbook.write(saida);
			saida.flush();
			saida.close();
			
			}
			System.out.println("Planilha foi criada");
		}
	}
}