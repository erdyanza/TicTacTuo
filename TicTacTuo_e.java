/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacTes;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author erdyanza
 */
public class TicTacTuo_e extends javax.swing.JFrame {

  private String startGame ="X";  
  private int xCount = 0;
  private int oCount = 0;
    
    /**
     * Creates new form TicTacTuo_e
     */
    public TicTacTuo_e() {
        initComponents();
        setSize (1200,6000);
        setLocationRelativeTo (null);
    }

    private void gameScore()
     {
       jblPlayerX.setText(String.valueOf(xCount)); 
       jblPlayerO.setText(String.valueOf(oCount)); 
     }       
    
    private void choose_a_Player()
     {
         if (startGame.equalsIgnoreCase("X"))
             {
                 startGame ="O";
             }
         else
             {
                  startGame ="X";  
             }
             
     } 
    
    private void winnningGame()
     {
         String b1 = jButton1.getText();
         String b2 = jButton2.getText();
         String b3 = jButton3.getText();
         
         String b4 = jButton4.getText();
         String b5 = jButton5.getText();
         String b6 = jButton6.getText();
         
         String b7 = jButton7.getText();
         String b8 = jButton8.getText();
         String b9 = jButton9.getText();
         
         if(b1 ==("X") && b2 ==("X") && b3 ==("X"))
         {
             JOptionPane.showMessageDialog(this,"player X Wins","Tic Tac Tuo",JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             jButton1.setBackground(Color.YELLOW);
             jButton2.setBackground(Color.YELLOW);
             jButton3.setBackground(Color.YELLOW);
         }
         if(b4 ==("X") && b5 ==("X") && b6 ==("X"))
         {
             JOptionPane.showMessageDialog(this,"player X Wins","Tic Tac Tuo",JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             jButton1.setBackground(Color.YELLOW);
             jButton2.setBackground(Color.YELLOW);
             jButton3.setBackground(Color.YELLOW);
         }
        if(b7 ==("X") && b8 ==("X") && b9 ==("X"))
         {
             JOptionPane.showMessageDialog(this,"player X Wins","Tic Tac Tuo",JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             jButton1.setBackground(Color.YELLOW);
             jButton2.setBackground(Color.YELLOW);
             jButton3.setBackground(Color.YELLOW);
         } 
        if(b1 ==("X") && b4 ==("X") && b7 ==("X"))
         {
             JOptionPane.showMessageDialog(this,"player X Wins","Tic Tac Tuo",JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             jButton1.setBackground(Color.YELLOW);
             jButton4.setBackground(Color.YELLOW);
             jButton7.setBackground(Color.YELLOW);
         }
        if(b2 ==("X") && b5 ==("X") && b8 ==("X"))
         {
             JOptionPane.showMessageDialog(this,"player X Wins","Tic Tac Tuo",JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             jButton2.setBackground(Color.YELLOW);
             jButton5.setBackground(Color.YELLOW);
             jButton8.setBackground(Color.YELLOW);
         }
        if(b3 ==("X") && b6 ==("X") && b9 ==("X"))
         {
             JOptionPane.showMessageDialog(this,"player X Wins","Tic Tac Tuo",JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             jButton3.setBackground(Color.YELLOW);
             jButton6.setBackground(Color.YELLOW);
             jButton9.setBackground(Color.YELLOW);
         }
        if(b1 ==("X") && b5 ==("X") && b9 ==("X"))
         {
             JOptionPane.showMessageDialog(this,"player X Wins","Tic Tac Tuo",JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             jButton1.setBackground(Color.YELLOW);
             jButton5.setBackground(Color.YELLOW);
             jButton9.setBackground(Color.YELLOW);
         }
        if(b2 ==("X") && b5 ==("X") && b9 ==("X"))
         {
             JOptionPane.showMessageDialog(this,"player X Wins","Tic Tac Tuo",JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             jButton2.setBackground(Color.YELLOW);
             jButton5.setBackground(Color.YELLOW);
             jButton9.setBackground(Color.YELLOW);
         }
        if(b3 ==("X") && b5 ==("X") && b7 ==("X"))
         {
             JOptionPane.showMessageDialog(this,"player X Wins","Tic Tac Tuo",JOptionPane.INFORMATION_MESSAGE);
             xCount++;
             gameScore();
             jButton3.setBackground(Color.YELLOW);
             jButton5.setBackground(Color.YELLOW);
             jButton7.setBackground(Color.YELLOW);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jblPlayerX = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jblPlayerO = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Tou");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Tuo");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204)));
        jPanel4.setForeground(new java.awt.Color(102, 102, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 95)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4);
        jPanel4.getAccessibleContext().setAccessibleParent(jPanel2);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204)));
        jPanel5.setForeground(new java.awt.Color(102, 102, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 95)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5);
        jPanel5.getAccessibleContext().setAccessibleParent(jPanel2);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204)));
        jPanel6.setForeground(new java.awt.Color(102, 102, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 95)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6);
        jPanel6.getAccessibleContext().setAccessibleParent(jPanel2);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204)));
        jPanel7.setForeground(new java.awt.Color(102, 102, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Player X :");
        jPanel7.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel7);
        jPanel7.getAccessibleContext().setAccessibleParent(jPanel2);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204)));
        jPanel8.setForeground(new java.awt.Color(102, 102, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jblPlayerX.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerX.setText("jLabel4");
        jPanel8.add(jblPlayerX, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel8);
        jPanel8.getAccessibleContext().setAccessibleParent(jPanel2);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204)));
        jPanel9.setForeground(new java.awt.Color(102, 102, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 95)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel9);
        jPanel9.getAccessibleContext().setAccessibleParent(jPanel2);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204)));
        jPanel10.setForeground(new java.awt.Color(102, 102, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 95)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel10);
        jPanel10.getAccessibleContext().setAccessibleParent(jPanel2);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204)));
        jPanel11.setForeground(new java.awt.Color(102, 102, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 95)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel11);
        jPanel11.getAccessibleContext().setAccessibleParent(jPanel2);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204)));
        jPanel12.setForeground(new java.awt.Color(102, 102, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("Player O :");
        jPanel12.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel12);
        jPanel12.getAccessibleContext().setAccessibleParent(jPanel2);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204)));
        jPanel13.setForeground(new java.awt.Color(102, 102, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jblPlayerO.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPlayerO.setText("jLabel5");
        jPanel13.add(jblPlayerO, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel13);
        jPanel13.getAccessibleContext().setAccessibleParent(jPanel2);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204)));
        jPanel14.setForeground(new java.awt.Color(102, 102, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 95)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel14);
        jPanel14.getAccessibleContext().setAccessibleParent(jPanel2);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204)));
        jPanel15.setForeground(new java.awt.Color(102, 102, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 95)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel15);
        jPanel15.getAccessibleContext().setAccessibleParent(jPanel2);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204)));
        jPanel16.setForeground(new java.awt.Color(102, 102, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 95)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel16.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel16);
        jPanel16.getAccessibleContext().setAccessibleParent(jPanel2);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204)));
        jPanel17.setForeground(new java.awt.Color(102, 102, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jbtnReset.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnReset, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel17);
        jPanel17.getAccessibleContext().setAccessibleParent(jPanel2);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 204)));
        jPanel18.setForeground(new java.awt.Color(102, 102, 255));
        jPanel18.setLayout(new java.awt.BorderLayout());

        jbtnExit.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel18.add(jbtnExit, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel18);
        jPanel18.getAccessibleContext().setAccessibleParent(jPanel2);

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame Frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        Frame = new JFrame ("Exit");
        if(JOptionPane.showConfirmDialog(Frame, "Confirm if you want to exit","Tic Tac Tuo",
              JOptionPane.YES_NO_OPTION  ) != JOptionPane.YES_NO_OPTION ) {
        } else {
            ;
        }
        {    
          System.exit(0);
        }      
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
         jButton1.setText(startGame);
     
         if (startGame.equalsIgnoreCase("X"))
             {
                 jButton1.setForeground(Color.RED);
             }
         else
             {
                  jButton1.setForeground(Color.BLUE);  
             } 
              choose_a_Player();
              winnningGame();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(startGame);
     
         if (startGame.equalsIgnoreCase("X"))
             {
                 jButton2.setForeground(Color.RED);
             }
         else
             {
                  jButton2.setForeground(Color.BLUE);  
             } 
              choose_a_Player();
              winnningGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(startGame);
     
         if (startGame.equalsIgnoreCase("X"))
             {
                 jButton3.setForeground(Color.RED);
             }
         else
             {
                  jButton3.setForeground(Color.BLUE);  
             } 
              choose_a_Player();
              winnningGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(startGame);
     
         if (startGame.equalsIgnoreCase("X"))
             {
                 jButton4.setForeground(Color.RED);
             }
         else
             {
                  jButton4.setForeground(Color.BLUE);  
             } 
              choose_a_Player();
              winnningGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(startGame);
     
         if (startGame.equalsIgnoreCase("X"))
             {
                 jButton5.setForeground(Color.RED);
             }
         else
             {
                  jButton5.setForeground(Color.BLUE);  
             } 
              choose_a_Player();
              winnningGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(startGame);
     
         if (startGame.equalsIgnoreCase("X"))
             {
                 jButton6.setForeground(Color.RED);
             }
         else
             {
                  jButton6.setForeground(Color.BLUE);  
             } 
              choose_a_Player();
              winnningGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(startGame);
     
         if (startGame.equalsIgnoreCase("X"))
             {
                 jButton7.setForeground(Color.RED);
             }
         else
             {
                  jButton7.setForeground(Color.BLUE);  
             } 
              choose_a_Player();
              winnningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(startGame);
     
         if (startGame.equalsIgnoreCase("X"))
             {
                 jButton8.setForeground(Color.RED);
             }
         else
             {
                  jButton8.setForeground(Color.BLUE);  
             } 
              choose_a_Player();
              winnningGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(startGame);
     
         if (startGame.equalsIgnoreCase("X"))
             {
                 jButton9.setForeground(Color.RED);
             }
         else
             {
                  jButton9.setForeground(Color.BLUE);  
             } 
              choose_a_Player();
              winnningGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
       jButton1.setText(null);
       jButton2.setText(null);
       jButton3.setText(null);
       
       jButton4.setText(null);
       jButton5.setText(null);
       jButton6.setText(null);
       
       jButton7.setText(null);
       jButton8.setText(null);
       jButton9.setText(null);
       
       jButton1.setBackground(Color.LIGHT_GRAY);
       jButton2.setBackground(Color.LIGHT_GRAY);
       jButton3.setBackground(Color.LIGHT_GRAY);
       
       jButton4.setBackground(Color.LIGHT_GRAY);
       jButton5.setBackground(Color.LIGHT_GRAY);
       jButton6.setBackground(Color.LIGHT_GRAY);
       
       jButton7.setBackground(Color.LIGHT_GRAY);
       jButton8.setBackground(Color.LIGHT_GRAY);
       jButton9.setBackground(Color.LIGHT_GRAY);
       
    }//GEN-LAST:event_jbtnResetActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacTuo_e.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacTuo_e.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacTuo_e.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacTuo_e.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacTuo_e().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jblPlayerO;
    private javax.swing.JLabel jblPlayerX;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    // End of variables declaration//GEN-END:variables
}
