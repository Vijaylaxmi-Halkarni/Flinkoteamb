package WindowHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFriday {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Vijaylaxmi/Downloads/iframe.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='FR1']")));
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[@class='allow']")).click();
		Thread.sleep(2000);
		
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
		
		
	}

}
