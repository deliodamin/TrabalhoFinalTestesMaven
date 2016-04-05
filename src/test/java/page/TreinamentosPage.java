package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.TestCaseCommon;



public class TreinamentosPage  extends HomePage{
	//private WebElement buttonBusca;
	private WebElement inputFieldName;
	private WebElement buttonPesquisar;
	private WebElement ResultadoBusca;
	
	public TreinamentosPage()	{
		
		buttonPesquisar = TestCaseCommon.getDriver().findElement(By.cssSelector("input.botao.submit"));
		inputFieldName = TestCaseCommon.getDriver().findElement(By.id("nome"));
		ResultadoBusca = TestCaseCommon.getDriver().findElement(By.xpath("//span[@id='EmpEncontradas']/b"));
		
	
	}

	public WebElement getResultadoBusca() {
		return ResultadoBusca;
	}

	public void setResultadoBusca(WebElement resultadoBusca) {
		ResultadoBusca = resultadoBusca;
	}

	public WebElement getButtonPesquisar() {
		return buttonPesquisar;
	}

	public void setButtonPesquisar(WebElement buttonPesquisar) {
		this.buttonPesquisar = buttonPesquisar;
	}

	public WebElement getInputFieldName() {
		return inputFieldName;
	}

	public void setInputFieldName(WebElement inputFieldName) {
		this.inputFieldName = inputFieldName;
	}
	
	public String BuscarTreinamento(String ConteudoPesquisa)  {
	inputFieldName.clear();
	//System.out.println(ConteudoPesquisa);
	inputFieldName.sendKeys(ConteudoPesquisa);
	buttonPesquisar.click();
	System.out.println(	TestCaseCommon.getDriver().findElement(By.xpath("//span[@id='EmpEncontradas']/b")).getText());
	return TestCaseCommon.getDriver().findElement(By.xpath("//span[@id='EmpEncontradas']/b")).getText();
	}
}

