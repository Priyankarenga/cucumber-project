package org.step;

import org.base.BaseClass;
import org.pojo.ForgottenPassPojo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition2 extends BaseClass {
	@When("user click the forgotten password link")
	public void userClickTheForgottenPasswordLink() {
	   ForgottenPassPojo f=new ForgottenPassPojo();
	   toClick(f.getForgotPass());
	}

	@When("enter the email id to finding our account and click the search button")
	public void enterTheEmailIdToFindingOurAccountAndClickTheSearchButton() {
		 ForgottenPassPojo f=new ForgottenPassPojo();
	    implicitWait();
	    toFillInput(f.getEmail(), "prinku@gmail.com");
	    toClick(f.getSearch());
	}

	@Then("user found the account")
	public void userFoundTheAccount() {
	    System.out.println("Account was found");
	}


}
