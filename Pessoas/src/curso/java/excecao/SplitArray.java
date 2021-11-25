package curso.java.excecao;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
	
		String texto = "Gustavo, Curso Java, 80, 70, 90, 89";
		
		String [] valoreArray = texto.split(",");
		
		System.out.println("Nome: " + valoreArray[0]);
		System.out.println("Curso: " + valoreArray[1]);
		System.out.println("Nota1: " + valoreArray[2]);
		System.out.println("Nota2: " + valoreArray[3]);
		System.out.println("Nota3: " + valoreArray[4]);
		System.out.println("Nota4: " + valoreArray[5]);
		
		/*Convertendo um Array em uma Lista*/
		
		List<String> list = Arrays.asList(valoreArray);
		
		for (String valoString : list) {
			System.out.println(valoString);
		}
		
		/*Converter uma Lista para Array*/
		String[]conversaoArray = list.toArray(new String[6]);
		
		for(int pos = 0; pos < conversaoArray.length; pos++) {
			System.out.println(conversaoArray[pos]);
			
		}
	}
}
