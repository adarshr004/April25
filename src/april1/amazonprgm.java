package april1;

import java.awt.RenderingHints.Key;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonprgm {
	ChromeDriver driver;
	
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void test() {
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[6]")).sendKeys("mobile.",Keys.ENTER);
		driver.findElement(By.id("nav-cart-count")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-cart-text-container\"]/span[2]"))
		driver.findElement(By.name("email")).sendKeys("acvb@gmail.com");
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
		
	}

}
