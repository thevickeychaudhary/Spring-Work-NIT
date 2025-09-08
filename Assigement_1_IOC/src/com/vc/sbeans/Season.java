package com.vc.sbeans;


import java.time.LocalDate;


public class Season 
{
    private LocalDate date;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
    
	public String seasonName(String sName)
	{
		int month = date.getMonthValue();
		System.out.println("Current Month name :"
		+ " "+"("+month+")"+ " : "+date.getMonth());
		
		if(month>=3 && month<=6)
		{
			return "It's Summer Time ." +sName;
		}
		else if(month>=7 && month<=10)
		{
			return "It's Rainy Time ."+sName;
		}
		else
		{
			return"Tt's Winter Time ."+sName;
		}
		
	}
    
    
}
