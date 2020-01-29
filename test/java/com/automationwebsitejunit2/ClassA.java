package com.automationwebsitejunit2;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClassA {

		static WebDriver driver;
		//public static void main(String[] args) {
			@BeforeClass
			public static void beforeclass(){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvi\\eclipse-workspace\\maven1\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Register.html");
			}
			
			@Test
			public  void test() throws Throwable{
				WebElement firstname = driver.findElement(By.xpath("//input[@type='text']"));
				firstname.sendKeys("raj");
				//assert.assertEquals("Verify Firstname","Raj",firstname.getAttribute("value");
				WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
				lastname.sendKeys("sam");
				WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
				address.sendKeys("no3 , gandhi street , chennai");
				WebElement emailadd = driver.findElement(By.xpath("//input[@type='email']"));
				emailadd.sendKeys("abc123@gmail.com");
				WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
				phone.sendKeys("9876543210");
				WebElement gender = driver.findElement(By.xpath("//input[@type='radio']"));
				gender.click();
				WebElement hobbies = driver.findElement(By.xpath("//input[@type='checkbox']"));
				hobbies.click();
				driver.findElement(By.xpath("//div[@class='ui-autocomplete-multiselect ui-state-default ui-widget']")).click();
				WebElement languages = driver.findElement(By.xpath("//a[text()='English']"));
				languages.click();
				WebElement skill = driver.findElement(By.xpath("//select[@id='Skills']"));
				Select sel = new Select(skill);
				sel.selectByValue("Windows");
				skill.click();
				WebElement country = driver.findElement(By.xpath("//option[@value='India']"));
				country.click();
		}
			

}
