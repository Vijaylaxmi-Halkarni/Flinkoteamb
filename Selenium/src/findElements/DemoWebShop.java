package findElements;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		java.util.List<WebElement>objlinks = driver.findElements(By.tagName("a"));
		for(WebElement objcurrentlink:objlinks)
		{
			String strlinktext= objcurrentlink.getText();
			System.out.println(strlinktext);
		}
		for(int i=0;i<objlinks.size();i++)
		{
			System.out.println(objlinks.get(i).getAttribute("text"));
		}
		
	}

}
