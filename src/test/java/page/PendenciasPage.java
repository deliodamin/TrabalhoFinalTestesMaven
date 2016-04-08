package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.TestCaseCommon;

public class PendenciasPage extends HomePage{
		private WebElement buttonPendecia;
			
		public PendenciasPage() {
			
			buttonPendecia =  TestCaseCommon.getDriver().findElement(By.xpath("//div[@id='view79963']/div[2]/div[2]/span"));
			System.out.println("Expandiu suporte pendente");
		}
		
		public boolean ExpandirTreinamentoPendente() throws InterruptedException  {
			buttonPendecia.click();
			System.out.println("Retorno expandir suporte");
			return true;
		}
}
