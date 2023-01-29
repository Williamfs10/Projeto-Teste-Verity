package Elementos;

import org.openqa.selenium.By;

public class Elementos {
                                             
	  private By btnConta = By.id("comp-kevyodnk5label");
	  private By campoNome = By.id("input_comp-kwz6tqej");
	  private By campoEmail = By.id("input_comp-kwz6tqf7");
	  private By campoTelefone = By.id("input_comp-kwz6tqfe");
	  private By campoDesafio = By.id("textarea_comp-kwz6tqfr");
	  private By btnCheckbox = By.id("comp-kwz6tqgp");
      private By btnEnviar = By.id("comp-kwz6tqhd");
	  private By textoNossassoluções_ = By.id("comp-kwv1yx4h");
	                                                                                                       
	 {
			                                                       
	}
	public By getTextoNossassoluções_() {
		return textoNossassoluções_;
	}
	
	public By getBtnConta() {
		return btnConta;
	}
	public void setBtnConta(By btnConta) {
		this.btnConta = btnConta;
	}
	public By getCampoNome() {
		return campoNome;
	}
	public By getCampoEmail() {
		return campoEmail;
	}
	public By getCampoTelefone() {
		return campoTelefone;
	}
	public By getCampoDesafio() {
		return campoDesafio;
	}
	public By getBtnCheckbox() {
		return btnCheckbox;
	}
	public By getBtnEnviar() {
		return btnEnviar;
	}
}
