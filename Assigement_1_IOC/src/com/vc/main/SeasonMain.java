package com.vc.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import com.vc.sbeans.Season;

public class SeasonMain 
{
    public static void main(String args[])
    {
       FileSystemXmlApplicationContext ctx = 
       new FileSystemXmlApplicationContext("src/com/vc/cfgs/applicationContext.xml");
	   
     Season s1 = ctx.getBean("ss", Season.class);	
                 
     String result = s1.seasonName(" Now ,You can Travel.");
              
     System.out.println( result);
          
     ctx.close();
    }
}

