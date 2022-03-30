package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSelectByVisibleText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@role='button']")).click();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("xyz");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9876543210");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Password@123");
		
		WebElement date=driver.findElement(By.xpath("//select[@id='day']"));
		Select dropdown1=new Select(date);
		dropdown1.selectByVisibleText("26");
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select dropdown2=new Select(month);
		dropdown2.selectByVisibleText("Jun");
		
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select dropdown3=new Select(year);
		dropdown3.selectByVisibleText("1998");
		
		driver.close();
		
		
	}

}
