package Solid;

public class TesteConta {

	public static void main (String[] args ) { 	

	ContaBancaria bancaria = new ContaBancaria();
	bancaria.setDescricao("Conta Bancaria do Gustavo");
	
	System.out.println(bancaria);
	
	bancaria.menos100Reais();
	System.out.println(bancaria);
	
	bancaria.sacarDinheiro(500);
	System.out.println(bancaria);
	
	bancaria.depositoDinheiro(1000);
	System.out.println(bancaria);
	
	bancaria.soma100Reais();
	System.out.println(bancaria);
	
	}	
}