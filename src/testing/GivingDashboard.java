package testing;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GivingDashboard {

	static String browser;
	static WebDriver driver;
	static String  projectLocation;
	public static void main(String[] args) throws InterruptedException {
//		testGoogleSearch();
		projectLocation = System.getProperty("user.dir");
		setBrowser();
		setBrowserConfig();
		runTest();
	}

	public static void setBrowser() {
		browser = "chrome";
	}

	public static void setBrowserConfig() {
		
		if(browser.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectLocation + "\\lib\\geckodriver\\geckodriver.exe");
			System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver();
		} 
		
		if(browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectLocation + "\\lib\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
	}

	public static void runTest() {
		driver.get("https://www.google.com/");
		try {
			testGoogleSearch();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//	driver.quit();
	}


	@Test
	public static void testGoogleSearch() throws InterruptedException {
		Thread.sleep(2000);  // Let the user actually see something!
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		searchBox.sendKeys("ChromeDriver");
		Thread.sleep(2000);
		searchBox.submit();
		Thread.sleep(2000);  // Let the user actually see something!
		driver.quit();
	}

}