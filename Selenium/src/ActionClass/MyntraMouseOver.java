package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraMouseOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		Actions action = new Actions(driver);
		WebElement men=driver.findElement(By.xpath("(//a[@class='desktop-main'])[2]"));
		action.moveToElement(men).build().perform();
		
		WebElement kurtas=driver.findElement(By.xpath("//a[contains(text(),'Kurtas & Suits')]"));
		action.moveToElement(kurtas).click().perform();
		//driver.close();
	}

}
