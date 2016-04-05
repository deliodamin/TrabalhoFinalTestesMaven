package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.TestCaseCommon;



public class BuscarSuportesPage {  
	private WebElement buttonPesquisar;
	private WebElement ResultadoBusca;
	
	public BuscarSuportesPage() {
		
	
		buttonPesquisar = TestCaseCommon.getDriver().findElement(By.cssSelector("input.botao.submit"));
		ResultadoBusca = TestCaseCommon.getDriver().findElement(By.cssSelector("b"));
		
	}
	
	public String BuscarTreinamentoPorNomeDelio()  {
		
		    new Select(TestCaseCommon.getDriver().findElement(By.id("usuario"))).selectByVisibleText("Délio Livir da Silva Damin");
		    buttonPesquisar.click();
		    return  ResultadoBusca.getText();
	}
}
