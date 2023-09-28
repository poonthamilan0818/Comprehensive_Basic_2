package org.uitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
	public WebDriver driver;

	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "onetrust-accept-btn-handler")
	WebElement acceptAllCookiesButton;
	@FindBy(xpath = "//a[@class = 'coh-link header-logo']")
	WebElement headerAutomationAnywhereLogo;
	@FindBy(xpath = "//a[@class = 'coh-link footer-logo']")
	WebElement footerAutomationAnywhereLogo;
	@FindBy(xpath = "//div[@id = 'topNavbar']//a[text() = 'Request Demo']")
	WebElement requestDemoButton;
	@FindBy(xpath = "//div[@id = 'topNavbar']//div[starts-with(@class, 'coh-column primary-menu')]/ul/li/a[text() = 'Products']")
	WebElement productMenu;
	@FindBy(xpath = "//div[@id = 'topNavbar']//div[starts-with(@class, 'coh-column primary-menu')]/ul/li/a[text() = 'Solutions']")
	WebElement solutionsMenu;
	@FindBy(xpath = "//div[@id = 'topNavbar']//div[starts-with(@class, 'coh-column primary-menu')]/ul/li/a[text() = 'Resources']")
	WebElement resourcesMenu;
	@FindBy(xpath = "//div[@id = 'topNavbar']//div[starts-with(@class, 'coh-column primary-menu')]/ul/li/a[text() = 'Beyond RPA']")
	WebElement beyondRpaMenu;
	@FindBy(xpath = "//div[@id = 'topNavbar']//div[starts-with(@class, 'coh-column primary-menu')]/ul/li/a[text() = 'Company']")
	WebElement companyMenu;

	public WebElement getAcceptAllCookiesButton() {
		return acceptAllCookiesButton;
	}

	public void setAcceptAllCookiesButton(WebElement acceptAllCookiesButton) {
		this.acceptAllCookiesButton = acceptAllCookiesButton;
	}

	public WebElement getHeaderAutomationAnywhereLogo() {
		return headerAutomationAnywhereLogo;
	}

	public void setHeaderAutomationAnywhereLogo(WebElement headerAutomationAnywhereLogo) {
		this.headerAutomationAnywhereLogo = headerAutomationAnywhereLogo;
	}

	public WebElement getFooterAutomationAnywhereLogo() {
		return footerAutomationAnywhereLogo;
	}

	public void setFooterAutomationAnywhereLogo(WebElement footerAutomationAnywhereLogo) {
		this.footerAutomationAnywhereLogo = footerAutomationAnywhereLogo;
	}

	public WebElement getRequestDemoButton() {
		return requestDemoButton;
	}

	public void setRequestDemoButton(WebElement requestDemoButton) {
		this.requestDemoButton = requestDemoButton;
	}

	public WebElement getProductMenu() {
		return productMenu;
	}

	public void setProductMenu(WebElement productMenu) {
		this.productMenu = productMenu;
	}

	public WebElement getSolutionsMenu() {
		return solutionsMenu;
	}

	public void setSolutionsMenu(WebElement solutionsMenu) {
		this.solutionsMenu = solutionsMenu;
	}

	public WebElement getResourcesMenu() {
		return resourcesMenu;
	}

	public void setResourcesMenu(WebElement resourcesMenu) {
		this.resourcesMenu = resourcesMenu;
	}

	public WebElement getBeyondRpaMenu() {
		return beyondRpaMenu;
	}

	public void setBeyondRpaMenu(WebElement beyondRpaMenu) {
		this.beyondRpaMenu = beyondRpaMenu;
	}

	public WebElement getCompanyMenu() {
		return companyMenu;
	}

	public void setCompanyMenu(WebElement companyMenu) {
		this.companyMenu = companyMenu;
	}

}
