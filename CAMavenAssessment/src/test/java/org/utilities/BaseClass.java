package org.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	public static WebDriver driver = null;

	public static WebDriver LaunchBrowser(String browString, String url) throws Exception {
//		if(browString.equalsIgnoreCase("CHROME")) {
//			driver = new ChromeDriver();
//		}else
		switch (browString.toUpperCase()) {
		case "CHROME":
			driver = new ChromeDriver();
			break;
		case "EDGE":
			driver = new EdgeDriver();
			break;

		default:
			throw new Exception("Given browser name " + browString + " is not in the case");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(10000);
		return driver;
	}
}
