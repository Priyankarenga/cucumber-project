package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottenPassPojo extends BaseClass {
public ForgottenPassPojo() {
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='Forgotten password?']")
private WebElement forgotPass;

@FindBy(xpath="//input[@type='text']")
private WebElement email;

@FindBy(xpath="//button[@type='submit']")
private WebElement search;

public WebElement getForgotPass() {
	return forgotPass;
}

public WebElement getEmail() {
	return email;
}

public WebElement getSearch() {
	return search;
}
}
