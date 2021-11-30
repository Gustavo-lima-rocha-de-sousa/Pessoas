package ArquivosJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivoTXT {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream entradaArquivo = new FileInputStream(
				new File("C:\\Users\\dougl\\git\\Pessoas\\Pessoas\\src\\ArquivosJava\\arquivo.txt"));

		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

		while (lerArquivo.hasNext()) {

			String linha = lerArquivo.nextLine();

			if (linha != null && !linha.isEmpty()) {
				System.out.println(linha);
			}
		}
	}
}
