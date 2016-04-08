package page;

//
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.TestCaseCommon;



public class MenuPage  extends HomePage{

	private WebElement buttonBusca;
	private WebElement buttonBuscarSuporte;
	private WebElement inputFieldName;
	private WebElement buttonPesquisar;
	private WebElement ResultadoBusca;
	private WebElement buttonSair;
	private ArrayList<String> listobject;
	private WebElement buttonConfiguracoes; 
	private WebElement buttonAdmin;
	private WebElement buttonElipseCare;
	private WebElement buttonTreinamentos;
	private WebElement buttonMailTreinamentos;
	private WebElement buttonPendencia;
	private WebElement buttonCalendario; 
	
	
	
	public MenuPage()  {
		System.out.println("ConteudoPesquisa");
		buttonBusca = TestCaseCommon.getDriver().findElement(By.xpath("(//a[@id='suporteA']/div)[3]"));
	    buttonBuscarSuporte = TestCaseCommon.getDriver().findElement(By.cssSelector("#buscaA > div"));
	    buttonSair = TestCaseCommon.getDriver().findElement(By.xpath("(//a[@id='buscaA']/div)[2]"));
	    buttonElipseCare = TestCaseCommon.getDriver().findElement(By.xpath("(//a[@id='suporteA']/div)[2]"));
	    buttonTreinamentos = TestCaseCommon.getDriver().findElement(By.xpath("(//a[@id='suporteA']/div)[3]"));
	    buttonConfiguracoes = TestCaseCommon.getDriver().findElement(By.cssSelector("span.icon-gear391"));
	    buttonAdmin = TestCaseCommon.getDriver().findElement(By.xpath("//div[@id='cssmenu']/ul/li[2]/a/span"));
	    buttonMailTreinamentos = TestCaseCommon.getDriver().findElement(By.xpath("(//a[@id='suporteA']/div)[4]"));
	    buttonPendencia = TestCaseCommon.getDriver().findElement(By.xpath("//a[@id='PendenciasA']/div"));
	    buttonCalendario = TestCaseCommon.getDriver().findElement(By.cssSelector("span.icon-calendar1461"));
	}
	
	public void setObjetos() {
	        listobject = new ArrayList<String>();
	        listobject.add(buttonSair.getText());
	        listobject.add(buttonElipseCare.getText());
	        listobject.add(buttonTreinamentos.getText());
	        listobject.add(buttonMailTreinamentos.getText());
	}
	 
	public ArrayList<String> getObjetos(){
		return listobject;
	}
	

	public WebElement getResultadoBusca() {
		return ResultadoBusca;
	}

	public void setResultadoBusca(WebElement ResultadoBusca) {
		this.ResultadoBusca = ResultadoBusca;
	}
	
	public WebElement getbuttonBusca() {
		return buttonBusca;
	}

	public void setgetbuttonBusca(WebElement buttonBusca) {
		this.buttonBusca = buttonBusca;
	}

	public WebElement getinputFieldName() {
		return inputFieldName;
	}

	public void setinputFieldName(WebElement inputFieldName) {
		this.inputFieldName = inputFieldName;
	}

	public WebElement getButtonPesquisar() {
		return buttonPesquisar;
	}

	public void setButtonPesquisar(WebElement buttonPesquisar) {
		this.buttonPesquisar = buttonPesquisar;
	}
	
	
	
	public String verificaAcessoAdmin() {
	return buttonAdmin.getText();
	}
	
	public void AbreTelaAdmin() {
		buttonAdmin.click();
		}

	public void AbreTelaTreinamento() {
		buttonBusca.click(); // WebElement
	}

	public void AbreTelaBuscarSuportes() {
		buttonBuscarSuporte.click();
	}
	
	public void AbreTelaConfiguracoes() {
		buttonConfiguracoes.click();
	}
	
	public void AbreTelaPendencias() {
		buttonPendencia.click();
	}
	
	public Boolean ChamaCalendario(){
		buttonCalendario.click();
		return true;
		
	}

	public void FecharBrowser() {
		buttonSair.click();
	}
	
	
	
	
}
