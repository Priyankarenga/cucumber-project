package org.step;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.junit.Assert;
import org.pojo.FacebookPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	@Given("user launch the chrome browser and pass the url")
	public void userLaunchTheChromeBrowserAndPassTheUrl() {
	    openChrome();
	    toPassUrl("https://www.facebook.com/");
	    maxWindow();
	}

	@When("user enter the values in username and password field")
	public void userEnterTheValuesInUsernameAndPasswordField(io.cucumber.datatable.DataTable d) {
		
	    FacebookPojo f=new FacebookPojo();
	    List<Map<String, String>> list = d.asMaps();
	    Map<String, String> map = list.get(1);
	    String user = map.get("username");
	    String pass = map.get("password");
	  	    toFillInput(f.getUsername(), user);
	    toFillInput(f.getPassword(), pass);
	}

	@When("click the login button")
	public void clickTheLoginButton() {
		 FacebookPojo f=new FacebookPojo();
	    toClick(f.getLoginbtn());
	    implicitWait();
	}

	@Then("navigate into corresponding page")
	public void navigateIntoCorrespondingPage() {
		FacebookPojo f=new FacebookPojo();
		Assert.assertTrue(toGetText2(f.getTextcontent(), "The email address or mobile number you entered isn't connected to an account."));
		System.out.println("Asseert pass");
	}
	
	@When("to pass values in username and password field and click the login button")
	public void toPassValuesInUsernameAndPasswordFieldAndClickTheLoginButton() {
		FacebookPojo f=new FacebookPojo();
        toFillInput(f.getUsername(), "prinku@123");
	    toFillInput(f.getPassword(), "98373476364");
	    toClick(f.getLoginbtn());
	}

	@Then("navigate into error page")
	public void navigateIntoErrorPage() {
	   Assert.assertTrue(false);
	}


//examples:

//	@When("user enter the values in {string} and {string}> field")
//	public void userEnterTheValuesInAndField(String user, String pass) {
//	    FacebookPojo f=new FacebookPojo();
//	    toFillInput(f.getUsername(), user);
//	    toFillInput(f.getPassword(), pass);
//	}
// 1 dimensional map
//	@When("user enter the values in username and password field")
//	public void userEnterTheValuesInUsernameAndPasswordField(io.cucumber.datatable.DataTable d) {
//		
//	    FacebookPojo f=new FacebookPojo();
//	    Map<String, String> map = d.asMap(String.class, String.class);
//	    String user = map.get("username");
//	    String pass = map.get("password");
//	  	    toFillInput(f.getUsername(), user);
//	    toFillInput(f.getPassword(), pass);
//	}


}