package testcase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import page.MenuPage;

import common.TestCaseCommon;

public class TesteSair {
	
	private StringBuffer verificationErrors = new StringBuffer();
	
	@Before
	public void setUp() throws Exception {
		TestCaseCommon.getDriver().get(TestCaseCommon.URL_BASE + "/");
	}

	
	 @Test
	  public void verificaAcessoMenuBotaoSair() throws Exception {
		  
		// Login
//			LoginPage loginPage = new LoginPage();
//			assertEquals("SCRM", loginPage.getTitle());
//			loginPage.Login("delio", "ADM66@*29");
//			
			MenuPage SairApp = new MenuPage();
			SairApp.setObjetos();
			ArrayList<String> RetornoDeObjetos = SairApp.getObjetos();
			System.out.println(RetornoDeObjetos.get(0));
		    assertEquals("Sair", RetornoDeObjetos.get(0));
		    SairApp.FecharBrowser();
	  }
	 
	 @After
		public void tearDown() throws Exception {


			String verificationErrorString = verificationErrors.toString();
			if (!"".equals(verificationErrorString)) {
				fail(verificationErrorString);
			}
			TestCaseCommon.getDriver().close();
		}
	 
	 
}
