package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	
	private WebDriver driver;
	
	//Locators 
	private By mobileno = By.xpath("//input[@id='mobile_number']");
	private By getotp = By.xpath("//button[@id='submit-btn']");
	private By enterotp = By.xpath("//input[@id='otp']");
	private By validateotp = By.xpath("//button[@class='submit']");
	private By validatetest = By.xpath("//p[@class='instruction']");
	String verify ="validatetest";
	private By admin = By.xpath("//button[@id='dropdown-split-basic']");
	private By Logout = By.xpath("//a[@class='dropdown-item']");
	
	
	
	
	
	
	public Loginpage(WebDriver driver) {
		this.driver = driver;
	}
	public String pagetitle() {
		return driver.getTitle();
	}
	public void entermobileno(String mobilenum) {
		driver.findElement(mobileno).sendKeys(mobilenum);
	}

	public void getotp( ) {
		 driver.findElement(getotp).click();
	}

	public void enteropt(String entopt) {
		driver.findElement(enterotp).sendKeys(entopt);
		
		
	}
	public void validotp() {
		driver.findElement(validateotp).click();
	}
	public String hometitle() {
		return driver.getTitle();
	}
	public String invaliderror() {
		 return driver.findElement(validatetest).getText();
	}
	public void adminclk() {
		driver.findElement(admin).click();
	}
	public void logoutt() {
		driver.findElement(Logout).click();
	}
	public void dologin(String mobilenum, String entotp) throws InterruptedException {
		driver.findElement(mobileno).sendKeys(mobilenum);
		driver.findElement(getotp).click();
		driver.findElement(enterotp).sendKeys(entotp);
		driver.findElement(validateotp).click();
		Thread.sleep(5000);
		//return new vaccinepage(driver);
		
	}
	}
	
	

