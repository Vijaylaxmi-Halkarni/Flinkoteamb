package WindowHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.switchTo().frame("")
		
		//Actions action = new Actions(driver);
		//action.sendKeys(Keys.PAGE_DOWN).perform();
		//action.sendKeys(Keys.PAGE_DOWN).perform();
		//driver.findElement(By.xpath("//input[@type='file']")).sendKeys("Documents.xlsx");
		
	}

}
