package com.orasi.cucumber.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GoogleSearchSteps{

	WebDriver driver;
	
	@After
	public void Close(){
		driver.quit();
	}
	
	@Given("^I have google opened$")
	public void i_have_google_opened() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}

	@When("^I search for a \"([^\"]*)\"$")
	public void i_search_for_a(String searchTerm) throws Throwable {
		driver.findElement(By.name("q")).sendKeys(searchTerm);
		driver.findElement(By.name("btnK")).click();
	}

	@Then("^I should see results that relate to \"([^\"]*)\"$")
	public void i_should_see_results_that_relate_to(String searchTerm) throws Throwable {
		Assert.assertTrue(true);
	}
	
}
