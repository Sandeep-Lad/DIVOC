package PortalHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import DriverFactorys.driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class WebHooks {

	private driverfactory driverfactory;
	private WebDriver driver;
	private utilities.configreader configreader;
	Properties prop;
	
	

	@Before(order =0 )
	public void getProperty() {
		configreader = new utilities.configreader();
		prop = configreader.init_prop();
		


	}
	@Before(order=1)
	public void launchBrowser() {
		String broswername = prop.getProperty("browser");
		driverfactory = new driverfactory(); 
		driver = driverfactory.init_driver(broswername);
		
		//driver.get("http://52.173.104.40/auth/realms/divoc/protocol/openid-connect/auth?client_id=facility-admin-portal&redirect_uri=http%3A%2F%2F52.173.104.40%2Fportal%2Flogin&state=06e735b0-9988-4d0a-866c-2d5ac3c5a676&response_mode=fragment&response_type=code&scope=openid&nonce=a930d1ce-1ff5-4449-ba5a-d0125a9448bf");
	}
	
	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}
	@After(order=1)
	public void teardown(Scenario sc) {
		if(sc.isFailed()) {
			String Screenshort = sc.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			sc.attach(sourcePath, "image/PNG", Screenshort);
		}
	}
	
}
