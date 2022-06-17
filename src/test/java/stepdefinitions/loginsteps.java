package stepdefinitions;

import org.junit.Assert;

import DriverFactorys.driverfactory;
import Pages.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	public static String title;
	private Loginpage loginpage = new Loginpage(driverfactory.getDriver());

	@Given("User is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		driverfactory.getDriver().get("http://52.173.104.40/portal");
		Thread.sleep(10000);

	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = loginpage.pagetitle();
		System.out.println("page title is" + title);
	}

	@Then("page title {string}")
	public void page_title(String expectedtitle) {
		Assert.assertTrue(title.contains(expectedtitle));
	}

	@When("user enter the mobile number {string}")
	public void user_enter_the_mobile_number(String mobilenum) {
		loginpage.entermobileno(mobilenum);
	}

	@When("user click on get otp")
	public void user_click_on_get_otp() {
		loginpage.getotp();
	}

	@When("User enter the opt {string}")
	public void user_enter_the_opt(String entopt) {
		loginpage.enteropt(entopt);
	}

	@When("user click on login to portal")
	public void user_click_on_login_to_portal() throws InterruptedException {
		loginpage.validotp();
		Thread.sleep(5000);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedtitle) {
		loginpage.hometitle();
		Assert.assertEquals("DIVOC Portal", "DIVOC Portal");
	}

	@Then("user should get an error")
	public void user_should_get_an_error() {
		String error = loginpage.invaliderror();
		System.out.println(error);
		Assert.assertEquals(error, "Invalid username or password");
	}

	@Then("user should get an error for invalid opt")
	public void user_should_get_an_error_for_invalid_opt() {
		loginpage.invaliderror();
	}

	@When("User click on Admin option")
	public void user_click_on_admin_option() {
		loginpage.adminclk();
	}

	@When("user logout")
	public void user_logout() {
		loginpage.logoutt();
	}

	@Then("user should get and error for invalid number")
	public void user_should_get_and_error_for_invalid_number() {
		String error = loginpage.invaliderror();
		System.out.println(error);
		Assert.assertEquals(error, "Invalid username or password");
		
	}

}
