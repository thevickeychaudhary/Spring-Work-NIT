package com.vc.sbeans;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// target class
@Component("sf")
public class SeasonFinder 
{
   private LocalDate date;
   
   public SeasonFinder() 
   {
	   System.out.println("SeasonFinder.SeasonFinder()");
   }
   
   @Autowired
  
   public void setDate(LocalDate date) {
	   this.date = date;
   }   
   
   public String showSeasonName()
   {
	   int month = date.getMonthValue();
	   
	   if(month>=3 && month<=6)
	   {
		  return "Summer Season";
	   }
	   else if(month>=7 && month<=10)
	   {
		   return "Rainy Season";
	   }
	   else
	   {
		   return "winter Season";   
	   }	   
   }

}
