package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MonsterIndia {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("wzrk-confirm")).click();
		
		Actions action = new Actions(driver);
		WebElement jobsearch=driver.findElement(By.xpath("(//a[@class='main-nav-link'])[2]"));
		action.moveToElement(jobsearch).build().perform();
		
		Actions action1 = new Actions(driver);
		WebElement jobsbyskills=driver.findElement(By.xpath("//a[text()='Jobs by Skills']"));
		action1.moveToElement(jobsbyskills).build().perform();
		
		WebElement javajobs=driver.findElement(By.xpath("//a[text()='Java Jobs']"));
		action.moveToElement(javajobs).click().perform();		
		//driver.close();
	}

}
