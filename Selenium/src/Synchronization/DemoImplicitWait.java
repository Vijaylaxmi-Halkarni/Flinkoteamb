package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("abb");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("h");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("bbbvvc@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("abb@123Z");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("abb@123Z");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}

}
