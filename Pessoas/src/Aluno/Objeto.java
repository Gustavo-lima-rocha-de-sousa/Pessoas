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
	for (int pos = 1; pos <=4; pos++) {
		String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina "+pos+" ?");
		String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina "+pos+" ?");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina(nomeDisciplina);
		disciplina.setNota(Double.valueOf(notaDisciplina));
		
		aluno1.getDisciplinas().add(disciplina);
	}
	
	int escolha = JOptionPane.showConfirmDialog(null,"Deseja Remover alguma Disciplina?");
	
	if(escolha == 0) {
		String disciplinaRemover = JOptionPane.showInputDialog("Qual a Disciplina 1, 2, 3 ou 4?");
		aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
	}
	System.out.println(aluno1); /*Discrição do objeto na memoria */
	System.out.println("A media de nota é: " + aluno1.getMediaNota());
	System.out.println("Resultado = " + aluno1.getAlunoAprovado2());

	}
}