package cursojava.classesauxiliares;

import cursojava.classes.PermitirAcesso;

public class FuncaoAtenticacao {
	
	private PermitirAcesso permitirAcesso;
	
	public boolean autenticar() {
		return permitirAcesso.autenticar();
		
	}
	
	public FuncaoAtenticacao(PermitirAcesso acesso) {
		this.permitirAcesso= acesso;
	}

}
