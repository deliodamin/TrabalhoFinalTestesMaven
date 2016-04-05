package page;

import common.TestCaseCommon;

public class HomePage {

	String title;
	
	public HomePage() {
		
		title = TestCaseCommon.getDriver().getTitle();
		
	}

	public String getTitle() {
		System.out.println(title);
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
