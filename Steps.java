package steps;

import elementos.Elementosweb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodosweb;

public class Steps {

	Metodosweb metodos = new Metodosweb();
	Elementosweb el = new Elementosweb();

	@Given("Que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String string) {
		metodos.openBrowser(string);
		metodos.digitar("HONDA CIVIC", el.getBarraPesquisa());
		metodos.espera(el.getBarraPesquisa());
		metodos.click(el.getResultado());
	    metodos.espera(el.getResultado());
	    metodos.espera(el.getChoice());
	    metodos.click(el.getChoice());
	    metodos.espera02(el.getChoice());
	    metodos.click(el.getClose());
	    metodos.digitar("Iron Man", el.getNome());
	    metodos.digitar("ironman123@hotmail.com", el.getEmail());
	    metodos.digitar("(62) 96045-7050", el.getTelefone());
	    metodos.digitar("Let`s go ", el.getMsg());
	    metodos.click(el.getButton());
	    metodos.espera(el.getButton());
	    metodos.takePrint("CT01 - PESQUISA VEICULO E CONTATO COM VENDEDOR");
	
	}

	@When("Eu preencher o nome do {string}")
	public void eu_preencher_o_nome_do(String string) {
		
	}

	@Then("Visualizo as informacoes do veiculo pesquisado e campos para envio de msg para vendedor")
	public void visualizo_as_informacoes_do_veiculo_pesquisado_e_campos_para_envio_de_msg_para_vendedor() {
		
	}
}
