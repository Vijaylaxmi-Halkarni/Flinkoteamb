package WindowHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement button=driver.findElement(By.xpath("//button[@id='alertBox']"));
		Thread.sleep(2000);
		action.doubleClick(button).perform();
		Thread.sleep(2000);
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		}

}
