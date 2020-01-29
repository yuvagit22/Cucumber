package com.automationwebsitejunit2;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassB  {
	static WebDriver driver;
	//public static void main(String[] args) {
		@BeforeClass
		public static void beforeclass(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvi\\eclipse-workspace\\maven1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		}
		@Ignore	
		@Test
		public  void test() throws Throwable{
			Thread.sleep(2000);
			WebElement selectcountry = driver.findElement(By.xpath("//select[@id='countries']"));
			Select sel1 = new Select(selectcountry);
			sel1.selectByValue("India");
		}
		@Test
		public  void test1() throws Throwable{
			driver.findElement(By.xpath("//span[@class='select2-selection__arrow']")).click();
			WebElement selectCountry = driver.findElement(By.xpath("//input[@type='search']"));
			selectCountry.sendKeys("India");
			Robot r= new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			WebElement year = driver.findElement(By.xpath("//option[@value='1990']"));
			year.click();
			WebElement month = driver.findElement(By.xpath("//option[@value='October']"));
			month.click();
			WebElement day = driver.findElement(By.xpath("//option[@value='22']"));
			day.click();
			WebElement pass = driver.findElement(By.id("firstpassword"));
			pass.sendKeys("123465");
			WebElement conpass = driver.findElement(By.id("secondpassword"));
			conpass.sendKeys("123456");
		}
}
