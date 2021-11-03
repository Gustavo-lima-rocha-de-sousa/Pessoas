package Aluno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.constantes.StatusAluno;

public class Objeto {
	public static void main(String[] args) {

		String login = JOptionPane.showInputDialog("Informe o Login");
		String senha = JOptionPane.showInputDialog("Informe a Senha");
		
		Secretario secretario = new Secretario();
		secretario.setLogin(login);
		secretario.setSenha(senha);
		
		if(secretario.autenticar()) { /*se TRUE acesse se FALSE não acessa*/
		
		
		if(login.equalsIgnoreCase("admin") &&
				senha.equalsIgnoreCase("admin")){
		
	
			
		List<Aluno> alunos = new ArrayList<Aluno>();

		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

		for (int qtd = 1; qtd <= 5; qtd++) {

			/* New Aluno é uma instancia (Criação de Objeto */

			/* aluno1 é uma referencia para o objeto aluno */

			String nome = JOptionPane.showInputDialog("Qual o nome do Aluno " + qtd + " ?");
			/*
			 * String idade = JOptionPane.showInputDialog("Qual a idade?"); String
			 * dataNascimento = JOptionPane.showInputDialog("Data de nascimento?"); String
			 * registroGeral = JOptionPane.showInputDialog("Qual seu RG?"); String Cpf =
			 * JOptionPane.showInputDialog("Qual seu CPF?"); String NomeMae =
			 * JOptionPane.showInputDialog("Qual nome da sua mãe"); String NomePai =
			 * JOptionPane.showInputDialog("Qual nome da sua pai"); String DataMatricula =
			 * JOptionPane.showInputDialog("Quando foi matriculado?"); String
			 * SerieMatriculado = JOptionPane.showInputDialog("Qual sua serie?"); String
			 * NomeEscola = JOptionPane.showInputDialog("Qual nome da escola?");
			 */

			Aluno aluno1 = new Aluno(); /* Aqui será o João */

			aluno1.setNome(nome);
			/*
			 * aluno1.setIdade(Integer.valueOf(idade));
			 * aluno1.setDataNascimento(dataNascimento);
			 * aluno1.setRegistroGeral(registroGeral); aluno1.setNumeroCpf(Cpf);
			 * aluno1.setNomeMae(NomeMae); aluno1.setNomePai(NomePai);
			 * aluno1.setDataMatricula(DataMatricula);
			 * aluno1.setSerieMatriculado(SerieMatriculado);
			 * aluno1.setNomeEscola(NomeEscola);
			 */

			/* Lista de diciplinas */
			for (int pos = 1; pos <= 1; pos++) {
				String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina " + pos + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina " + pos + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno1.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja Remover alguma Disciplina?");

			if (escolha == 0) { /* Op Sim = 0 */

				int continuarRemover = 0;
				int posicao = 1;
				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a Disciplina 1, 2, 3 ou 4?");
					aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;
					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a Remover?");
				}
			}
			alunos.add(aluno1);
		}
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		
		for (Aluno aluno : alunos) {
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);

			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				maps.get(StatusAluno.RECUPERACAO).add(aluno);

			} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				maps.get(StatusAluno.REPROVADO).add(aluno);
			}
		}

		System.out.println("------->Lista Aprovados<-----------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)){
			System.out.println(aluno.getNome() + " Resultado: " + aluno.getAlunoAprovado2() + " Com media de: "
					+ aluno.getMediaNota());
		}

		System.out.println("------->Lista Recuperação<-----------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
			System.out.println(aluno.getNome() + " Resultado: " + aluno.getAlunoAprovado2() + " Com media de: "
					+ aluno.getMediaNota());
		}

		System.out.println("------->Lista Reprovados<-----------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println(aluno.getNome() + " Resultado: " + aluno.getAlunoAprovado2() + " Com media de: "
					+ aluno.getMediaNota());
			}
		}else {
			JOptionPane.showConfirmDialog(null, "Acesso Não Permitido");
		}
		
	}
}
}
