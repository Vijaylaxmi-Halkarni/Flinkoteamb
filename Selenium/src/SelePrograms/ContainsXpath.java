package SelePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("(//input[contains(@type,'text')])[1]")).sendKeys("laptop");
		//driver.findElement(By.xpath("(//input[contains(@type,'submit')])[1]")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[contains(@id,'gender-female')]")).click();
		driver.findElement(By.xpath("//input[contains(@id,'FirstName')]")).sendKeys("Vijaylaxmi");
		driver.findElement(By.xpath("//input[contains(@id,'LastName')]")).sendKeys("h");
		driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("wofeyij680@vapaka.com");
		driver.findElement(By.xpath("//input[contains(@id,'Password')]")).sendKeys("@123Password");
		driver.findElement(By.xpath("//input[contains(@id,'ConfirmPassword')]")).sendKeys("@123Password");
		driver.findElement(By.xpath("//input[contains(@id,'register-button')]")).click();
		
	}

}
