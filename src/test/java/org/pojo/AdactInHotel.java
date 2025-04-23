package org.pojo;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;

public class AdactInHotel extends BaseClass{
public static void main(String[] args) throws IOException {
	openChrome();
	toPassUrl("https://adactinhotelapp.com/");
	maxWindow();
	//login-1
	LoginPojo l=new LoginPojo();
	
	 WebElement txtuser = l.getTxtuser();
	 toFillInput(txtuser, excelRead(1,0));
	
	 
	 WebElement txtpass = l.getTxtpass();
	 toFillInput(txtpass, excelRead(1,1));
	
	 WebElement btnlogin = l.getBtnlogin();
	 toClick(btnlogin);
	 
	 //window-2
	 SearchPojo s=new SearchPojo();
	 
	 WebElement loca = s.getLoca();
	 toSelectVisibletext(loca,excelRead(1,2));
	 
	 WebElement rooms = s.getRooms();
	 toSelectVisibletext(rooms,excelRead(1,3));
	 
	 WebElement dateIn = s.getDateIn();
	 toFillInput(dateIn, excelRead(1,4));
	 
	 WebElement dateOut = s.getDateOut();
	 toFillInput(dateOut, excelRead(1, 5));
	 
	 WebElement adultRoom = s.getAdultRoom();
	 toSelectVisibletext(adultRoom,excelRead(1,6));
	 
	 WebElement sub = s.getSub();
	 toClick(sub);
	 //window-3
	 WebElement btnRadio = s.getBtnRadio();
	 toClick(btnRadio);
	 
	 WebElement btnContinue = s.getBtnContinue();
	 toClick(btnContinue);
	 //window-4
	 BookingPojo b=new BookingPojo();
	 
	 WebElement firstName = b.getFirstName();
	 toFillInput(firstName, excelRead(1, 7));
	 
	 WebElement lastName = b.getLastName();
	 toFillInput(lastName, excelRead(1, 8));
	 
	 WebElement address = b.getAddress();
	 toFillInput(address, excelRead(1, 9));

	 WebElement creditCard = b.getCreditCard();
	 toFillInput(creditCard, excelRead(1, 10));
		
	 WebElement cardType = b.getCardType();
	 toSelectVisibletext(cardType,excelRead(1,11));
	 
	 WebElement expMonth = b.getExpMonth();
	 toSelectVisibletext(expMonth,excelRead(1,12));
	 
	 WebElement expYear = b.getExpYear();
	 toSelectVisibletext(expYear,excelRead(1,13));
	 
	 WebElement cvv = b.getCvv();
	 toFillInput(cvv, excelRead(1, 14));

	 WebElement booking = b.getBooking();
	 toClick(booking);	
	 
		implicitWait();
		//window-5
	 WebElement orderNo = b.getOrderNo();
	 toGetAttribute(orderNo,"value");

}
}
