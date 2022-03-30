package SelePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdAndClassCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a.ico-register")).click();
		driver.findElement(By.cssSelector("input#gender-female")).click();
		driver.findElement(By.cssSelector("input#FirstName")).sendKeys("Vijaylaxmi");
		driver.findElement(By.cssSelector("input#LastName")).sendKeys("h");
		driver.findElement(By.cssSelector("input#Email")).sendKeys("halkarnivi@gmail.com");
		driver.findElement(By.cssSelector("input#Password")).sendKeys("123@Pass");
		driver.findElement(By.cssSelector("input#ConfirmPassword")).sendKeys("123@Pass");
	    driver.findElement(By.cssSelector("input#register-button")).click();
	}

}
