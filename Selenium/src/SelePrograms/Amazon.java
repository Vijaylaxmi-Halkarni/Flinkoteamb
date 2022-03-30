package SelePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.findElement(By.cssSelector("a[class='_1_3w1N']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("12344567");
driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("1234cvgfW2");

	}

}
