package curso.java.excecao;

import javax.swing.JOptionPane;

import Aluno.Aluno;
import Aluno.Disciplina;

public class ArrayVetor {
	
	/*Usado para executar código*/
	public static void main(String[] args) {
		double[] notas = {8.8,9.7,7.6,6.8};
		double[] notaLogica = {7.1,5.7,9.6,7.8};
		
		Aluno aluno = new Aluno();
		aluno.setNome("Gustavo Lima Rocha de Sousa");
		aluno.setNomeEscola("Jdev Treinamento");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Logica de Programação");
		disciplina2.setNota(notaLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Gustavo Lima Rocha de Sousa 2");
		aluno2.setNomeEscola("Jdev Treinamento2 ");
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Curso Java 2");
		disciplina3.setNota(notas);
		
		aluno2.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Logica de Programação 2 ");
		disciplina4.setNota(notaLogica);
		
		aluno2.getDisciplinas().add(disciplina4);
		
		
		
		//------------------------------------------------
	
		Aluno[] arrayAlunos = new Aluno[2];
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;
		
		for (int pos = 0; pos < arrayAlunos.length; pos++) {	
			
			System.out.println("Nome do Aluno é: " + arrayAlunos[pos].getNome());
			
			for (Disciplina disci : arrayAlunos[pos].getDisciplinas()) {
				
				System.out.println("Nome da Disciplina é: " + disci.getDisciplina() );
				
				for (int posnota = 0; posnota < disci.getNota().length; posnota++ ) {
				
					System.out.println("A nota número: " + posnota + " é igual a: " + disci.getNota()[posnota]);	
					
						}
					}
				}
			
			}
		}		
		
	
	