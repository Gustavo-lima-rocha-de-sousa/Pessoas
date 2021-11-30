package ArquivosJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.NumberFormatException;

public class LerArquivoTXT {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream entradaArquivo = new FileInputStream(
				new File("C:\\Users\\dougl\\git\\Pessoas\\Pessoas\\src\\ArquivosJava\\arquivo.csv"));

		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

		List<PessoaArquivo> pessoas = new ArrayList<PessoaArquivo>();
		
		while (lerArquivo.hasNext()) {

			String linha = lerArquivo.nextLine();

			if (linha != null && !linha.isEmpty()) {
				
				String[] dados = linha.split("\\;");
				
				PessoaArquivo pessoa = new PessoaArquivo();
				
					pessoa.setNome(dados[0]);
					pessoa.setIdade(Integer.parseInt(dados[1]));
					pessoa.setEmail(dados[2]);
				
				pessoas.add(pessoa);
			}
		}
		for (PessoaArquivo pessoaArquivo : pessoas) {
			System.out.println(pessoaArquivo);
		}
	}

}		

		
