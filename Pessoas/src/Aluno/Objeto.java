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
		
		

		Aluno aluno1 = new Aluno(); /* Aqui será o João */

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

	
	/*Lista*/
	Disciplina disciplina1 = new Disciplina();
	disciplina1.setDisciplina("Banco de dados");
	disciplina1.setNota(90);
	
	aluno1.getDisciplinas().add(disciplina1);

	Disciplina disciplina2 = new Disciplina();
	disciplina2.setDisciplina("Matematica");
	disciplina2.setNota(90);
	
	aluno1.getDisciplinas().add(disciplina2);
	
	Disciplina disciplina3 = new Disciplina();
	disciplina3.setDisciplina("Geografia");
	disciplina3.setNota(97);
	
	aluno1.getDisciplinas().add(disciplina3);
	
	Disciplina disciplina4 = new Disciplina();
	disciplina4.setDisciplina("Java Web");
	disciplina4.setNota(70);
	
	aluno1.getDisciplinas().add(disciplina4);
	
	System.out.println(aluno1); /*Discrição do objeto na memoria */
	System.out.println("A media de nota é: " + aluno1.getMediaNota());
	System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
	}
}