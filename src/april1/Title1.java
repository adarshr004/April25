package april1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Title1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://in.linkedin.com/");
		
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

}
