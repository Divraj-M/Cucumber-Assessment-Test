
package com.definition;

import java.util.List;

import com.Action.RegisterAction;
import com.utilities.HelperClass;

import io.cucumber.java.en.*;

public class Registerstep {
	RegisterAction objregister=new RegisterAction();
	

@Given("the user is on the WebApplication")
public void the_user_is_on_the_web_application() 
{
	HelperClass.openPage("https://tutorialsninja.com/demo/");
	
    
}

@When("I click the My account and Register")
public void i_click_the_my_account_and_register() 
{
	objregister.clickMyaccount();
    
}

@When("enter the required fields for registration")
public void enter_the_required_fields_for_registration(io.cucumber.datatable.DataTable dataTable) {
	List<List<String>> objdata = dataTable.asLists(String.class);
	String firstname=objdata.get(0).get(0);
	String lastname=objdata.get(0).get(1);
	String Email=objdata.get(0).get(2);
	String Telephone=objdata.get(0).get(3);
	String password=objdata.get(0).get(4);
	String confirmpass=objdata.get(0).get(5);
	objregister.setfields(firstname, lastname, Email, Telephone, password, confirmpass);
	
	
	
    
}

@When("click continue button")
public void click_continue_button() {
	objregister.registerconfirm();
}

@Then("the user should see the successful message as Your Account Has Been Created!.")
public void the_user_should_see_the_successful_message_as_your_account_has_been_created() {
	objregister.Successmsg();
   
}




}
