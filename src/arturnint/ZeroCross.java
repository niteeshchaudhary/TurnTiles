/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arturnint;


import java.awt.event.MouseEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author NKC
 */
public class ZeroCross extends javax.swing.JFrame implements Runnable{
    
    String drv="com.mysql.jdbc.Driver",conurl="jdbc:mysql://localhost:3306/chatdb";
    String mspass=null;
    Thread thre;
    int errhandler=0;
    //TimeW thre2;
    public ZeroCross(String ss,String cu,String op,String symb,int tr) {
        initComponents();
        symbl.setText(symb);
        cplayer.setText((cu.charAt(0)+"").toUpperCase());
        oplayer.setText((op.charAt(0)+"").toUpperCase());
        oo.setText(op);
        cc.setText(cu);
        ul.setVisible(false);
        ul.setVisible(true);
        trn.setText(tr+"");
        switch (symb) {
            case "X":
                symbl1.setText("O");
                break;
            case "O":
                symbl1.setText("X");
                break;
        }
        //oplayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChitChat/"+symbl1.getText()+"2.png")));
        //cplayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ChitChat/"+symb+"1.png")));
        clrLb();
        enabeledT();
        errhandler=0;
        rname.setText(ss);
        if(tr==1)
        {
            
        }
        iftb();
        iniup();
       // thre2=new TimeW(Integer.parseInt(tc.getText()),ss);
        thre=new Thread(this);
        thre.start();
       // thre2.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cplayer = new javax.swing.JLabel();
        symbl = new javax.swing.JLabel();
        ul = new javax.swing.JLabel();
        uprog = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        cc = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        oplayer = new javax.swing.JLabel();
        symbl1 = new javax.swing.JLabel();
        ol = new javax.swing.JLabel();
        oprog = new javax.swing.JProgressBar();
        oo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        trn = new javax.swing.JLabel();
        rname = new javax.swing.JLabel();
        tc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lb1.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1.setText("X");
        lb1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 51)));
        lb1.setName("c1"); // NOI18N
        lb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb1MouseClicked(evt);
            }
        });

        lb2.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        lb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb2.setText("O");
        lb2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 51)));
        lb2.setName("c2"); // NOI18N
        lb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb2MouseClicked(evt);
            }
        });

        lb3.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        lb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb3.setText("X");
        lb3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 51)));
        lb3.setName("c3"); // NOI18N
        lb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb3MouseClicked(evt);
            }
        });

        lb4.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        lb4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb4.setText("O");
        lb4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 51)));
        lb4.setName("c4"); // NOI18N
        lb4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb4MouseClicked(evt);
            }
        });

        lb5.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        lb5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb5.setText("X");
        lb5.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 51)));
        lb5.setName("c5"); // NOI18N
        lb5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb5MouseClicked(evt);
            }
        });

        lb6.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        lb6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb6.setText("O");
        lb6.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 51)));
        lb6.setName("c6"); // NOI18N
        lb6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb6MouseClicked(evt);
            }
        });

        lb7.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        lb7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb7.setText("X");
        lb7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 51)));
        lb7.setName("c7"); // NOI18N
        lb7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb7MouseClicked(evt);
            }
        });

        lb8.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        lb8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb8.setText("O");
        lb8.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 51)));
        lb8.setName("c8"); // NOI18N
        lb8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb8MouseClicked(evt);
            }
        });

        lb9.setFont(new java.awt.Font("Script MT Bold", 1, 48)); // NOI18N
        lb9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb9.setText("X");
        lb9.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 51)));
        lb9.setName("c9"); // NOI18N
        lb9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lb8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(lb9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 157, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cplayer.setFont(new java.awt.Font("Old English Text MT", 1, 48)); // NOI18N
        cplayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cplayer.setText("ap");
        cplayer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(cplayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, -1, -1));

        symbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        symbl.setText("X");
        jPanel3.add(symbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 619, 10, 0));

        ul.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel3.add(ul, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 268, -1, 62));

        uprog.setMaximum(200);
        uprog.setValue(200);
        jPanel3.add(uprog, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 162, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Leave/Quit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 111, -1));

        cc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cc.setForeground(new java.awt.Color(255, 255, 255));
        cc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cc.setText("jLabel2");
        jPanel3.add(cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 150, 40));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(757, 11, 259, 647));

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        oplayer.setFont(new java.awt.Font("Old English Text MT", 1, 48)); // NOI18N
        oplayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oplayer.setText("nk");
        oplayer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(oplayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 15, 212, -1));

        symbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        symbl1.setText("X");
        jPanel2.add(symbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 620, 10, 0));

        ol.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(ol, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 242, 232, 121));

        oprog.setMaximum(200);
        oprog.setValue(200);
        jPanel2.add(oprog, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 446, -1, 29));

        oo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        oo.setForeground(new java.awt.Color(255, 255, 255));
        oo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oo.setText("jLabel2");
        jPanel2.add(oo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 150, 40));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 647));

        jLabel1.setFont(new java.awt.Font("Snap ITC", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Zero-Cross");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 11, 423, 135));

        trn.setText("1");
        jPanel4.add(trn, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 578, -1, -1));

        rname.setText("appp");
        jPanel4.add(rname, new org.netbeans.lib.awtextra.AbsoluteConstraints(663, 578, -1, -1));

        tc.setText("1");
        jPanel4.add(tc, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 578, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(258, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb1MouseClicked
        insDb(evt);
    }//GEN-LAST:event_lb1MouseClicked

    private void lb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb2MouseClicked
       insDb(evt);        
    }//GEN-LAST:event_lb2MouseClicked

    private void lb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb3MouseClicked
      insDb(evt);
    }//GEN-LAST:event_lb3MouseClicked

    private void lb4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb4MouseClicked
     insDb(evt);
    }//GEN-LAST:event_lb4MouseClicked

    private void lb5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb5MouseClicked
       insDb(evt);
    }//GEN-LAST:event_lb5MouseClicked

    private void lb6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb6MouseClicked
      insDb(evt);
    }//GEN-LAST:event_lb6MouseClicked

    private void lb7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb7MouseClicked
      insDb(evt);
    }//GEN-LAST:event_lb7MouseClicked

    private void lb8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb8MouseClicked
   insDb(evt);
    }//GEN-LAST:event_lb8MouseClicked

    private void lb9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb9MouseClicked
    insDb(evt);
    }//GEN-LAST:event_lb9MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Connection con=null;
    ResultSet rs=null;
    Statement st=null;
     try{
      Class.forName(drv);
      con=DriverManager.getConnection(conurl, "root", mspass);
      st=con.createStatement();
      String qry="";
      System.out.println("lv 1");
      if(Integer.parseInt(trn.getText())>1)
      {
       qry="update zcxz set st"+2+"=0 where name='"+rname.getText()+"';"; 
      }
      else
      {
          qry="update zcxz set st"+1+"=0 where name='"+rname.getText()+"';"; 
      }
      synchronized(this)
      {
          System.out.println("lv 2");          
          int iii=st.executeUpdate(qry);
          System.out.println("5");
          st.close();
          con.close();
          lLost();
      }
     }
     catch(Exception ex)
     {
         System.out.println(ex+" leave");
     }
    }//GEN-LAST:event_jButton1ActionPerformed

