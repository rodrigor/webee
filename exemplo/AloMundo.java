package exemplo;

import org.ayty.webee.*;

public class AloMundo extends Acao {

	protected void configurar(){
		this.setMetodoHttp(MetodoHttp.GET);
		this.exigeLogin(true);
	}

	protected void executar(Requisicao req, Resposta resp){
		String nome = req.getParametro("nome");
		resp.setTituloResposta("Alo Mundo!");
		resp.println("Alo "+nome+"!");
	}


}
