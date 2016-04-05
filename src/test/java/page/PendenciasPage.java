package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.TestCaseCommon;

public class PendenciasPage extends HomePage{
		private WebElement buttonPendecia;
			
		public PendenciasPage() {
			
			buttonPendecia =  TestCaseCommon.getDriver().findElement(By.xpath("//div[@id='view80079']/div[2]/div[2]/span"));
			System.out.println("Expandiu suporte pendente");
		}
		
		public String ExpandirTreinamentoPendente()  {
			buttonPendecia.click();
			return TestCaseCommon.getDriver().findElement(By.xpath("//form[@id='formMostraSuporte']/fieldset/fieldset/div/label")).getText();
		}
}
