package SelePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	private static final String JavascriptExecutor = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com//");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='gh-ac']")).sendKeys("iphone");
		driver.findElement(By.cssSelector("input#gh-btn")).click();
		JavascriptExecutor js=( JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,1000)");
		
		
		
		
	}

}
