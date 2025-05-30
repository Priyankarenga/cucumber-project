package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPojo extends BaseClass {
public BookingPojo() {
	PageFactory.initElements(driver, this);
}
	@FindBy(id="first_name")
	 private WebElement firstName;
	 
	 @FindBy(id="last_name")
	 private WebElement lastName;
	 
	 @FindBy(id="address")
	 private WebElement address;
	 
	 @FindBy(id="cc_num")
	 private WebElement creditCard;
	 
	 @FindBy(id="cc_type")
	 private WebElement cardType;
	 
	 @FindBy (id="cc_exp_month")
	 private WebElement expMonth;
	 
	 @FindBy (id="cc_exp_year")
	 private WebElement expYear;
	 
	 @FindBy (id="cc_cvv")
	 private WebElement cvv;
	 
	 @FindBy (id="book_now")
	 private WebElement booking;
	 
	 @FindBy (id="order_no")
	 private WebElement orderNo;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCard() {
		return creditCard;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooking() {
		return booking;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}
	 

}