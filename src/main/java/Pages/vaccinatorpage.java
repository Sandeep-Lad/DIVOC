package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class vaccinatorpage {

	public WebDriver driver;
	private By vaccinator = By.xpath("//button[@class='MuiButtonBase-root MuiTab-root jss3 MuiTab-textColorInherit'][1]");
	private By temp = By.xpath("//div[@class='d-flex flex-row col']");
	private By upload = By.xpath("//input[@type='file']");
	private By uploadbar = By.xpath("//div[@class='d-flex justify-content-between']//p");
	private By Status = By.xpath("//tr[@class='MuiTableRow-root']");
	private By Tempdetails = By.xpath("//pre[@style='word-wrap: break-word; white-space: pre-wrap;']");
	private By closedetails = By.xpath("//button[@class='close']");
	private By fileuploaded1 = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]");
	private By errordownload = By.xpath("//button[@class='m-4 btn btn-danger']");
	private By uploadstatusview = By.xpath("//button[@class='btn btn-primary']");
	private By uploadstatusclose = By.xpath("//button[@class='close ml-2 mb-1']");
	private By clickonrows = By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiTablePagination-select MuiSelect-selectMenu MuiInputBase-input'])[2]");
	private By uploadrowpages10 = By.xpath("//ul[@class='MuiList-root MuiMenu-list MuiList-padding']//li[1]");
	private By uploadrowpages20 = By.xpath("//ul[@class='MuiList-root MuiMenu-list MuiList-padding']//li[2]");
	private By uploadrowpages25 = By.xpath("//ul[@class='MuiList-root MuiMenu-list MuiList-padding']//li[3]");
	private By noofrowhistory = By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiTablePagination-select MuiSelect-selectMenu MuiInputBase-input'])[2]");
	private By nxtpageofhistory = By.xpath("(//button[@type='button'])[11]");
	private By previouspageofhistorybtn = By.xpath("(//button[@type='button'])[10]");
	private By nxtpagedata = By.xpath("(//p[@class='MuiTypography-root MuiTablePagination-caption MuiTypography-body2 MuiTypography-colorInherit'])[4]");
	
	private By clickonrowvaccinator = By.xpath("(//div[@class=\"MuiInputBase-root MuiTablePagination-input MuiTablePagination-selectRoot\"])[1]");
	private By vaccinatorrowpg10 = By.xpath("//ul[@class='MuiList-root MuiMenu-list MuiList-padding'] //li[1]");
	private By vaccinatorrowpg20 = By.xpath("//ul[@class='MuiList-root MuiMenu-list MuiList-padding'] //li[2]");
	private By vaccinatorrowpg25 = By.xpath("//ul[@class='MuiList-root MuiMenu-list MuiList-padding'] //li[3]");
	private By nxtpagedatarowsvacc = By.xpath("(//div[@class='MuiSelect-root MuiSelect-select MuiTablePagination-select MuiSelect-selectMenu MuiInputBase-input'])[1]");
	private By previouspagevacc = By.xpath("(//button[@type='button'])[8]");
	private By nextpagevacc = By.xpath("(//button[@type='button'])[9]");
	private By nxtpagedatavacc	= By.xpath("(//p[@class='MuiTypography-root MuiTablePagination-caption MuiTypography-body2 MuiTypography-colorInherit'])[2]");
	
	public vaccinatorpage(WebDriver driver) {
		this.driver = driver;
	}

	public void vaccinatortab() {
		driver.findElement(vaccinator).click();
	}

	public void downloadtempelate() {
		driver.findElement(temp).click();
	}

	public void uploadcsv() throws InterruptedException {
		driver.findElement(upload).sendKeys("C:\\Users\\niles\\OneDrive\\Documents\\VaccinatorNew.csv");

	}

	public String filestatus() {
		String Sts = driver.findElement(Status).getText();
		return Sts;
	}

	public String templetedetails() {
		String actual = driver.findElement(Tempdetails).getText();
		// System.out.println(actual);
		return actual;
	}

	public void fristfileuploaded() {
		driver.findElement(fileuploaded1).click();
	}

	public String uploadstatus() {
		String message = driver.findElement(uploadbar).getText();
		return message;
	}

	public void download() {
		driver.findElement(errordownload).click();
	}

	public void closepopup() {
		driver.findElement(closedetails).click();
	}

	public void uploadfileview() {
		driver.findElement(uploadstatusview).click();
	}

	public void uploadstatusclose() {
		driver.findElement(uploadstatusclose).click();
	}

	public void rowperpagesforuploadhistory(String row) {
		driver.findElement(clickonrows).click();
		if (row.equals("10")) {
			driver.findElement(vaccinatorrowpg10).click();
		} else if (row.equals("20")) {
			driver.findElement(vaccinatorrowpg20).click();
		} else if (row.equals("25")) {
			driver.findElement(vaccinatorrowpg25).click();
		}
	}

	public String noorrowsupload() {
		String noofrows = driver.findElement(noofrowhistory).getText();
		System.out.println("No of rows are" + noofrows);
		return noofrows;
	}

	public void nxtbtnhistory() {
		driver.findElement(nxtpageofhistory).click();
	}

	public String nxtpagedatahis(String data) {
		String data1 = driver.findElement(nxtpagedata).getText();
		System.out.println("no of current page rows are" + data1);
		return data;
	}
	
	public void previouspagehistorybutton() {
		driver.findElement(previouspageofhistorybtn).click();
	}
	public void rowperpagesforvaccinator(String row) {
		driver.findElement(clickonrowvaccinator).click();
		if (row.equals("10")) {
			driver.findElement(uploadrowpages10).click();
		} else if (row.equals("20")) {
			driver.findElement(uploadrowpages20).click();
		} else if (row.equals("25")) {
			driver.findElement(uploadrowpages25).click();
		}
		
	}
	public String nxtrowsdatavaccinator(String data) {
		String data1 = driver.findElement(nxtpagedatarowsvacc).getText();
		return data;
	}
	public void nxtpagevaccinator() {
	
		driver.findElement(nextpagevacc).click();
	}
	public String pagenodatavaccinator(String data) {
	String data1= 	driver.findElement(nxtpagedatavacc).getText();
		return data;
	}
	public void previouspagevaccinator() {
		driver.findElement(previouspagevacc).click();
		}
	
	
	
}
