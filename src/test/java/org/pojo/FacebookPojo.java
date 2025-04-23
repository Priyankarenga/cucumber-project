package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPojo extends BaseClass {
public FacebookPojo() {
	 PageFactory.initElements(driver, this);
}
@FindBy(id="email")
private WebElement username;

@FindBy(id="pass")
private WebElement password;

@FindBy(name="login")
private WebElement loginbtn;

@FindBy(xpath="//div[contains(text(),'The email address or mobile number')]")
private WebElement textcontent;

public WebElement getTextcontent() {
	return textcontent;
}

public WebElement getUsername() {
	return username;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLoginbtn() {
	return loginbtn;
}


}
