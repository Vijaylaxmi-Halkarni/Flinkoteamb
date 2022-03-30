package SelePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		System.out.println(driver.getTitle());
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Vijaylaxmi");;
		driver.findElement(By.id("LastName")).sendKeys("H");
		driver.findElement(By.id("Email")).sendKeys("rijeja81678@toudrum.com");
		driver.findElement(By.id("Password")).sendKeys("@1234Password");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("@1234Password");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.className("ico-logout")).click();
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys("rijeja81678@toudrum.com");
		driver.findElement(By.id("Password")).sendKeys("@1234Password");
		driver.findElement(By.className("login-button")).click();
		
		
	}

}
