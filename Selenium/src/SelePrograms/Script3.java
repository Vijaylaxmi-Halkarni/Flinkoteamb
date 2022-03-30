package SelePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://crmaccess.vtiger.com/log-in/");
System.out.println(driver.getTitle());
Thread.sleep(2000);
driver.navigate().refresh();
driver.manage().window().maximize();
driver.findElement(By.name("username")).sendKeys("vijuhalkarni@gmail.com");
driver.findElement(By.name("password")).sendKeys("viju12@Halkarni");
driver.findElement(By.className("btn-block")).click();
driver.findElement(By.id("usermenu-item")).click();
//driver.navigate().to("https://www.facebook.com/");

	}

}
