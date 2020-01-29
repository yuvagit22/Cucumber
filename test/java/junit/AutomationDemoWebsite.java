package junit;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationDemoWebsite {
	static WebDriver driver;
	//public static void main(String[] args) {
		@BeforeClass
		public static void beforeclass(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\yuvi\\eclipse-workspace\\maven1\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		}
		@Before
		public  void before(){
			Date date = new Date();
			System.out.println(date);
		}
	
		@Test
		public  void test() throws Throwable{
			WebElement firstname = driver.findElement(By.xpath("//input[@type='text']"));
			firstname.sendKeys("raj");
			Assert.assertEquals("Verify Firstname","raj",firstname.getAttribute("value"));
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
			Thread.sleep(2000);
			WebElement selectcountry = driver.findElement(By.xpath("//select[@id='countries']"));
			Select sel1 = new Select(selectcountry);
			sel1.selectByValue("India");
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
		@After
		public  void after(){
			Date date = new Date();
			System.out.println(date);
}
}