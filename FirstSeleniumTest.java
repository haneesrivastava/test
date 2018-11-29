package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {

	static String browser;
	static WebDriver driver;

	public static void main(String[] args) {
		setBrowser();
		setBrowserConfig();
		runTest();
	}


	public static void setBrowser(){
		browser = "Chrome";
	}

	public static void setBrowserConfig() {


		if (browser.contains("Firefox")) {
			String projectLocation = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", projectLocation+"/lib/geckodriver/geckodriver-v0.23.0-win64.zip");
			System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver(); //WebDriver driver = new FirefoxDriver();
		}

		if (browser.contains("Chrome")) {
			String projectLocation = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",projectLocation+"/lib/chromedriver/chromedriver.exe");
			driver = new ChromeDriver();
		}
	}


	public static void runTest() {
		driver.get("https://www.seleniumhq.org/");
		driver.quit();
	}
	
}
