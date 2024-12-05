package stepDefination;
import org.openqa.selenium.WebDriver;
import commonFunctions.FunctionLibrary;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinations {
	WebDriver driver;
	@Given("Users launch browser")
	public void users_launch_browser() throws Throwable {
		driver = FunctionLibrary.startBrowser();
	    
	}

	@When("user launch url")
	public void user_launch_url() {
		FunctionLibrary.openUrl();    
	}

	@When("wait for username with {string} and {string} and {string}")
	public void wait_for_username_with_and_and(String Ltype, String Lvalue, String waittime){
	 FunctionLibrary.waitForElement(Ltype, Lvalue, waittime);   
	}

	@When("Enter user name with {string} and {string} and {string}")
	public void enter_user_name_with_and_and(String Ltype, String Lvalue, String TestData) {
		FunctionLibrary.typeAction(Ltype, Lvalue, TestData);
	   	}

	@When("Enter password with {string} and {string} and {string}")
	public void enter_password_with_and_and(String Ltype, String Lvalue, String TestData) {
		FunctionLibrary.typeAction(Ltype, Lvalue, TestData);
	}

	@When("Click login button with {string} and {string}")
	public void click_login_button_with_and(String Ltype,String Lvalue) {
	FunctionLibrary.clickAction(Ltype,Lvalue);
	}

	@When("Wait for logout link with {string} and {string} and {string}")
	public void wait_for_logout_link_with_and_and(String Ltype, String Lvalue, String waittime) {
		 FunctionLibrary.waitForElement(Ltype, Lvalue, waittime);   
	  
	}

	@Then("Validate Title with {string}")
	public void validate_Title_with(String Expected_Title) {
		FunctionLibrary.validateTitle(Expected_Title);
	    	}

	@When("Wait for supplier link with {string} and {string} and {string}")
	public void wait_for_supplier_link_with_and_and(String Ltype, String Lvalue, String waittime) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, waittime);   
	}

	@When("Click Suppier link with {string} and {string}")
	public void click_Suppier_link_with_and(String Ltype,String Lvalue) {
		FunctionLibrary.clickAction(Ltype,Lvalue);
	}

	@When("wait for Add Icon with {string} and {string} and {string}")
	public void wait_for_Add_Icon_with_and_and(String Ltype, String Lvalue, String waittime) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, waittime); 	}

	@When("Click Add Icon with {string} and {string}")
	public void click_Add_Icon_with_and(String Ltype,String Lvalue) {
		FunctionLibrary.clickAction(Ltype,Lvalue);
	}

	@When("wait for supplier number with {string} and {string} and {string}")
	public void wait_for_supplier_number_with_and_and(String Ltype, String Lvalue, String waittime) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, waittime); 	
	}

	@When("Capture Supplier number with {string} and {string}")
	public void capture_Supplier_number_with_and(String Ltype, String Lvalue) throws Throwable {
		FunctionLibrary.captureSuppliernumber(Ltype, Lvalue);
	}
	@When("Enter in {string} with {string} and {string}")
	public void enter_in_with_and(String TestData, String Ltype, String Lvalue) {
		FunctionLibrary.typeAction(Ltype, Lvalue, TestData);
	}

	@When("Click Add button with {string} {string}")
	public void click_Add_button_with(String Ltype,String Lvalue) {
		FunctionLibrary.clickAction(Ltype,Lvalue);
	}

	@When("Wait for Confirm ok button with {string} and {string} and {string}")
	public void wait_for_Confirm_ok_button_with_and_and(String Ltype, String Lvalue, String waittime) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, waittime); 	

	}

	@When("Click Confirm ok button with {string} and {string}")
	public void click_Confirm_ok_button_with_and(String Ltype,String Lvalue) {
		FunctionLibrary.clickAction(Ltype,Lvalue);
	}

	@When("Wait for Alert ok button with {string} and {string} and {string}")
	public void wait_for_Alert_ok_button_with_and_and(String Ltype, String Lvalue, String waittime) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, waittime); 	

	}

	@When("Click Alert ok button with {string} and {string}")
	public void click_Alert_ok_button_with_and(String Ltype,String Lvalue) {
		FunctionLibrary.clickAction(Ltype,Lvalue);
	}

	@Then("Validate Supplier number")
	public void validate_Supplier_number() throws Throwable {
		FunctionLibrary.supplierTable();
	    	}

	@When("Close browser")
	public void close_browser() {
	   FunctionLibrary.closeBrowser();
	}

	@When("Wait for customer link with {string} and {string} and {string}")
	public void wait_for_customer_link_with_and_and(String Ltype, String Lvalue, String waittime) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, waittime); 	

	}

	@When("Click customer link with {string} and {string}")
	public void click_customer_link_with_and(String Ltype,String Lvalue) {
		FunctionLibrary.clickAction(Ltype,Lvalue);
	}

	@When("wait for customer number with {string} and {string} and {string}")
	public void wait_for_customer_number_with_and_and(String Ltype, String Lvalue, String waittime) {
		FunctionLibrary.waitForElement(Ltype, Lvalue, waittime); 	

	}

	@When("capture customer number with {string} and {string}")
	public void capture_customer_number_with_and(String Ltype,String Lvalue) throws Throwable {
	    FunctionLibrary.capturecustomernumber(Ltype,Lvalue);
	}

	@Then("Validate customer number")
	public void validate_customer_number() throws Throwable {
		FunctionLibrary.customerTable();
	   	}


}
