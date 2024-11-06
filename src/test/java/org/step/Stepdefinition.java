package org.step;

import java.util.List;
import java.util.Map;

import org.helping.BaseClass;
import org.helping.ForgotPassPojo;
import org.helping.SignUpPojo;
import org.helping.loginPojo;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass {
	
	
	   
	@Given("To Launch the FaceBook URL")
	public void to_Launch_the_FaceBook_URL() {
	   launchURL("https://www.facebook.com/");
	}

	@When("Pass the values for {string} and {string}")
	public void pass_the_values_for_and(String user, String pwd) {
		loginPojo l = new loginPojo();
	    toPassTheValues(l.getEmail(), user);
	    toPassTheValues(l.getPassword(), pwd);
	}

	@When("Click the login button")
	public void click_the_login_button() {
		loginPojo l1 = new loginPojo();
	    toClickTheButton(l1.getLogin());
	}
	
	
	
	@Given("To launch the createNewAcc URL")
	public void to_launch_the_createNewAcc_URL() {
	    launchURL("https://www.facebook.com/");
	 }

	@Given("To Click the Create New Account URL")
	public void to_Click_the_Create_New_Account_URL() {
		SignUpPojo sup = new SignUpPojo();
		toClickTheButton(sup.getCreateNewAcc());
	}
		
	@When("To pass the values for FirstName, LastName, MobileNumber, NewPassword values")
	public void to_pass_the_values_for_FirstName_LastName_MobileNumber_NewPassword_values(io.cucumber.datatable.DataTable table) {
		List<List<String>> lists = table.asLists();
		List<String> list = lists.get(1);
		
		SignUpPojo sup = new SignUpPojo();
	  toPassTheValues(sup.getFstname(), list.get(0));
	  toPassTheValues(sup.getLstname(), list.get(1));
	  toPassTheValues(sup.getMblNum(), list.get(2));
	  toPassTheValues(sup.getNewPass(), list.get(3));
	}
	
	
	@When("Select the values for DateOfBirth and Gender")
	public void select_the_values_for_DateOfBirth_and_Gender() {
		
		SignUpPojo sup = new SignUpPojo();
	    dropDownByValue(sup.getSelectday(), "5");
		dropDownByValue(sup.getSelectmonth(), "4");
		dropDownByValue(sup.getSelectyear(), "1994");
				
		toClickTheButton(sup.getClickMale());
	}
	
	
	@Given("We have to launch the Facebook URL")
	public void we_have_to_launch_the_Facebook_URL() {
	   launchURL("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
	}

	@When("User have to pass the value for Email or MobileNumber")
	public void user_have_to_pass_the_value_for_Email_or_MobileNumber(io.cucumber.datatable.DataTable table) {
	   ForgotPassPojo fpp = new ForgotPassPojo();
	   
	   List<String> list = table.asList();
	   toPassTheValues(fpp.getEmail(), list.get(0));
	   toRefreshThePage();
	   toPassTheValues(fpp.getEmail(), list.get(1));
	   toRefreshThePage();
	   toPassTheValues(fpp.getEmail(), list.get(2));
	   
	   toClickTheButton(fpp.getSearch());
	   
	}

	@Given("To launch the Facebook URL and click CreateNewAcc button")
	public void to_launch_the_Facebook_URL_and_click_CreateNewAcc_button() {
		Assert.assertTrue(false);
		
		launchURL("https://www.facebook.com/");
		
		SignUpPojo sup = new SignUpPojo();
	    toClickTheButton(sup.getCreateNewAcc());		
	}

	
	@When("To pass the values for SignUp page")
	public void to_pass_the_values_for_SignUp_page(io.cucumber.datatable.DataTable table) {
		Assert.assertTrue(false);
		
		List<Map<String, String>> maps = table.asMaps();
		Map<String, String> map = maps.get(1);
		
		SignUpPojo sup = new SignUpPojo();
		
		toPassTheValues(sup.getFstname(), map.get("Firstname"));
		toPassTheValues(sup.getLstname(), map.get("Lastname"));
		toPassTheValues(sup.getMblNum(), map.get("MobileNumber"));
		toPassTheValues(sup.getNewPass(), map.get("NewPassword"));
		
		dropDownByValue(sup.getSelectday(), "25");
		dropDownByValue(sup.getSelectmonth(), "10");
		dropDownByValue(sup.getSelectyear(), "2000");
		
		toClickTheButton(sup.getClickFemale());
	}
	
	
	
}
