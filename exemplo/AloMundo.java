package exemplo;

import org.ayty.webee.*

public class Login extends Acao{
	
	protected void configurar(){
		this.setMetodo(Metodo.GET);
		this.exigeLogin(false);
	}
	
	protected void executar(Requisicao requisicao, Resposta resposta){
		String nome = requisicao.getParametro("nome");
		resposta.println("Alo "+nome+"!");
	}

}
