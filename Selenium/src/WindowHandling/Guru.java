package WindowHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("abc123");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		Alert web=driver.switchTo().alert();
		web.accept();
		driver.close();
	}

}
