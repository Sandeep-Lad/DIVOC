package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class facilitypage {
	
	public WebDriver driver;
	
	private By Uploadcsv = By.xpath("//input[@type='file']");
	private By status= By.xpath("//tr[@class=\"MuiTableRow-root\"]");
	
	public facilitypage(WebDriver driver) {
		this.driver=driver;
	}

	public void faciltycsv() {
		driver.findElement(Uploadcsv).sendKeys("C:\\Users\\niles\\OneDrive\\Documents\\FacliltyUpload.csv");
	}
	public String uploadstatus() {
		String data1= driver.findElement(status).getText();
		System.out.println(data1);
		return data1;
		
	}

}
