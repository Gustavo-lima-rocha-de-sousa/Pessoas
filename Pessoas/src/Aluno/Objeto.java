package Aluno;

import javax.swing.JOptionPane;

public class Objeto {
	public static void main(String[] args) {
		/* New Aluno é uma instancia (Criação de Objeto */
		/* aluno1 é uma referencia para o objeto aluno */

		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String registroGeral = JOptionPane.showInputDialog("Qual seu RG?");
		String Cpf = JOptionPane.showInputDialog("Qual seu CPF?");
		String NomeMae = JOptionPane.showInputDialog("Qual nome da sua mãe");
		String NomePai = JOptionPane.showInputDialog("Qual nome da sua pai");
		String DataMatricula = JOptionPane.showInputDialog("Quando foi matriculado?");
		String SerieMatriculado = JOptionPane.showInputDialog("Qual sua serie?");
		String NomeEscola = JOptionPane.showInputDialog("Qual nome da escola?");
		String diciplina1 = JOptionPane.showInputDialog("1° Disciplina?");
		String note1 = JOptionPane.showInputDialog("Qual a 1° nota?");
		String diciplina2 = JOptionPane.showInputDialog("2° Disciplina?");
		String note2 = JOptionPane.showInputDialog("Qual a 2° nota?");
		String diciplina3 = JOptionPane.showInputDialog("3° Disciplina?");
		String note3 = JOptionPane.showInputDialog("Qual a 3° nota?");
		String diciplina4 = JOptionPane.showInputDialog("4° Disciplina?");
		String note4 = JOptionPane.showInputDialog("Qual a 4° nota?");

		Aluno aluno1 = new Aluno(); /* Aqui será o João */
		Disciplina disciplina = new Disciplina();

		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(Cpf);
		aluno1.setNomeMae(NomeMae);
		aluno1.setNomePai(NomePai);
		aluno1.setDataMatricula(DataMatricula);
		aluno1.setSerieMatriculado(SerieMatriculado);
		aluno1.setNomeEscola(NomeEscola);

		aluno1.getDisciplina().setNota1(Double.parseDouble(note1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(note2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(note3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(note4));

		aluno1.getDisciplina().setDisciplina1(diciplina1);
		aluno1.getDisciplina().setDisciplina2(diciplina2);
		aluno1.getDisciplina().setDisciplina3(diciplina3);
		aluno1.getDisciplina().setDisciplina4(diciplina4);

		System.out.println("Nome do aluno é: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Quando Nasceu: " + aluno1.getDataNascimento());
		System.out.println("RG: " + aluno1.getRegistroGeral());
		System.out.println("CPF: " + aluno1.getNumeroCpf());
		System.out.println("Escola que estuda é: " + aluno1.getNomeEscola());
		System.out.println("A media de nota é: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado2: " + aluno1.getAlunoAprovado2());

		/*System.out.println(aluno1.toString());/*Discrição do objeto na memoria */
		
		/*System.out.println("A media de nota é: " + aluno1.getMediaNota());
	    System.out.println("Resultado2: " + aluno1.getAlunoAprovado2());*/
	
		/* Equals e HashCode (Diferenciar e comparar os objetos */

		/*
		 * Aluno aluno1 = new Aluno(); aluno1.setNome("Gustavo");
		 * aluno1.setNumeroCpf("123");
		 * 
		 * /*Aluno aluno2 = new Aluno();
		 */
		/*
		 * aluno2.setNome("Gustavo"); aluno2.setNumeroCpf("1234");
		 */

		/*
		 * if(aluno1.equals(aluno2)) { System.out.println("Alunos são iguais"); }else {
		 * System.out.println("Alunos não são iguais"); }
		 */

	}

}
