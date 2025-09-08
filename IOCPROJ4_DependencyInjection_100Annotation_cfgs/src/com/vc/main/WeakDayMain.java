package com.vc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vc.config.AppConfig;
import com.vc.sbeans.WeakDayFinder;


public class WeakDayMain 
{
  public static void main (String args[])
  {
	  
	  AnnotationConfigApplicationContext ctx = new 
			  AnnotationConfigApplicationContext(AppConfig.class);
	  
	  WeakDayFinder finder = (WeakDayFinder) ctx.getBean("wdf");
	  
	  String msg = finder.showDay("Raja");
	  
	  System.out.println(msg);
	  ctx.close();
	  
  }
}
