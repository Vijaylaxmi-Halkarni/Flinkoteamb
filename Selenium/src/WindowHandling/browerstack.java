package WindowHandling;

/*import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserStackPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_up");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='user_full_name']")).sendKeys("arya");
		driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys("arya@gmail.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("arya123@");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='user_submit']")).click();
		
		//Alert alt=driver.switchTo().alert();
		//alt.accept();
	}

}
package alertpopup;*/

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class browerstack {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_up");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user_full_name']")).sendKeys("amar");
		driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys("abcd12ww23@gmail.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("12345@Azx");
		Thread.sleep(3000);
		
		Actions action=new Actions(driver);
		WebElement click=driver.findElement(By.xpath("//input[@id='user_submit']"));
		action.moveToElement(click).click().perform();
		Thread.sleep(2000);
		
		Alert web=driver.switchTo().alert();
		web.accept();

	}

}

