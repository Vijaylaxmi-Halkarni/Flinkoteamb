package SelePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("https://www.flipkart.com/account/login?ret=/")).click();
		driver.findElement(By.className("VJZDxU")).sendKeys("vijuhalkarni@gmail.com");
		driver.findElement(By.className("_3mctLh VJZDxU")).sendKeys("123d@Passwor");
		driver.findElement(By.className("_2HKlqd _3AWRsL")).click();
		
	}

}
