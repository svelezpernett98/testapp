package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	public WebDriver driver;
	public Properties prop;

	public BaseClass() throws IOException {
		try {
			// Gets the data from resources.config.properties file, and loads it into prop
			prop = new Properties();
			FileInputStream data = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\resources\\config.properties.txt");
			prop.load(data);
		} catch (IOException e) {
			System.out.println("Failed getting data, " + e.getMessage());
		}

	}

	// Based on the browser set in config.properties, it initializes the desired
	// WebDriver.. Only Chrome is set for now
	public WebDriver getDriver() {
		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			driver = new ChromeDriver(options);
		}

		// Not defined
		if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "TBD");
			driver = new FirefoxDriver();
		}

		// Not defined
		if (prop.getProperty("browser").equals("edge")) {
			System.setProperty("webdriver.chrome.driver", "TBD");
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
	}

	public String getUrl() {
		return prop.getProperty("url");
	}

	// takes a screenshot and saves it in a specified location (target > screenshots):
	public void takeSnapShot(WebDriver driver) {
		try {
			File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File destFile = new File(System.getProperty("user.dir") + "\\target\\screenshots\\" + timeStamp() + ".png");

			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
			System.out.println("Screen capture failed, " + e.getMessage());
		}
	}

	public String timeStamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

}
