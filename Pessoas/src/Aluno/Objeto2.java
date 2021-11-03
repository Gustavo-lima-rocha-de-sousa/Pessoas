package Aluno;

public class Objeto2 {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setNome("Gustavo Lima - Você é de mais");
		aluno.setNomeEscola("Jdev");
		aluno.setIdade(22);
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("55568894");
		diretor.setNome("Alex");
		diretor.setIdade(50);				
		
		
		Secretario secretario = new Secretario();
		secretario.setNome("Joao");
		secretario.setExperiencia("Administração");
		secretario.setRegistroGeral("569874216");
		secretario.setIdade(18);
		
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		System.out.println (aluno.pessoaMaiorIdade() + " - " + aluno.msgMaiorIdade() );
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
	
		System.out.println("Salario Do Aluno: " + aluno.salario());
		System.out.println("Salario Do Diretor: " + diretor.salario());
		System.out.println("Salario Do Secretario: " + secretario.salario());
		
		teste(aluno);
		teste(diretor);
		teste(secretario);
	}
	
	public static void teste(Pessoa pessoa) {
	
		System.out.println("Essa pessoa é de mais: " + pessoa.getNome() + 
				" e o salário é de: " + pessoa.salario());
		
	}
}