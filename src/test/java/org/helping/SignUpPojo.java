package org.helping;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPojo extends BaseClass {

	public SignUpPojo() {
		PageFactory.initElements(w, this);
	}
	
	@FindBy(name = "firstname")
	private WebElement fstname;
	
	@FindBy(name="lastname")
	private WebElement lstname;
	
	@FindBy(xpath = "//input[@aria-label='Mobile number or email address']")
	private WebElement mblNum;
	
	@FindBy(id="password_step_input")
	private WebElement newPass;

	@FindBy(id="day")
	private WebElement selectday;
	
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement createNewAcc;
	
	@FindBy(xpath = "(//input[@id='sex'])[2]")
	private WebElement clickMale;
	
	@FindBy(xpath = "(//input[@id='sex'])[1]")
	private WebElement clickFemale;
	
	
	public WebElement getClickFemale() {
		return clickFemale;
	}


	public WebElement getClickMale() {
		return clickMale;
	}


	public WebElement getCreateNewAcc() {
		return createNewAcc;
	}
	
	public WebElement getSelectday() {
		return selectday;
	}

	public WebElement getSelectmonth() {
		return selectmonth;
	}

	public WebElement getSelectyear() {
		return selectyear;
	}

	@FindBy(id="month")
	private WebElement selectmonth;
	

	@FindBy(id="year")
	private WebElement selectyear;

	
	

	public WebElement getFstname() {
		return fstname;
	}

	public WebElement getLstname() {
		return lstname;
	}

	public WebElement getMblNum() {
		return mblNum;
	}

	public WebElement getNewPass() {
		return newPass;
	}
	

	
	
}
