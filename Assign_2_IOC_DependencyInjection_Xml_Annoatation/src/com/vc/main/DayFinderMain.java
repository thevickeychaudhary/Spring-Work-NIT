package com.vc.main;


import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.vc.sbeans.DayFinder;

public class DayFinderMain 
{
    public static void main(String args[])
    {
    	@SuppressWarnings("resource")
    	
    	FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/vc/cfgs/applicationContext.xml");
    	
    	Object obj = ctx.getBean("sf");
    	
    	DayFinder  sf = (DayFinder)obj;
    	
    	try
    	{
    		String msg = sf.showDayName();
    		System.out.println(msg);
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	
    	
    }
}
