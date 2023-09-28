package org.uitest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.utilities.BaseClass;

public class VerifyAutomationAnywhereWebSite extends BaseClass {
	private final String url = "https://www.automationanywhere.com/";
	public HomePageObjects homePage = null;
	WebDriver driver;

	@AfterMethod
	private void oneTimeTearDown() {
		driver.quit();
	}

	@Test(enabled = false)
	private void verifyHomePageLogo() throws Exception {
		driver = LaunchBrowser("chrome", url);
		homePage = new HomePageObjects(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("onetrust-accept-btn-handler")));
		homePage.getAcceptAllCookiesButton().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		assertTrue(homePage.getHeaderAutomationAnywhereLogo().isDisplayed());
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@id = 'topNavbar']//a[text() = 'Request Demo']")));
		assertTrue(homePage.getRequestDemoButton().isDisplayed());
		assertTrue(homePage.getRequestDemoButton().isEnabled());
	}

	@Test
	private void verifyTopMenusPages() throws Exception {
		driver = LaunchBrowser("chrome", url);
		homePage = new HomePageObjects(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("onetrust-accept-btn-handler")));
		homePage.getAcceptAllCookiesButton().click();
		homePage.getProductMenu().click();
		assertTrue(driver.getCurrentUrl().toLowerCase().contains("products"));
		homePage.getSolutionsMenu().click();
		Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("solutions"));
		homePage.getResourcesMenu().click();
		Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("resources"));
		homePage.getBeyondRpaMenu().click();
		Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("rpa/robotic-process-automation"));
		homePage.getCompanyMenu().click();
		Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains("company/about-us"));
	}
}
