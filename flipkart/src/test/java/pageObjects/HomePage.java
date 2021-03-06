package pageObjects;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	private WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[text()= 'Log In']")
	private WebElement login;
	
	@FindBy(xpath = "//input[contains(@title, 'Search for Products')]")
	private WebElement searchBar;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	private  WebElement searchIcon;
	
	@FindBy(xpath = "//a[contains(@text , 'Customer Care')]")
	private WebElement customerCare;
	
	public void  openLoginWindow() {
		login.click();
		//return new LoginPage();
	}
	
	public void searchProducts(String searchText) {
		searchBar.sendKeys(searchText);
		//System.out.println(searchText);
		
	 }
	
	public void clickSearchIcon() {
//		Actions action = new Actions(driver);
//		action.click(searchIcon);
		searchIcon.click();
		//System.out.println("click");
	}
	
	public void clickCustomerSupport() {
		WebDriverWait wait = new  WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(customerCare));
		customerCare.click();
	}
	
	
     }