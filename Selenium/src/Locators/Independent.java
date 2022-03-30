package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Independent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		//driver.findElement(By.xpath("//a[contains(text(),'3rd Album')]/../..//input[@type='button']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Build your own computer')]/../../..//input[@value='Add to cart']")).click();
	}

}
