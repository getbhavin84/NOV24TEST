package TESTGIT.TESTGIT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UtilTest {

	@Test
	public static void utilweb() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http:\\www.google.com");
		
		
		
		
	}

}
