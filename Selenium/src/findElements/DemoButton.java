package findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		List<WebElement>objlinks=driver.findElements(By.id("pollanswers-1"));
		for(WebElement objcurrentlink:objlinks)
		{
			String strlinktext=objcurrentlink.getText();
			System.out.println();
		}
		//driver.close();	
		
	}

}
