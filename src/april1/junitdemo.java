package april1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitdemo {
	WebDriver driver;
	@Before
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://in.linkedin.com/");
	}
	@Test
	public void test1() {
		String exp="LinkedIn India: Log In or Sign Up";
		String actual=driver.getTitle();
		System.out.println(actual);
		
		if(exp.equals(actual)){
			System.out.println("test passed");
			
		}
		else {
			System.out.println("test failed");
			}
	}
		@After
		public void afterrr() {
			driver.quit();
		}

}
