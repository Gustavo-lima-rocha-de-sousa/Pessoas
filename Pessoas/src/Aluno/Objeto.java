package Aluno;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import curso.java.excecao.ExcecaoProcessarNota;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;

public class Objeto {
	public static void main(String[] args) { 
		
		try {
			lerArquivo();
		String login = JOptionPane.showInputDialog("Informe o Login");
		String senha = JOptionPane.showInputDialog("Informe a Senha");
						
		if(new FuncaoAutenticacao(new Diretor(login,senha)).autenticar()) { /*Travar o contrato para autorizar somente quem realmente tem o contrato 100% legitimo*/
		
		List<Aluno> alunos = new ArrayList<Aluno>();
			
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

		for (int qtd = 1; qtd <= 1; qtd++) {

			/* New Aluno é uma instancia (Criação de Objeto */

			/* aluno1 é uma referencia para o objeto aluno */

			String nome = JOptionPane.showInputDialog("Qual o nome do Aluno " + qtd + " ?");
			
			String idade = JOptionPane.showInputDialog("Qual a idade?");
			
			
			Aluno aluno1 = new Aluno(); 

			aluno1.setNome(nome);
			aluno1.setIdade(Integer.valueOf(idade));

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
			JOptionPane.showMessageDialog(null, "Acesso não permitido");
		}
	/* aqui*/
	}catch (Exception e) {
			
		StringBuilder saida = new StringBuilder();
		
			e.printStackTrace();/*Imprime o log no console*/
		
			for (int i = 0; i < e.getStackTrace(). length; i++) {
				saida.append("\n Classe de erro:" + e.getStackTrace()[i].getClassName());
				saida.append("\n Método de erro:" + e.getStackTrace()[i].getMethodName());
				saida.append("\n Linha de erro:" + e.getStackTrace()[i].getLineNumber());
				saida.append("\n Class:" + e.getStackTrace()[i].getClass().getName());
			}		
		JOptionPane.showMessageDialog(null, "Erro de conversão de número." + saida.toString() );
		
		}finally { /* Sempre é executado ocorrendo erros ou não. */
			JOptionPane.showMessageDialog(null, "Obrigado Por Aprender Java Com o Alex.");
			
		} 
	}
	public static void lerArquivo() throws FileNotFoundException {
		File fil = new File("c://lines.txt");
		Scanner scanner = new Scanner(fil);

}

}