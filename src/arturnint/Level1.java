/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arturnint;

import com.sun.javafx.tk.Toolkit;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 *
 * @author Niteesh
 */
public class Level1 extends javax.swing.JFrame {
int ev=0;
//static int xn;
static int xn=64; /* xn  = no. of tiles required in even no.*/
int ct=xn;
Btn tT1;
int tn=10;/* tn  = no. of types of tiles required + 1  */

public Level1() {
       initComponents();
       //llb5.setVisible(false);
       addb();
       rand();
        
    }

public void check(int ev,Btn tN) 
    {
        if(ev==1)
        { 
           tT1=tN;
        }
      
        ImageIcon im= (ImageIcon) tT1.getIcon();
         if(ev==2 && tN==tT1)
            {
              ev=0;   
              tT1.setIcon(null);
              
            }
        // tT1.setVisible(false);
        if(ev==2)
        {
           ImageIcon im2= (ImageIcon) tN.getIcon();
               if(im.getImage()==im2.getImage() && tN!=tT1)
               {
                   try
         {
             Thread.sleep(500);
         }
         catch(Exception ex)
         {
             
         }
                   tT1.setVisible(false);
                   tN.setVisible(false);
                   ct=ct-2;
                   llb5.setText(ct+"");
               }
               
        }      
    }

void act1(ActionEvent evt) {
     Btn tm=(Btn) evt.getSource();
      ev++;
      if(ev==1)
      {
                    tm.setBackground(Color.WHITE);

          tm.setIcon(tm.getPressedIcon());
      }
      if(ev==2)
      {
          tm.setBackground(Color.WHITE);
          tm.setIcon(tm.getPressedIcon());
          
      }
      if(ev>2)
      {
          ev=1;
          for(int i=0;i<xn;i++)
    {
         
        T[i].setIcon(null);
        T[i].setBackground(Color.BLUE);
      
    }
          tm.setBackground(Color.WHITE);
          tm.setIcon(tm.getPressedIcon());
          
      }
      check(ev,tm);
    }
       /**
     * Creates new form Level1
     */
    
    Btn T[]=new Btn[xn];
public void addb()
{
    
    int j=0,ti=0,lm=30,tm=30;
     
    for(int i=0;i<xn;i++)
    {
    T[i]=new Btn();
   /* to place your self 
    if(i%6==0 && i!=0)
    {
        j++;
        ti=0;
        
    }
    else if(i==0)
    {
        
    }
    else
    {
        ti++;
        
    }*/
   // T[i].setBounds(ti*90+10+lm, j*100+10+tm, 85, 80);
    T[i].setSize(85, 80); // being placed according to layout
    T[i].addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                act1(evt);
            }
        });
    Br1.add(T[i]);
    }
}
int ij[]=new int[xn];
      Date dt= new Date();
       long ln=0;
/* for n - tiles*/
int[] temp=new int[tn-1];
public void rand()
    {  
       ln=dt.getTime();
       Tim1.setText(ln+"");
        for(int j=0;j<xn;j++)
        {
          ij[j]=0;
        }
        int j=0;
        
        while(j<xn)
        {
        double ran=(10*Math.random()-1);
        int ra=(int)(ran);
       
        ra++;
        try
        {
        ij[j]=ra;
        }
        catch(Exception ex)
        {
            System.out.print(" ex1 ");
            break;
        }
        j++;
        }
        int[] cont=new int[tn];
        int[] con=new int[tn];
        int cci;
        
       for(int jk=0;jk<xn;jk++)
        {
               for(cci=tn+1;cci>0;cci--)
               {
                     if(ij[jk]%cci==0 && ij[jk]/cci==1)
                    {
                        cont[cci]++;
                        con[cci]=jk;  
                     }
                }
        }
               for(cci=tn-1;cci>1;cci--)
               {
                   for(int t=1;t<cci;t++)
                   {
                   if(cont[cci]%2==1 && cont[cci-t]%2==1)
                     {
                         ij[con[cci-t]]=cci;
                         cont[cci-t]--;
                         cont[cci]++;
                      }
                   }
               }
        for(int i=0;i<xn;i++)
        {
          //T[i].setText(ij[i]+""); 
           try
            {
                T[i].setPressedIcon(new ImageIcon(getClass().getResource("/arturnint/P"+ij[i]+".png")));
            }
           catch(Exception ex)
            {
                System.out.print("  ex2 "); 
                break;       
            }
       
        }    
  
    }
public  void los()
    {
        ls();
    }
    public void ls()
    {
        for(int i=0;i<xn;i++)
           {
               T[i].setEnabled(false);
           }
    }
    
    
    public void null2()
    {
          for(int i=0;i<xn;i++)
           {
               T[i].setIcon(null);
           }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Br1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        llb5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tim1 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Br1.setBackground(new java.awt.Color(255, 255, 255));
        Br1.setMinimumSize(new java.awt.Dimension(900, 800));
        Br1.setPreferredSize(new java.awt.Dimension(900, 800));
        Br1.setLayout(new java.awt.GridLayout(8, 8, 5, 5));
        getContentPane().add(Br1, java.awt.BorderLayout.CENTER);

        jPanel3.setBackground(new java.awt.Color(255, 51, 153));

        jPanel2.setOpaque(false);

        llb5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        llb5.setForeground(new java.awt.Color(255, 255, 255));
        llb5.setText("64");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Tiles Left:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(llb5)
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(llb5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Time:");

        Tim1.setBackground(new java.awt.Color(102, 102, 102));
        Tim1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        Tim1.setForeground(new java.awt.Color(255, 255, 255));
        Tim1.setText("3600");
        Tim1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Tim1MouseMoved(evt);
            }
        });
        Tim1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Tim1FocusLost(evt);
            }
        });
        Tim1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                Tim1PropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Tim1)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Tim1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToggleButton1.setText("Replay");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(194, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.WEST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Tim1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tim1MouseMoved

    }//GEN-LAST:event_Tim1MouseMoved

    private void Tim1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Tim1FocusLost

        if(Tim1.getText()!="" && thr.isAlive()==false)
        {
            Tim1.setText("");
            Tim1.setText("you won");

        }
    }//GEN-LAST:event_Tim1FocusLost

    private void Tim1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_Tim1PropertyChange
        /*   if(thr.isAlive() && )
        {

        }
        */   //    else
        
        if (Double.parseDouble(Tim1.getText())<0)
        {
           ls();
           
           thr.suspend();
           
           Tim1.setText("0");
        }
       // for(int i=0;i<xn;i++)
           {
             /* if( T[i].isVisible() )
              {
                 ct++; 
              }*/
           }
        if(ct!=0)
        {
            llb5.setText(ct+"");
        }
        else
        {
            thr.suspend();
            Tim1.setText("you won");
            
        }
    }//GEN-LAST:event_Tim1PropertyChange

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
    this.setVisible(true);
    this.dispose();
    thr.rst();
    new Level1().setVisible(true);
    }//GEN-LAST:event_jToggleButton1ActionPerformed
static TimeW thr=new TimeW();
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Level1().setVisible(true);
                thr.start();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Br1;
    public static javax.swing.JLabel Tim1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel llb5;
    // End of variables declaration//GEN-END:variables
}
