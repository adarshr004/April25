package april1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class april2 {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("ridhunandha@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("8129148562");
		driver.findElement(By.name("login")).click();
		

	}

}
 