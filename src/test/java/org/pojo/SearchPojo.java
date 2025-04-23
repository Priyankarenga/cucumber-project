package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPojo extends BaseClass {
	public SearchPojo(){
		 PageFactory.initElements(driver, this);
	 }
	@FindBy(id="location")
	 private WebElement loca;
	 
	 @FindBy(id="room_nos")
	 private WebElement rooms;
	 
	 @FindBy(id="datepick_in")
	 private WebElement dateIn;
	 
	 @FindBy(id="datepick_out")
	 private WebElement dateOut;
	 
	 @FindBy(id="adult_room")
	 private WebElement adultRoom;
	 
	 @FindBy (id="Submit")
	 private WebElement sub;
	 
	 @FindBy (id="radiobutton_1")
	 private WebElement btnRadio;
	 
	 @FindBy (id="continue")
	 private WebElement btnContinue;

	public WebElement getLoca() {
		return loca;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getDateIn() {
		return dateIn;
	}

	public WebElement getDateOut() {
		return dateOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getSub() {
		return sub;
	}

	public WebElement getBtnRadio() {
		return btnRadio;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	 
	
}
