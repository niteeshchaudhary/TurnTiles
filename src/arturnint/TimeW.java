/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arturnint;

//import sun.util.calendar.LocalGregorianCalendar.Date;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


//import sun.util.calendar.BaseCalendar.Date;


/**
 *
 * @author Pooja~Priya
 */

public class TimeW extends Thread{
    Date pd=new Date();
    long ln=pd.getTime();
    long tme=0;
    public TimeW()
    {
       pd=new Date();
       ln=pd.getTime();
       tme=0;
    }
    public void rst()
    {
       pd=new Date();
       ln=pd.getTime();
       tme=0;
    }
public void run()
{
    while(true)
    {
    Date dd=new Date();    
    tme=(dd.getTime()-ln)/60;
    //tme=tme-ln;
     Level1.Tim1.setText((1*2900-tme)+"");
    if (1*3000-tme<=0)
    {
        Level1.Tim1.setText("0");
        break;
    }
    }
   
}
   
    
}
