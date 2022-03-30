package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentExplicit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@role='button'])[2]")));
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='u_2_b_5w']")).sendKeys("abc");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("xyz");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9876543210");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Password@123");
	}

}
