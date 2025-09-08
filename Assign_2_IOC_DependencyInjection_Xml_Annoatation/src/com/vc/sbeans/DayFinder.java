package com.vc.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// target class
@Component("sf")
public class DayFinder 
{
   private LocalDate date;
   public DayFinder() {}
   @Autowired
   public void setDate(LocalDate date) {
	   this.date = date;
   }   
   public String showDayName()
   {
	   DayOfWeek weak = date.getDayOfWeek();
	   
       switch (weak) {
       case MONDAY:
       case TUESDAY:
       case WEDNESDAY:
       case THURSDAY:
       case FRIDAY:
           return "Happy Working Day !";

       case SATURDAY:
       case SUNDAY:
           return "Enjoy the Weekend !";

       default:
           return "Invalid Day";
   }

   }

}