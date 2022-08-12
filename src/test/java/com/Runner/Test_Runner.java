package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseClass.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature",glue = "com\\StepDefinition")
public class Test_Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {
		driver = Baseclass.brwoser_Launch("chrome");
		

		
	
		

	}
	
	@AfterClass
	public static void tearDown() {
		
		//Baseclass.closed();
		

}
	
}



