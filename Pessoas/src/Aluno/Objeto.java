package Aluno;
/**/
public class Objeto {
	public static void main(String[] args) {
		/* New Aluno é uma instancia (Criação de Objeto */
		/* aluno1 é uma referencia para o objeto aluno */
		Aluno aluno1 = new Aluno(); /* Aqui será o João */
		aluno1.setNome("João da Silva");
		aluno1.setIdade(15);
		aluno1.setDataNascimento("02/15/2661");
		aluno1.setRegistroGeral("1563512");
		aluno1.setNumeroCpf("1234567891011");
		aluno1.setNomeMae("Joselina Silva");
		aluno1.setNomePai("Jose Silva");
		aluno1.setDataMatricula("10/01/2019");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("Escola Jdev Treinamento");
		aluno1.setNota1(100);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		
		System.out.println("Nome do aluno é: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Quando Nasceu: " + aluno1.getDataNascimento());
		System.out.println("RG: " + aluno1.getRegistroGeral());
		System.out.println("CPF: " + aluno1.getNumeroCpf());
		System.out.println("A media de nota é: " + aluno1.getMediaNota());
		System.out.println("<<----------------------->>");
		
		Aluno aluno2 = new Aluno();/* Aqui será o Pedro */
		aluno2.setNome("Pedro");
		aluno2.setIdade(56);
		aluno2.setDataNascimento("02/15/1996");
		System.out.println("Segundo Aluno");
		System.out.println("Nome do aluno é: " + aluno2.getNome());
		System.out.println("Idade: " + aluno2.getIdade());
		System.out.println("Quando Nasceu: " + aluno2.getDataNascimento());
		
		Aluno aluno3 = new Aluno(); /* Aqui será o Gustavo */

		Aluno aluno4 = new Aluno("Gustavo");

		Aluno aluno5 = new Aluno("Gustavo, 21");
	}

}
