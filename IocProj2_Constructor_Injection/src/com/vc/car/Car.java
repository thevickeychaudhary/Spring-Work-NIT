package com.vc.car;

import com.vc.engine.Engine;
import java.time.LocalTime;
// target class
public class Car
{
    //Engine eng;
    LocalTime time;
    public Car (LocalTime time)
    {
    	
    	this.time=time;
    }
    
//    public void setCar(Engine eng)
//    {
//    	this.eng=eng;
//    }
    
    public void run()
    {
    	System.out.println("Local time is : " +time );
    	//eng.start();
    }
    
}
