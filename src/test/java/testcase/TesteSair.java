package testcase;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import page.MenuPage;

import common.TestCaseCommon;

public class TesteSair {
	
	
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
			TestCaseCommon.getDriver().quit();
	  }
}
