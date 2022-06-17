package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import DriverFactorys.driverfactory;
import Pages.Loginpage;
import Pages.vaccinepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.elementsutil;

public class vaccinesteps {

	public WebDriver driver;
	private Loginpage lp = new Loginpage(driverfactory.getDriver());
	public vaccinepage vp = new vaccinepage(driverfactory.getDriver());
	public elementsutil el = new elementsutil();

	@Given("User is on Vaccine page")
	public void user_is_on_vaccine_page() throws InterruptedException {
		System.out.println("Tests");
		driverfactory.getDriver().get("http://52.173.104.40/portal");
		Thread.sleep(5000);
		lp.dologin("0000000000", "1234");
		Thread.sleep(3000);
		vp.vaccinepg();
		Thread.sleep(2000);

	}

	@When("User click on Register new Vaccine")
	public void user_click_on_register_new_vaccine() throws InterruptedException {
		vp.addvc();
		Thread.sleep(3000);

	}

	@When("User enter Vaccine name {string}")
	public void user_enter_vaccine_name(String vaccname) {
		vp.vcname(vaccname);
	}

	@When("User enter Manufacturer name {string}")
	public void user_enter_manufacturer_name(String brd) {
		vp.brand(brd);
	}

	@When("user select Administration Type {string}")
	public void user_select_administration_type(String vctp) throws InterruptedException {
		vp.vctype(vctp);
		Thread.sleep(2000);

	}

	@When("user enter Approximate Price  {string}")
	public void user_enter_approximate_price(String pp) {
		vp.rate(pp);

	}

	@When("User select Doses of Vaccine")
	public void user_select_doses_of_vaccine() throws InterruptedException {
		Thread.sleep(2000);

		vp.adddose1();

	}

	@When("User add minimun interval {string}")
	public void user_add_minimun_interval(String num) {
		vp.dose1minint(num);
	}

	@When("User select minimum interval type {string}")
	public void user_select_minimum_interval_type(String type) throws InterruptedException {
		Thread.sleep(2000);
		vp.intty(type);

	}

	@When("User add max interval {string}")
	public void user_add_max_interval(String num1) {
		vp.dose1maxint(num1);
	}

	@When("User select Max interval {string}")
	public void user_select_max_interval(String type1) throws InterruptedException {
		Thread.sleep(2000);
		vp.intty1(type1);
	}

	@When("User enter Validity of Vaccine {string}")
	public void user_enter_validity_of_vaccine(String val) {
		vp.valid(val);
	}
	@When("User select the lastdose validity until {string}")
	public void user_select_the_lastdose_validity_until(String type) {
	   vp.vaccinevalidtill(type);
	}

	@When("User Click on save")
	public void user_click_on_save() throws Exception {
		
		vp.add();
		Thread.sleep(2000);
	}

	@Then("Verify pop-up message {string}")
	public void verify_pop_up_message(String Expmessage) throws InterruptedException {
		Thread.sleep(4000);
		String message = vp.getmessage();
		Assert.assertEquals(message, Expmessage);
		vp.popup();

	}

	@Given("User inactive the vaccine")
	public void user_inactive_the_vaccine() throws InterruptedException {
		Thread.sleep(2000);
		vp.inactivevac();
	}

	@Given("User active the vaccine")
	public void user_active_the_vaccine() throws InterruptedException {
		Thread.sleep(2000);
		vp.activevac();
	}

	@When("user click on back option")
	public void user_click_on_back_option() {
		vp.back();
	}

	@When("User click on already register vaccine")
	public void user_click_on_already_register_vaccine() throws InterruptedException {
		Thread.sleep(2000);
		vp.editvaccine();

	}

	@When("User Clear Manufacture name")
	public void useer_clear_manufacture_name() {
		vp.clearmanu();
	}

	@When("User Clear Approximate Price")
	public void user_clear_approximate_price() {
		vp.clearrate();

	}

	@When("User Clear Validity of Vaccine")
	public void user_clear_validity_of_vaccine() {
		vp.clearvalidity();
	}

	@When("User click on Add does")
	public void user_click_on_add_does() {
		vp.adddose1();
	}

	@When("user click on close")
	public void user_click_on_close() throws InterruptedException {

		vp.closedose();
		Thread.sleep(2000);
	}

	@Then("Verify Error messsage {string}")
	public void verify_error_messsage(String Expmessage) {
		String message = vp.errormsg();
		Assert.assertEquals(message, Expmessage);
	}

	@Then("Verify negative messsage {string}")
	public void verify_negative_messsage(String Expmessage) {
		String message = vp.negmsg();
		Assert.assertEquals(message, Expmessage);

	}

	@Then("Verify negative messsage validity {string}")
	public void verify_negative_messsage_validity(String Expmessage) {
		String message = vp.negmsg();
		System.out.println(message);
		Assert.assertEquals(message, Expmessage);
	}

	@When("User enter Validity of new Vaccine {string}")
	public void user_enter_validity_of_new_vaccine(String val) {
		vp.newvalidity(val);

	}
	
}
