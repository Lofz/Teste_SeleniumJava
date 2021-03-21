package Steps;

import org.openqa.selenium.WebDriver;
import PageObjects.FormInsurancePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VehicleData {
	
	private WebDriver driver = Hooks.driver;
	FormInsurancePage form_insurance;
	
	@Given("the user acess Vehicle Insurance Page")
	public void theUserAcessVehicleInsurancePage() {
		form_insurance = new FormInsurancePage(driver);
		form_insurance.validatePageElements();
	}

	@Given("fills in all {string} data")
	public void fillsInAllEnterVehicleDataData(String tabName) {
		form_insurance.swtichToAnotherTab(tabName);
		form_insurance.fillInAllCurrentFormTab(tabName);
	}

	@When("the user sends the form")
	public void theUserSendsTheForm() {
		form_insurance.sendForm();
	}

	@Then("the user should see a confirmation message")
	public void theUserShouldSeeAConfirmationMessage() {
		form_insurance.validateSuccessMessage();
	}
}




