package WindowHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@id='iFrame']")).click();
		Thread.sleep(2000);
		/*driver.switchTo().frame((WebElement) By.xpath("//iframe[@name='google_esf']"));
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='s'])[1]")).sendKeys("hello");
		Thread.sleep(4000);*/
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='globalSqa']")));
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//input[@id='s'])[1]")).sendKeys("hello");
		Thread.sleep(2000);
		
		Actions web=new Actions(driver);
		WebElement all=driver.findElement(By.xpath("//span[@id='current_filter']"));
		web.moveToElement(all).perform();
		
		WebElement automation=driver.findElement(By.xpath("//div[text()='Automation']"));
		web.moveToElement(automation).click().perform();
		
		
	}

}
/*driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[@id='google_esf']")));
Thread.sleep(4000);

driver.findElement(By.xpath("(//input[@id='s'])[1]")).sendKeys("hello");
Thread.sleep(2000);*/