private void insDb(MouseEvent evt)
{
    Connection con=null;
    ResultSet rs=null;
    Statement st=null;
    if(((JLabel)evt.getSource()).getText().isEmpty())
    {
     try{
      Class.forName(drv);
      con=DriverManager.getConnection(conurl, "root", mspass);
      st=con.createStatement();
      //String qry="Insert into zcxz(name,turn,tu2,st1,st2,sym1,sym2"+((JLabel)evt.getSource()).getText()
        //      +") values("+u1.getText()+"',"+Math.random()*100000+");";
      String qry="";
      String qryy="Select turn from zcxz where name='"+rname.getText()+"';";
      rs=st.executeQuery(qryy);
      rs.first();
      int ct=rs.getInt(1);
      System.out.println("1");
      if(Integer.parseInt(trn.getText())>1)
      {
       qry="update zcxz set "+((JLabel)evt.getSource()).getName()+" = '"+symbl.getText()+"' , turn="+1+" where name='"+rname.getText()+"';"; 
      }
      else
      {
       qry="update zcxz set "+((JLabel)evt.getSource()).getName()+" = '"+symbl.getText()+"' ,turn="+2+" where name='"+rname.getText()+"';"; 
      }
      //String qr="update zcxz  turn = "+trn.getText()
        //      + " where name = '"+rname.getText()+"';";
      synchronized(this)
      {
          System.out.println("2");
          if(ct==Integer.parseInt(trn.getText()))
          {
              System.out.println("3");
      //int ii=st.executeUpdate(qr);
      int iii=st.executeUpdate(qry);
              System.out.println("4");
      ((JLabel)evt.getSource()).setText(symbl.getText());
      ul.setVisible(false);
      ol.setVisible(true);
          }
          System.out.println("5");
          rs.close();
      st.close();
      con.close();
      chk();
      }
      
     }
     catch(Exception ex)
     {
         System.out.println(ex+" insDb");
     }
    }
}
  private void iftb() {
      Connection con1=null;
    ResultSet rs1=null;
    Statement st1=null;
      try{
      Class.forName(drv);
      con1=DriverManager.getConnection(conurl, "root", mspass);
      st1=con1.createStatement();
      //String qry="Insert into zcxz(name,turn,tu2,st1,st2,sym1,sym2"+((JLabel)evt.getSource()).getText()
        //      +") values("+u1.getText()+"',"+Math.random()*100000+");";
      String qry1="select count(*) from zcxz where name='"+rname.getText()+"';";
      String qry="";
      String qr=""; 
      rs1=st1.executeQuery(qry1);
      rs1.first();
      if(rs1.getInt(1)>0 && Integer.parseInt(trn.getText())==1)
      {
      qr="update zcxz set c1='',c2='',c3='',c4='',c5='',c6='',c7='',c8='',c9='',turn=1,st1=1,st2=2 where name='"+rname.getText()+"';";
      int ii=st1.executeUpdate(qr);
      }
      else if(rs1.getInt(1)==0 && Integer.parseInt(trn.getText())==1)
      {
       qr="insert into zcxz values('"+rname.getText()+"','','','','','','','','','',1,0,1,1,'x','o')";   
      int ii=st1.executeUpdate(qr);
      }
      qry="update zcxz set st"+trn.getText()+"=1 where name='"+rname.getText()+"';"; 
      int iii=st1.executeUpdate(qry);
      rs1.close();
      st1.close();
      con1.close();
     }
     catch(Exception ex)
     {
         System.out.println(ex+" iftb");
     }
      
  }
  private void chk() {
      // Rows..................................................................
     if(lb1.getText().equals(lb2.getText())&&lb1.getText().equals(lb3.getText())&&!lb1.getText().isEmpty())
     {
         if(lb1.getText().equals(symbl.getText()))
         {
             wWon();
         }
         else
         {
             lLost();
         }
     }
     else if(lb4.getText().equals(lb5.getText())&&lb4.getText().equals(lb6.getText())&&!lb4.getText().isEmpty())
     {
         if(lb4.getText().equals(symbl.getText()))
         {
             wWon(); 
         }
         else
         {
            lLost(); 
         }
     }
     else if(lb7.getText().equals(lb8.getText())&&lb7.getText().equals(lb9.getText())&&!lb7.getText().isEmpty())
     {
         if(lb7.getText().equals(symbl.getText()))
         {
             wWon(); 
         }
         else
         {
            lLost(); 
         }
     }
   //coloumn......................................................................
     else if(lb1.getText().equals(lb4.getText())&&lb1.getText().equals(lb7.getText())&&!lb1.getText().isEmpty())
     {
         if(lb1.getText().equals(symbl.getText()))
         {
             wWon(); 
         }
         else
         {
            lLost(); 
         }
     }
     else if(lb2.getText().equals(lb5.getText())&&lb2.getText().equals(lb8.getText())&&!lb2.getText().isEmpty())
     {
         if(lb2.getText().equals(symbl.getText()))
         {
             wWon(); 
         }
         else
         {
            lLost(); 
         }
     }
     else if(lb3.getText().equals(lb6.getText())&&lb3.getText().equals(lb9.getText())&&!lb3.getText().isEmpty())
     {
         if(lb3.getText().equals(symbl.getText()))
         {
             wWon(); 
         }
         else
         {
            lLost(); 
         }
     }
     //diagonal ....................................................................
     else if(lb1.getText().equals(lb5.getText())&&lb1.getText().equals(lb9.getText())&&!lb1.getText().isEmpty())
     {
         if(lb1.getText().equals(symbl.getText()))
         {
             wWon(); 
         }
         else
         {
            lLost(); 
         }
     }
     else if(lb7.getText().equals(lb5.getText())&&lb7.getText().equals(lb3.getText())&&!lb7.getText().isEmpty())
     {
         if(lb7.getText().equals(symbl.getText()))
         {
             wWon(); 
         }
         else
         {
            lLost(); 
         }
     }
     else if(!lb1.getText().equals("")&&!lb2.getText().equals("")&&!lb3.getText().equals("")&&
             !lb4.getText().equals("")&&!lb5.getText().equals("")&&!lb6.getText().equals("")&&
             !lb7.getText().equals("")&&!lb8.getText().equals("")&&!lb9.getText().equals(""))
     {
             tTie(); 
     }
    }
 private void enabeledT()
 {
     lb1.setEnabled(true);
      lb2.setEnabled(true);
      lb3.setEnabled(true);
      lb4.setEnabled(true);
      lb5.setEnabled(true);
      lb6.setEnabled(true);
      lb7.setEnabled(true);
      lb8.setEnabled(true);
      lb9.setEnabled(true);
 }
 private void enabeledF()
 {
     lb1.setEnabled(false);
      lb2.setEnabled(false);
      lb3.setEnabled(false);
      lb4.setEnabled(false);
      lb5.setEnabled(false);
      lb6.setEnabled(false);
      lb7.setEnabled(false);
      lb8.setEnabled(false);
      lb9.setEnabled(false);
 }
  private void clrLb()
 {
        lb1.setText("");
        lb2.setText("");
        lb3.setText("");
        lb4.setText("");
        lb5.setText("");
        lb6.setText("");
        lb7.setText("");
        lb8.setText("");
        lb9.setText("");
 }
  private void iniup() {
      try{
   Class.forName(drv);
      conp=DriverManager.getConnection(conurl, "root", mspass);
      stp=conp.createStatement();
      }
      catch(Exception ex)
      {
          System.out.println("iniup");
      }
  }
    private void showMN() {
        
    }
    
    private void showMNL() {
        
    }
 private void wWon() {   
      enabeledF();
      showMN();
      try{
      rsp.close();
      stp.close();
      conp.close();}catch(Exception ex){}
      
//      new MsWon().setVisible(true);
     this.dispose();
      thre.stop();
    }

    private void lLost()  {
      enabeledF();
      showMNL();
      try{
      rsp.close();
      stp.close();
      conp.close();}catch(Exception ex){}
//      new MsLost().setVisible(true);
      this.dispose();
      thre.stop();
    }
    
    private void tTie() {
       enabeledF();
      //showMNL();
       try{
      rsp.close();
      stp.close();
      conp.close();}catch(Exception ex){}
//      new MsTie().setVisible(true);
      this.dispose();
       thre.stop();
    }
    Connection conp=null;
    ResultSet rsp=null;
    Statement stp=null;
    private void updateState() {
     try{
      String qry="Select c1,c2,c3,c4,c5,c6,c7,c8,c9,turn,st1,st2 from zcxz where name='"+rname.getText()+"';";
      rsp=stp.executeQuery(qry);
      rsp.first();
      String c1=rsp.getString(1),c2=rsp.getString(2),c3=rsp.getString(3),c4=rsp.getString(4)
              ,c5=rsp.getString(5),c6=rsp.getString(6),c7=rsp.getString(7),c8=rsp.getString(8),c9=rsp.getString(9);
      int state=1;
     // thre2.tt=rs.getInt(10);
      tc.setText(rsp.getInt(10)+"");
      /*if(uprog.getValue()==0)
      {
        trn.setText("2");
      }*/
      if(Integer.parseInt(trn.getText())==1)
      {
          state=rsp.getInt(12);//other's state
      }
      else if(Integer.parseInt(trn.getText())==2)
      {
          state=rsp.getInt(11);
      }
      if(state==0)
      {
          JOptionPane.showMessageDialog(this, "your opponient left the game!!");
          wWon();
      }
      if(rsp.getInt(10)==Integer.parseInt(trn.getText()))
      {
          ul.setVisible(true);
          ol.setVisible(false);
      }
      else
      {
          ol.setVisible(true);
          ul.setVisible(false);
      }
      if(!c1.isEmpty())
      {
          lb1.setText(c1);
      }
      if(!c2.isEmpty())
      {
          lb2.setText(c2);
      }
      if(!c3.isEmpty())
      {
          lb3.setText(c3);
      }
      if(!c4.isEmpty())
      {
          lb4.setText(c4);
      }
      if(!c5.isEmpty())
      {
          lb5.setText(c5);
      }
      if(!c6.isEmpty())
      {
          lb6.setText(c6);
      }
      if(!c7.isEmpty())
      {
          lb7.setText(c7);
      }
      if(!c8.isEmpty())
      {
          lb8.setText(c8);
      }
      if(!c9.isEmpty())
      {
          lb9.setText(c9);
      }
      System.out.println("update 1"+trn.getText());
      chk();
     }
     catch(Exception ex)
     {
         if(errhandler>3||ex.getMessage().equals("com.mysql.jdbc.exceptions.jdbc4.MySQLNonTransientConnectionException: Data source rejected establishment of connection,  message from server: \"Too many connections\""))
         {
             JOptionPane.showMessageDialog(this, "Oop! Connection Lost");
             wWon();
         }
         errhandler++;
             System.out.println(ex+"update");
     }
    }
    @Override
    public void run() {
       for(;true;)
       {
           try {
               Thread.sleep(1200);
           } catch (InterruptedException ex) {
               Logger.getLogger(ZeroCross.class.getName()).log(Level.SEVERE, null, ex);
           }
           updateState();
       }
    }
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
            java.util.logging.Logger.getLogger(ZeroCross.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZeroCross.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZeroCross.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZeroCross.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZeroCross("ppnk","cu","op","O",2).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cc;
    private javax.swing.JLabel cplayer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JLabel ol;
    private javax.swing.JLabel oo;
    private javax.swing.JLabel oplayer;
    public static javax.swing.JProgressBar oprog;
    private javax.swing.JLabel rname;
    private javax.swing.JLabel symbl;
    private javax.swing.JLabel symbl1;
    private javax.swing.JLabel tc;
    private javax.swing.JLabel trn;
    private javax.swing.JLabel ul;
    public static javax.swing.JProgressBar uprog;
    // End of variables declaration//GEN-END:variables
   }
