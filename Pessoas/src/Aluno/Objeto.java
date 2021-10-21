package Aluno;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Objeto {
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for(int qtd = 1; qtd <=2; qtd++) {
		
		/* New Aluno � uma instancia (Cria��o de Objeto */
		
		/* aluno1 � uma referencia para o objeto aluno */

		String nome = JOptionPane.showInputDialog("Qual o nome do Aluno "+qtd+" ?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Data de nascimento?");
		String registroGeral = JOptionPane.showInputDialog("Qual seu RG?");
		String Cpf = JOptionPane.showInputDialog("Qual seu CPF?");
		String NomeMae = JOptionPane.showInputDialog("Qual nome da sua m�e");
		String NomePai = JOptionPane.showInputDialog("Qual nome da sua pai");
		String DataMatricula = JOptionPane.showInputDialog("Quando foi matriculado?");
		String SerieMatriculado = JOptionPane.showInputDialog("Qual sua serie?");
		String NomeEscola = JOptionPane.showInputDialog("Qual nome da escola?");*/
		
		

		Aluno aluno1 = new Aluno(); /* Aqui ser� o Jo�o */

		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(registroGeral);
		aluno1.setNumeroCpf(Cpf);
		aluno1.setNomeMae(NomeMae);
		aluno1.setNomePai(NomePai);
		aluno1.setDataMatricula(DataMatricula);
		aluno1.setSerieMatriculado(SerieMatriculado);
		aluno1.setNomeEscola(NomeEscola);*/
	
		/*Lista de diciplinas*/
	for (int pos = 1; pos <=4; pos++) {
		String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina "+pos+" ?");
		String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina "+pos+" ?");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina(nomeDisciplina);
		disciplina.setNota(Double.valueOf(notaDisciplina));
		
		aluno1.getDisciplinas().add(disciplina);
	}
	
	int escolha = JOptionPane.showConfirmDialog(null,"Deseja Remover alguma Disciplina?");
	
	if(escolha == 0) { /*Op Sim = 0*/
		
		int continuarRemover = 0;
		int posicao = 1;
		while (continuarRemover ==0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a Disciplina 1, 2, 3 ou 4?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
			posicao ++;
			continuarRemover = JOptionPane.showConfirmDialog(null,"Continuar a Remover?");
		}
	}	
	alunos.add(aluno1);
}	
	for (Aluno aluno : alunos) {
		
		if( aluno.getNome().equalsIgnoreCase("Alex")) {
			
			alunos.remove(aluno);
			break;
	     }else {
				System.out.println(aluno); /*Discri��o do objeto na memoria */
				System.out.println("A media de nota �: " + aluno.getMediaNota());
				System.out.println("Resultado = " + aluno.getAlunoAprovado2());
				System.out.println("____________------_________");
			}
		}

	for (Aluno aluno : alunos) {
		System.out.println("Alunos que sobraram na lista");
		System.out.println(aluno.getNome());
		System.out.println("Suas Materias s�o");
		
		for (Disciplina disciplina : aluno.getDisciplinas()) {
			System.out.println(disciplina.getDisciplina());
			}
		}
	}	
}