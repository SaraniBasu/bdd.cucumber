package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ModuleOneStepDef {
	@Given("User is LoggedIn")
	public void user_is_logged_in() {
	    System.out.println("User logged in");
	   
	}
	@When("User create a new contact")
	public void user_create_a_new_contact() {
	   System.out.println("User create a new contact");
	    
	}

@When("User view contact details")
public void user_view_contact_details() {
	 System.out.println("User view a new contact");
    
}

@When("User update a contact details")
public void user_update_a_contact_details() {
	 System.out.println("User update a new contact");
   
}

@When("User create a new deal")
public void user_create_a_new_deal() {
   
	 System.out.println("User create a new deal");
}


@When("User view Deal details")
public void user_view_deal_details() {
	 System.out.println("User view a new deal");
}


@When("User update a Deal details")
public void user_update_a_deal_details() {
   
	 System.out.println("User update a new deal");
}



}
