package stepdefinitions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import DriverFactorys.driverfactory;
import Pages.Loginpage;
import Pages.facilitypage;
import Pages.vaccinatorpage;
import Pages.vaccinepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class facilitysteps {
	
	public WebDriver driver;
	private Loginpage lp = new Loginpage(driverfactory.getDriver());
	private vaccinepage vp = new vaccinepage(driverfactory.getDriver());
	private vaccinatorpage vcp = new vaccinatorpage(driverfactory.getDriver());
	private facilitypage fp = new facilitypage(driverfactory.getDriver());

	
	@Given("User is on Facility Tab")
	public void user_is_on_facility_tab() throws InterruptedException {
		
		System.out.println("Test");
		driverfactory.getDriver().get("http://52.173.104.40/portal");
		Thread.sleep(5000);
		lp.dologin("0000000000", "1234");
		Thread.sleep(5000);
	   
	}
	@When("User click on Upload CSV for facility")
	public void user_click_on_upload_csv_for_facility() {
		fp.faciltycsv();
	   
	}

@When("User verify Upload Status for facilities {string}")
public void user_verify_upload_status_for_facilities(String expecteddata) throws InterruptedException {
	 Thread.sleep(2000);  
	String data = fp.uploadstatus();
	   System.out.println(data);
	   Assert.assertEquals(data, expecteddata);
	   
	  
}
@Then("User view the Error file data  of facilities")
public void user_view_the_error_file_data_of_facilities() throws IOException {
	File src = new File("C:\\Users\\niles\\OneDrive\\Documents\\FacliltyUpload.csv");
	FileInputStream fis = new FileInputStream(src);
	String data;
	
	BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\niles\\Downloads\\FacliltyUpload.csv"));
	
	while ((data=br.readLine())!=null) {
		System.out.println(data);
		
		
	}
	br.close();
    
}

}
