package WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeParentChild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		String ParentHandle=driver.getWindowHandle();
		System.out.println("parent window"+ParentHandle);
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		
		
		Set<String> handles=driver.getWindowHandles();
		for (String handle : handles)
		{
			System.out.println(handle);
			if(!handle.equals(ParentHandle))
			{
			driver.switchTo().window(handle);
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("abc");
			driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("xyz");
			driver.findElement(By.xpath("//input[@id='femalerb']")).click();
			driver.findElement(By.xpath("//input[@id='englishchbx']")).click();
			//Thread.sleep(2000);
			//driver.close();
			}
			driver.switchTo().window(ParentHandle);
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("zxc");
		}
			
	driver.quit();
	}

}
