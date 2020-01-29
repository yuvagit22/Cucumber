package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {
	WebDriver driver;
	@Given("user is on the Adactin page")
	public void user_is_on_the_Adactin_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\yuvi\\eclipse-workspace\\maven1\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://adactin.com/HotelApp/");
	    
	}

	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
	    driver.findElement(By.id("username")).sendKeys("hello");
	    driver.findElement(By.id("password")).sendKeys("world");
	}

	@Then("user should click the login button")
	public void user_should_click_the_login_button() {
	   driver.findElement(By.id("login")).click();
	}
}
