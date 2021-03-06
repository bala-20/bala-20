//WishMessageGenerator.java (target spring bean class)
package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WishMessageGenerator {
	  // HAS-A property;
	
	@Autowired
	@Qualifier("dt")
    private   Date  date;
    
	
	


	 @Autowired
	   public WishMessageGenerator(@Qualifier("dt2") Date  date) {
		System.out.println("WishMessageGenerator:: 1-param costructor)");
		this.date=date;
		
	}
	 
	 
	 @Autowired
	   @Qualifier("dt3")
	   public  void   assign(Date date) {
	   	System.out.println("WishMessageGenerator.assign()");
	   	this.date=date;
	   }
	 
	  @Autowired
		@Qualifier("dt1")
		public void setDate(Date date) {
			System.out.println("WishMessageGenerator.setDate()");
			this.date=date;
		}
   
  
    
	 

    // b.method
    public  String  showWishMessage(String user) {
    	System.out.println("WishMessageGenerator.showWishMessage()  :: date::"+date.getYear());
    	// get current hour of the day
    	int hour=date.getHours(); // gives in 24 hours format (0-23)
    	//generate the wish message
    	if(hour<12)
    		return "Good Morning::"+user;
    	else if(hour<16)
    		return "Good AfterNoon::"+user;
    	else if(hour<20)
    		return "Good Evening::"+user;
    	else
    		return "Good Night::"+user;
    }
    
    
}//class
