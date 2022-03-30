package SelePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	 driver.findElement(By.cssSelector("input[type='text']")).sendKeys("laptop");
	 driver.findElement(By.cssSelector("input[class='button-1 search-box-button']")).click();
	 JavascriptExecutor js=( JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,300)");
	}

}
