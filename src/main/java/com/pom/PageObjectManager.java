package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {

	public static WebDriver driver; // null driver

	public PageObjectManager(WebDriver a) {
		this.driver = a;
	}

	public static Login_Page getLogin_Page() {

		Login_Page lp = new Login_Page(driver);
		return lp;
	}

}
