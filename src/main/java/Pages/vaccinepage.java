package Pages;

import java.sql.Types;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class vaccinepage {
	
	private WebDriver driver;
	
	private By addvaccine = By.xpath("//button[@class='d-flex align-items-center justify-content-between btn btn-outline-primary']");
	private By vaccinename = By.xpath("//input[@name='name']");
	private By Manufacture = By.xpath("//input[@name='provider']");
	private By Selectvaccinetyp = By.xpath("//select[@name='vaccinationMode'] //option[1]");
	private By Selectvaccinetyp1 = By.xpath("//select[@name='vaccinationMode'] //option[2]");
	private By Selectvaccinetyp2 = By.xpath("//select[@name='vaccinationMode'] //option[3]");
	private By price = By.xpath("//input[@name='price']");
	private By validity = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[2]/input[1]");
	private By save = By.xpath("(//button[@class='btn btn-outline-primary'])[2]");
	private By Adddose2 = By.xpath(" //div[@class='VaccineRegistrationForm_add-dose-content__3XhY4']");
	private By adddose3 = By.xpath("//div[@class='VaccineRegistrationForm_add-dose-content__3XhY4']");
	private By minint1 = By.xpath("( //input[@class='VaccineRegistrationForm_time-interval-count__1kTnV form-control'])[1]");
	private By maxint1 = By.xpath("( //input[@class='VaccineRegistrationForm_time-interval-count__1kTnV form-control'])[2]");
	private By inttype1day = By.xpath("//select[@name='unit'] //option[1]");
	private By inttype1mon = By.xpath("//select[@name='unit'] //option[2]");
	private By inttype1yr = By.xpath("//select[@name='unit'] //option[3]");
	private By intmax1day = By.xpath("(//select[@name='unit'])[2] //option[1]");
	private By intmax1mon = By.xpath("(//select[@name='unit'])[2] //option[2]");
	private By intmax1yr = By.xpath("(//select[@name='unit'])[2] //option[3]");
	private By vaccine = By.xpath("//button[@class='MuiButtonBase-root MuiTab-root jss3 MuiTab-textColorInherit'][2]");
	private By inact = By.xpath("(//div[@class='custom-switch d-flex flex-column align-items-center']) [2]");
	private By act = By.xpath("(//div[@class='custom-switch d-flex flex-column align-items-center']) [14]");
	private By bck = By.xpath("(//button[@class='btn btn-outline-primary']) [1]");
	private By edit = By.xpath("//div[@class='list-view-card-container']");
	private By close = By.xpath("//div[@class='VaccineRegistrationForm_remove-dose-icon__1wRdu']");
	private By err= By.xpath("//p[text()=' is required']");
	private By neg= By.xpath("//p[text()=' cannot be negative']");
	private By validate = By.xpath("(//input[@class='VaccineRegistrationForm_time-interval-count__1kTnV form-control'])");
	private By lastday = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[2]/select[1]/option[1]");
	private By lastmonths = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[2]/select[1]/option[2]");
	private By lastyear = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[2]/select[1]/option[3]");
	private By lifetime = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[2]/select[1]/option[4]");
	
	public vaccinepage(WebDriver driver) {
		this.driver=driver;
	}

	public void addvc() {
		driver.findElement(addvaccine).click();
	}
	
	public void vcname(String vaccname) {
		driver.findElement(vaccinename).sendKeys(vaccname);
	}
	public void brand(String brd) {
		driver.findElement(Manufacture).sendKeys(brd);
	
	}
	public void vctype(String vcty) {
		
		if(vcty.equals("muscular injection")) {
		driver.findElement(Selectvaccinetyp).click();
		}
		else if(vcty.equals("oral")) {
			driver.findElement(Selectvaccinetyp1).click();
		}
		else if (vcty.equals("nasal")) {
			driver.findElement(Selectvaccinetyp2).click();
		}
		
	}
	public void rate(String pp) {
		driver.findElement(price).sendKeys(pp);
	}
	public void expire(String vd) {
		driver.findElement(validity).sendKeys(vd);
	}

	public void add() {
		driver.findElement(save).click();
	
	}
	public String getmessage() {
	String message = driver.switchTo().alert().getText();
		System.out.println(message);
		return message;
		
	}
	public void ok() {
		driver.switchTo().alert().accept();
	}
	public void adddose1() {
		driver.findElement(Adddose2).click();
	}
	public void adddose2() {
		driver.findElement(adddose3).click();
	}
	public void dose1minint(String num) {
		driver.findElement(minint1).sendKeys(num);
		
	}
	public void dose1maxint(String num1) {
		driver.findElement(maxint1).sendKeys(num1);
	}
	public void intty(String type) {
		
		if (type.equals("Days")) {
			driver.findElement(inttype1day).click();
			
		}
		else if (type.equals("Months")) {
			driver.findElement(inttype1mon).click();
		}
		else if(type.equals("Years")){
			driver.findElement(inttype1yr).click();
			}
		else{System.out.println("invalid input");
		}
		}
		
	
	public void vaccinepg() {
		driver.findElement(vaccine).click();
	}
	public void intty1(String type1) {
		if (type1.equals("Days")) {
			driver.findElement(intmax1day).click();
			
		}
		else if (type1.equals("Months")) {
			driver.findElement(intmax1mon).click();
		}
		else if(type1.equals("Years")){
			driver.findElement(intmax1yr).click();
			}
		else{System.out.println("invalid input");
		}
		
	}
	public void valid(String val) {
		driver.findElement(validity).sendKeys(val);
	}
	
	public void vcadd() {
		driver.findElement(save).click();
	}
	public void popup(){
		driver.switchTo().alert().accept();
		
	}
	public void inactivevac() {
		driver.findElement(inact).click();
	}
	public void activevac() {
		driver.findElement(act).click();
	}
	public void back() {
		driver.findElement(bck).click();
	}
	public void editvaccine() {
		driver.findElement(edit).click();
	}
	public void clearmanu() {
		driver.findElement(Manufacture).clear();
	}
	public void clearrate() {
		driver.findElement(price).clear();
	}
	public void clearvalidity() {
		driver.findElement(validity).clear();
	}
	public void closedose() {
		driver.findElement(close).click();
	}
	public String errormsg() {
		String error = driver.findElement(err).getText();
		System.out.println(error);
		return error;
		
	}
	public void newvalidity(String val) {
		driver.findElement(validate).sendKeys(val);;
	}
	public String negmsg() {
		String negtive = driver.findElement(neg).getText();
		System.out.println(negtive);
		return negtive;
	
	}
public void vaccinevalidtill(String validity) {
		
		if(validity.equals("Days")) {
		driver.findElement(lastday).click();
		}
		else if(validity.equals("Months")) {
			driver.findElement(lastmonths).click();
		}
		else if (validity.equals("Years")) {
			driver.findElement(lastyear).click();
		}
		else if (validity.equals("Lifetime")) {
			driver.findElement(lifetime).click();
		}
	}
	
}
