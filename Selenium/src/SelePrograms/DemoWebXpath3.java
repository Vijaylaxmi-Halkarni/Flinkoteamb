package SelePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebXpath3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Apparel & Shoes")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.linkText("Shopping cart")).click();
	    driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
	    driver.findElement(By.xpath("//button[@id='checkout']")).click();
		
		
		//driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		
	
	}

}
