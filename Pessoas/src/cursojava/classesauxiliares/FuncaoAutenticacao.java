package cursojava.classesauxiliares;

import Interfaces.PermitirAcesso;

/*Realmente e somente receber alguem que tem o contrato da interface de PermitirAcesso e chamar o autenticador*/
public class FuncaoAutenticacao {

	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
	}
	
public FuncaoAutenticacao(PermitirAcesso acesso) {
	this.permitirAcesso = acesso;
	}
}