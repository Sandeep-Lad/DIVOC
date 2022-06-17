package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class vaccineprogrampage {
	
	public WebDriver driver;
	
	private By vaccinepg = By.xpath("//button[@class='MuiButtonBase-root MuiTab-root jss3 MuiTab-textColorInherit'][3]");
	private By registerprogram = By.xpath("//button[@class='d-flex align-items-center justify-content-between btn btn-outline-primary']");
	
	
	public vaccineprogrampage(WebDriver driver) {
		this.driver =driver;
	}
	public void vaccineprogram() {
		driver.findElement(vaccinepg).click();
	}
	public void registernewprogram() {
		driver.findElement(registerprogram).click();
	}
}
