package com.vc.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeakDayFinder     // Target Spring Bean class
{
    @Autowired
	private LocalDate date;   // Has-A Property

	public WeakDayFinder() 
	{
	System.out.println("WekkDayFinder : 0 param Constructor");
	}
	
	// business method
	
	public String showDay(String user)
	{
		
		System.out.println("WeakDayFinder.showDay()");
		
		int wno = date.getDayOfWeek().getValue();
		
		if(wno>=1 && wno<=5)
		{
			return "Work Hard :"+user;
		}
		else
		{
			return "Relax"+user;
		}
	}    
}