package org.automationanywhere;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerifyAutomationAnyWhereLogo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.automationanywhere.com/");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("onetrust-accept-btn-handler")));
		WebElement acceptAllCookiesButton = driver.findElement(By.id("onetrust-accept-btn-handler"));
		acceptAllCookiesButton.click();
		WebElement automationAnyWhereLogo = driver.findElement(By.xpath("//a[@class = 'coh-link header-logo']"));
		WebElement bottomLogo = driver.findElement(By.xpath("//a[@class = 'coh-link footer-logo']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)","");
		Assert.assertTrue(automationAnyWhereLogo.isDisplayed());
		WebElement requestDemoButton = driver
				.findElement(By.xpath("//div[@id = 'topNavbar']//a[text() = 'Request Demo']"));
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@id = 'topNavbar']//a[text() = 'Request Demo']")));
		Assert.assertTrue(requestDemoButton.isDisplayed());
		Assert.assertTrue(requestDemoButton.isEnabled());
		driver.quit();
	}
}