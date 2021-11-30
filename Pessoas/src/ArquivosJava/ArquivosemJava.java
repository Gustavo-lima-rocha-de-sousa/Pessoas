package ArquivosJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArquivosemJava {

	public static void main(String[] args) throws IOException {
		
		PessoaArquivo pessoa1 = new PessoaArquivo();
		pessoa1.setEmail("pessoa1@gmail.com");
		pessoa1.setIdade(50);
		pessoa1.setNome("Alex egidio");
		
		PessoaArquivo pessoa2 = new PessoaArquivo();
		pessoa2.setEmail("pessoa2@gmail.com");
		pessoa2.setIdade(25);
		pessoa2.setNome("Marcos Tadeu");
		
		PessoaArquivo pessoa3 = new PessoaArquivo();
		pessoa2.setEmail("pessoa3@gmail.com");
		pessoa2.setIdade(21);
		pessoa2.setNome("Gustavo Lima");
		
		/*A Lista Pode Vir do banco de dados 
		 * ou qual quer tipo de fonte*/
		
		List<PessoaArquivo> pessoas = new ArrayList<PessoaArquivo>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		
		File arquivo = new File("C:\\Users\\dougl\\git\\Pessoas\\Pessoas\\src\\ArquivosJava\\arquivo.txt");	
			
		if (!arquivo.exists()) {
			arquivo.createNewFile();
			
		}
		
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		escrever_no_arquivo.write("Meu Texto No Arquivo.");
		escrever_no_arquivo.write("\n");
		escrever_no_arquivo.write("Minha Segunda Linha.");
		escrever_no_arquivo.write("\n");
		
		for (PessoaArquivo p : pessoas) {
			escrever_no_arquivo.write(p.getNome() + " ; " + p.getIdade() + " ; " + p.getEmail());
		}
				
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
	}
}		


