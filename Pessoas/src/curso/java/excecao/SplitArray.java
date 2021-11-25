package curso.java.excecao;

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
	}
}
