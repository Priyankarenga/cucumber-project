package org.pojo;

import java.io.IOException;
import org.base.BaseClass;
public class AdactIn extends BaseClass {
	public static void main(String[] args) throws IOException {
		openChrome();
		toPassUrl("https://adactinhotelapp.com/");
		maxWindow();
		//login-1
		LoginPojo l=new LoginPojo();
		
		toFillInput(l.getTxtuser(), excelRead(1, 0));
		
		toFillInput(l.getTxtpass(), excelRead(1, 1));
		
		toClick(l.getBtnlogin());
		
		//window-2
		 SearchPojo s=new SearchPojo();
		 
		 toSelectVisibletext(s.getLoca(),excelRead(1, 2));
		 
		 toSelectVisibletext(s.getAdultRoom(), excelRead(1, 3));
		 
		 toFillInput(s.getDateIn(), excelRead(1, 4));
		 
		 toFillInput(s.getDateOut(), excelRead(1, 5));
		 
		 toSelectVisibletext(s.getAdultRoom(), excelRead(1, 6));
		 
		 toClick(s.getSub());
		 
		//window-3
		 toClick(s.getBtnRadio());
		 
		 toClick(s.getBtnContinue());
		 
		//window-4
		 BookingPojo b=new BookingPojo();
		 toFillInput(b.getFirstName(), excelRead(1, 7));
		 
		 toFillInput(b.getLastName(), excelRead(1, 8));
		 
		 toFillInput(b.getAddress(), excelRead(1, 9));
		 
		 toFillInput(b.getCreditCard(),excelRead(1, 10));
		 
		 toSelectVisibletext(b.getCardType(), excelRead(1, 11));
		 
		 toSelectVisibletext(b.getExpMonth(),excelRead(1, 12));
		 
		 toSelectVisibletext(b.getExpYear(), excelRead(1, 13));
		 
		 toFillInput(b.getCvv(), excelRead(1, 14));
		 
		 toClick(b.getBooking());
		 
		 implicitWait();
		 
			//window-5
		 toGetAttribute(b.getOrderNo(), "value");
		 
		 System.out.println("priyanka was done");
}
}