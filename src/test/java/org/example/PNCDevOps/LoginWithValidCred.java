package org.example.PNCDevOps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;

public class LoginWithValidCred {
	
	private WebDriver driver;
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\shm\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
	}

	@When("^user enters valid credentials$")
	public void user_enters_valid_credentials()  {
		driver.findElement(By.name("userName")).sendKeys("invalidUN");
		driver.findElement(By.name("password")).sendKeys("invalidPW");
		driver.findElement(By.name("login")).click();
	}

	@Then("^user is successfully logged in$")
	public void user_is_successfully_logged_in() {
		Assert.assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
	}
}
