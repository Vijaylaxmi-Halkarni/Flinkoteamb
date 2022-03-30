package WindowHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		String ParentWindow=driver.getWindowHandle();
		System.out.println("parent window"+ParentWindow);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println("list of windows");
		
		for (String handle : windows) {
			System.out.println(handle);
			if(!handle.equals(ParentWindow))
			{
				//Thread.sleep(2000);
				driver.switchTo().window(handle);
				//driver.findElement(By.xpath("//input[@id='jsc_c_2m']")).sendKeys("abc@gmail.com");
				Thread.sleep(2000);
			}
		}
		driver.switchTo().window(ParentWindow);
		System.out.println("Parent Window");
		System.out.println(ParentWindow);
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Books");
	}

}
