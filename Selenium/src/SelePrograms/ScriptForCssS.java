package SelePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptForCssS {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demowebshop.tricentis.com/");
driver.manage().window().maximize();
driver.findElement(By.cssSelector("a[class='ico-register']")).click();
driver.findElement(By.cssSelector("input[id='gender-female']")).click();
driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Vijaylaxmi");
driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("H");
driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("vijuhalakrni@gmail.com");
driver.findElement(By.cssSelector("input[type='password']")).sendKeys("123Halkarni@");
driver.findElement(By.cssSelector("input[name='ConfirmPassword']")).sendKeys("123Halkarni@");
driver.findElement(By.cssSelector("input[id='register-button']")).click();


}
}
