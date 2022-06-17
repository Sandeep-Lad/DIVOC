package stepdefinitions;

import org.openqa.selenium.WebDriver;

import DriverFactorys.driverfactory;
import Pages.Loginpage;
import Pages.vaccinatorpage;
import Pages.vaccinepage;
import Pages.vaccineprogrampage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class vaccineprogramsteps {

	public WebDriver driver;
	private Loginpage lp = new Loginpage(driverfactory.getDriver());
	private vaccinepage vp = new vaccinepage(driverfactory.getDriver());
	private vaccinatorpage vcp = new vaccinatorpage(driverfactory.getDriver());
	private vaccineprogrampage vpp = new vaccineprogrampage(driverfactory.getDriver());

	@Given("User is on Vaccine Program Page")
	public void user_is_on_vaccine_program_page() throws InterruptedException {
		System.out.println("Test");
		driverfactory.getDriver().get("http://52.173.104.40/portal");
		Thread.sleep(5000);
		lp.dologin("0000000000", "1234");
		Thread.sleep(5000);
		vpp.vaccineprogram();
		Thread.sleep(2000);
	
	}

	@When("User click on Register new Vaccine Program")
	public void user_click_on_register_new_vaccine_program() {
	
	}

	@When("User Enter program Name {string}")
	public void user_enter_program_name(String string) {
	
	}

	@When("User Enter Program Description {string}")
	public void user_enter_program_description(String string) {
	
	}

	@When("User Select Start Date of the program")
	public void user_select_start_date_of_the_program() {

	}

	@When("User select End date of the program")
	public void user_select_end_date_of_the_program() {

	}

	@When("User Select Vaccine for Program {string}")
	public void user_select_vaccine_for_program(String string) {
		
	}

	@When("User click on Save")
	public void user_click_on_save() {
	
	}
}
