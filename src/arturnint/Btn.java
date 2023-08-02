/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arturnint;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Date;
/**
 *
 * @author Pooja~Priya
 */
public class Btn extends JButton
{
    public Btn()
    {
           
           this.setBackground(Color.blue);
    
    }
    /* for 4 tiles 
    public void rand2()
    {
      
       ln=dt.getTime();
       Tim1.setText(ln+"");
        for(int j=0;j<xn;j++)
        {
          ij[j]=0;
        }
        int j=0;
        while(ij[xn-1]==0)
        {
        double ran=((10*Math.random())-1)/2;
        int ra=(int)(ran/1);
        
        if(ra<1)
        {
            ra=4;
           
        }
        ij[j]=ra;
        j++;
        }
        int cnt1=0,cnt2=0,cnt3=0,cnt4=0;
        int cn1=0,cn2=0,cn3=0,cn4=0;
       
        for(int jk=0;jk<xn;jk++)
        {
            if(ij[jk]%4==0)
            {
                cnt4++;
                cn4=jk;
            }
            else if(ij[jk]%3==0)
            {
                cnt3++;
                 cn3=jk;
            }
            else if(ij[jk]%2==0)
            {
                cnt2++;
                 cn2=jk;
            }
            else
            {
                cnt1++;
                 cn1=jk;
            }
                    
        }
        if(cnt1%2==1 && cnt4%2==1)
        {
           
            ij[cn1]=4;
            cnt4++;
            cnt1--;
            
        }  
         if(cnt3%2==1 && cnt1%2==1)
        {
            ij[cn1]=3;
            cnt3++;
            cnt1--;
        } 
         if(cnt2%2==1 && cnt1%2==1)
        {
             ij[cn1]=2;
            cnt2++;
            cnt1--;
        }          
         if(cnt2%2==1 && cnt4%2==1)
        {
            ij[cn2]=4;
            cnt4++;
            cnt2--;
        }  
         if(cnt3%2==1 && cnt2%2==1)
        {
            ij[cn2]=3;
            cnt3++;
            cnt2--;
        } 
         if(cnt3%2==1 && cnt4%2==1)
        {
            ij[cn3]=4;
             cnt3--;
            cnt4++;
        }
          for(int i=0;i<xn;i++)
    {
        T[i].setPressedIcon(new ImageIcon(getClass().getResource("/arturnint/P"+ij[i]+".png")));
    }   
    }*/
}