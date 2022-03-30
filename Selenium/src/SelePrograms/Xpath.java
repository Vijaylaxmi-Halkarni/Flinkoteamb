package SelePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/");
driver.manage().window().maximize();
driver.findElement(By.linkText("Register")).click();
driver.findElement(By.xpath("//input[@id='gender-female']")).click();
driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("abc");
driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("h");
driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("halkarnihalkarni@gmail.com");
driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123Pass@");
driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123Pass@");
driver.findElement(By.xpath("//input[@id='register-button']")).click();

	}

}
//input[@id='gender-female']   //input[@id='FirstName']   