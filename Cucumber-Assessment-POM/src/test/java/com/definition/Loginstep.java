package com.definition;

import com.utilities.HelperClass;

import io.cucumber.java.en.*;
import com.Action.LoginAction;
public class Loginstep {
	LoginAction objLoginact=new LoginAction();
	@When("I click the Myaccount")
	public void i_click_the_myaccount() {
		objLoginact.clickmyaccount();
	    
	}

	@When("Click the log in button")
	public void click_the_log_in_button() {
	   objLoginact.clickloginhome();
	}

	@When("Enter the valid emailid {string} and password {string}")
	public void enter_the_valid_emailid_and_password(String emailid, String password) {
	   objLoginact.setvailddata(emailid, password);
	}


	@Given("the user is on the webApplication")
	public void the_user_is_on_the_web_application() {
		HelperClass.openPage("https://tutorialsninja.com/demo/");
	    
	}

	@When("Enter the Invalid emailid {string} and Inpassword {string}")
	public void enter_the_invalid_emailid_and_inpassword(String mail, String pass) {
	    objLoginact.setInvaliddata(mail, pass);
	}

@When("click login")
public void click_login() {
	objLoginact.loginbuttonclick();
    
}

@Then("the user should see the My account page")
public void the_user_should_see_the_my_account_page() {
	objLoginact.afterlogin();
   
}


	@Then("the user should see the warning message as No match")
	public void the_user_should_see_the_warning_message_as_no_match() {
	    objLoginact.geterrormsg();
	}

}
