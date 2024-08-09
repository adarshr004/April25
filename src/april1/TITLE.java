package april1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TITLE {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String exp="Facebook – log in or sign up";
	String actual=driver.getTitle();
	System.out.println(actual);
	
	if
	(exp.equals(actual)) {
		System.out.println("test passed");
	}
	else {
		System.out.println("test failed");
	}
	}
	}

