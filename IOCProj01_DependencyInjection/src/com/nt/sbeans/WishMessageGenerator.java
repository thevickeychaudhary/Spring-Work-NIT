package com.nt.sbeans;

import java.time.LocalTime;
import java.time.LocalDate;

// target spring bean class
public class WishMessageGenerator
{
        // Has - A Property(Composition)
	
	private LocalTime time;
	private LocalDate date;

	// setter method for setter injection 

	public void setTime(LocalTime time) 
	{
		System.out.println("MessageGenerator:setTime()");
		this.time = time;
	}
	public void setDate(LocalDate date)
	{
		System.out.println("WishMessageGeneratoe.setDate()");
		this.date=date;
	}

	
	public LocalTime getTime() {
		return time;
	}
	public LocalDate getDate() {
		return date;
	}
	// b.method
	public String showWishMessage(String user)
	{
		System.out.println("WishMessageGenerator:showMessage()");
		int hour = time.getHour();
		//generate the wish message
		if(hour<12)
		{
			return "Good Morning"+user;
		}
		else if(hour<16)
		{
			return "Good Afternoon:"+user;
		}else if(hour<18)
		{
			return "Good Evening"+user;
		}else
		{
			return "Good Night"+user;
		}
	}
}
