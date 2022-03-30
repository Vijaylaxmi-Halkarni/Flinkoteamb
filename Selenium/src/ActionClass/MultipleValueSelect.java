package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MultipleValueSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Vijaylaxmi/Downloads/dropDown%20(1).html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement dropdown=driver.findElement(By.id("m1"));
		Select sele=new Select(dropdown);
		sele.selectByValue("6");
		Thread.sleep(3000);
		sele.selectByIndex(2);;
		Thread.sleep(3000);
		sele.selectByVisibleText("Orange");;
		Thread.sleep(3000);
		
		sele.deselectByValue("6");
		Thread.sleep(3000);
		sele.deselectByIndex(2);;
		Thread.sleep(3000);
		sele.deselectByVisibleText("Orange");;
		Thread.sleep(3000);
		
		
	
		
		
	}

}
