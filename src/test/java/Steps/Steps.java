package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Metodos m = new  Metodos ();
	Elementos e = new Elementos();
	
	
	  @Given("^que acesse a url \"([^\"]*)\"$")
	public void que_o_acesse_a_url(String url) {
	   m.abrirNavegador(url);
		
	}

	  @When("^for exibido a tela home$")
	public void for_exibido_a_tela_home() {
	                        
	                                    
	}       
	  @Then("validar o texto Nossas soluções_")
	 public void validar_o_texto_nossas_soluções() throws InterruptedException {
		m.pausa(2000);
	    m.validarTexto(e.getTextoNossassoluções_(),"Nossas soluções_");
		m.fecharNavegador();
	}                                                            

	   @When("^selecionado o botao contato$")
	public void selecionado_o_botao_contato() throws InterruptedException {
	   m.clicar(e.getBtnConta());
	   m.pausa(2000);
		                                                  
	}                
        
	    @When("^preencher os campos contato$")
	public void preencher_os_campos_contato()  {
	    m.preencher(e.getCampoNome(),"William Francisco da Silva");
		m.preencher(e.getCampoEmail(),"ws8517415@gmail.com");
		m.preencher(e.getCampoTelefone(),"(74)9 9995-5530");
		m.preencher(e.getCampoDesafio()," Sou William, Analista de Qualidade, e gostaria de fazer parte do time da verity.");        
	}                                       

	   @When("^selecionar o checkbox$")
	public void selecionar_o_checkbox() {
	 m.clicar(e.getBtnCheckbox());
	}                           

	   @Then("^clicar no botao enviar$")
	public void clicar_no_botao_enviar() throws InterruptedException  {
	   m.clicar(e.getBtnEnviar());
	   m.fecharNavegador();
	}
                                      
}
