package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoWeb2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		WebElement electronics=driver.findElement(By.xpath("(//a[@href='/electronics'])[1]"));
		action.moveToElement(electronics).build().perform();
		
		
		WebElement camera=driver.findElement(By.xpath("(//a[@href='/camera-photo'])[1]"));
		action.moveToElement(camera).click().perform();		
		//driver.close();
	}

}
