package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Assert;


import DriverFactorys.driverfactory;
import Pages.Loginpage;
import Pages.vaccinatorpage;
import Pages.vaccinepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class vaccinatorsteps {

	public WebDriver driver;
	private Loginpage lp = new Loginpage(driverfactory.getDriver());
	private vaccinepage vp = new vaccinepage(driverfactory.getDriver());
	private vaccinatorpage vcp = new vaccinatorpage(driverfactory.getDriver());

	@Given("User is on Vaccinator tab")
	public void user_is_on_vaccinator_tab() throws InterruptedException {
		System.out.println("Test");
		driverfactory.getDriver().get("http://52.173.104.40/portal");
		Thread.sleep(5000);
		lp.dologin("0000000000", "1234");
		Thread.sleep(5000);
		vcp.vaccinatortab();
		Thread.sleep(3000);
		System.out.println("print");

	}

	@When("User click on Download Template")
	public void user_click_on_download_template() {
		vcp.downloadtempelate();
	}

	@Then("User is redirect to template page")
	public void user_is_redirect_to_template_page() {
		String data = vcp.templetedetails();
		
		
	}

	@When("User click on Upload CSV")
	public void user_click_on_upload_csv() throws InterruptedException {
		vcp.uploadcsv();
		Thread.sleep(5000);
	}

	@Then("User will get the message of the file Upload")
	public void user_will_get_the_message_of_the_file_upload() {
		
		
	}
	@When("User can see file upload details {string}")
	public void user_can_see_file_upload_details(String expecteddata) throws InterruptedException {
	   String data = vcp.uploadstatus();
	   System.out.println(data);
	   Assert.assertEquals(expecteddata, data);
	   
	   Thread.sleep(2000);
	}

	@When("User verify Upload Status {string}")
	public void user_verify_upload_status(String expecteddata) throws InterruptedException {
		Thread.sleep(2000);
		String data = vcp.filestatus();
		Assert.assertEquals(data, expecteddata);
		
	}

	@Then("User close the status pop-up")
	public void user_close_the_status_pop_up() {

	}

	@Then("User verify templete page data {string}")
	public void user_verify_templete_page_data(String expecteddata) {
	String data =vcp.templetedetails();
	Assert.assertEquals(data, expecteddata);
	}

	@When("User click on Uploaded File")
	public void user_click_on_uploaded_file() throws InterruptedException {
	Thread.sleep(2000);
		vcp.fristfileuploaded();
	}

	@Given("User click on Download Error csv")
	public void user_click_on_download_error_csv() {
	   vcp.download();
	}

	@Then("User view the Error file data")
	public void user_view_the_error_file_data() throws IOException {
		File src = new File("C:\\Users\\niles\\OneDrive\\Desktop\\VaccinatorNew.csv");
		FileInputStream fis = new FileInputStream(src);
		String data;
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\niles\\Downloads\\VaccinatorNew (2).csv"));
		
		while ((data=br.readLine())!=null) {
			System.out.println(data);
			
			
		}
		br.close();
	    
	}
	@When("User gets error pop-up and user click on view file")
	public void user_gets_error_pop_up_and_user_click_on_view_file() throws InterruptedException {
	   Thread.sleep(3000);
		vcp.uploadfileview();
	}

	@When("User gets error pop-up and user click close")
	public void user_gets_error_pop_up_and_user_click_close() {
	  vcp.uploadstatusclose();
	}

@When("User select rows per pages {string}")
public void user_select_rows_per_pages(String data) {
	vcp.rowperpagesforuploadhistory(data);
}

@Then("Verify user should able to see the no or rows selected {string}")
public void verify_user_should_able_to_see_the_no_or_rows_selected(String dataexpected) {
	String data = vcp.noorrowsupload();
	Assert.assertEquals(dataexpected, data);
	
}

@Given("User click on next page")
public void user_click_on_next_page() throws InterruptedException {
	Thread.sleep(2000);
vcp.nxtbtnhistory();
}

@Then("Verify previous page numbers {string}")
public void verify_previous_page_numbers(String expdata) {
String data = vcp.nxtpagedatahis(expdata);
Assert.assertEquals(expdata,data);

}


@When("User select rows per pages in allvaccinator {string}")
public void user_select_rows_per_pages_in_allvaccinator(String string) {
vcp.rowperpagesforvaccinator(string);
}

@Then("Verify user should able to see the no or rows selected for all vaccinator {string}")
public void verify_user_should_able_to_see_the_no_or_rows_selected_for_all_vaccinator(String expdata) {
String data =vcp.nxtrowsdatavaccinator(expdata);
Assert.assertEquals(expdata,data);
}

@Given("User click on next page on all vaccinator")
public void user_click_on_next_page_on_all_vaccinator() throws InterruptedException {
Thread.sleep(3000);
	vcp.nxtpagevaccinator();
}

@Then("Verify previous page numbers of all vaccinator {string}")
public void verify_previous_page_numbers_of_all_vaccinator(String data) {
 String data1= vcp.pagenodatavaccinator(data);
 Assert.assertEquals(data,data1);
 
}

@When("USer click on Previous page option of history")
public void u_ser_click_on_previous_page_option_of_history() {
    vcp.previouspagehistorybutton();
}



@When("USer click on Previous page option of vaccinator")
public void u_ser_click_on_previous_page_option_of_vaccinator() {
vcp.previouspagevaccinator();
}

@Then("User Verify previous page number of all vaccinator {string}")
public void user_verify_previous_page_number_of_all_vaccinator(String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
	
}
