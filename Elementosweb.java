package elementos;

import org.openqa.selenium.By;

public class Elementosweb {

	private By BarraPesquisa = By.xpath("//*[@id=\"searchBar\"]");
	private By Resultado = By.xpath("//*[@id=\"WhiteBox\"]/div[1]/div[2]/div/div/div/div/div/div/a/div[2]");
	private By Choice = By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div[2]/div/div[1]/div/div[1]/div/div[2]/a[1]/div");
    private By Nome = By.xpath("//*[@id=\"SendProposal\"]/div/div/div/div/form/div/div[1]/input");
    private By Email = By.xpath("//*[@id=\"SendProposal\"]/div/div/div/div/form/div/div[2]/input");
    private By Telefone = By.xpath("//*[@id=\"SendProposal\"]/div/div/div/div/form/div/div[3]/input");
    private By Msg = By.xpath("//*[@id=\"SendProposal\"]/div/div/div/div/form/div/div[4]/textarea");
    private By Button = By.xpath("//*[@id=\"ButtonSendProposal\"]");
    private By Close = By.xpath("//*[@id=\"root\"]/div[4]/div[2]/div/div[3]/button");
    
    
	public By getBarraPesquisa() {
		return BarraPesquisa;
	}

	public By getResultado() {
		return Resultado;
	}

	public By getChoice() {
		return Choice;
	}

	public By getNome() {
		return Nome;
	}

	public By getEmail() {
		return Email;
	}

	public By getTelefone() {
		return Telefone;
	}

	public By getMsg() {
		return Msg;
	}

	public By getButton() {
		return Button;
	}

	public By getClose() {
		return Close;
	}




}
