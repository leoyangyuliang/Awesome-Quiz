/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fullerton.ecs.leoyang.CreatQuiz;

import edu.fullerton.ecs.leoyang.Quiz;
import edu.fullerton.ecs.leoyang.ReadObjectToBinary;
import edu.fullerton.ecs.leoyang.main;
import java.awt.Color;
import java.beans.PropertyVetoException;
import java.io.File;
import java.util.IllegalFormatException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;

/**
 *
 * @author 49876
 */
public class SetUpQuiz extends javax.swing.JInternalFrame {
    private JDesktopPane mainpane;
    private int maxQuestion;
    private String quizName;
    private int index;

    
    /**
     * Creates new form NewJInternalFrame
     */
    public SetUpQuiz() {
        initComponents();
    }
      public SetUpQuiz( JDesktopPane mainpane) {
        initComponents();
        this.mainpane = mainpane;
        this.setTitle("Set Up Quiz");
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        maxQ = new javax.swing.JTextField();
        quizname = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setToolTipText("");
        setAutoscrolls(true);
        setMinimumSize(new java.awt.Dimension(400, 400));

        jLabel1.setText("How many Questions? ");

        jButton1.setText("next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Quiz Name: ");

        maxQ.setToolTipText("Enter Integers Only");

        jButton2.setText("Go Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(maxQ, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(quizname))
                        .addContainerGap(206, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(maxQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(quizname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean qualify=true;
        try
            {
                Integer.parseInt(maxQ.getText());
                 maxQ.setBackground(Color.white);
            }catch(IllegalFormatException e)
            {
                 maxQ.setBackground(Color.red);
                qualify = false;
            }catch(NumberFormatException ea)
            {
                 maxQ.setBackground(Color.red);
                 System.out.println("points not pass");
                qualify = false;
            }
         if(quizname.getText().equals(""))
            {
                quizname.setBackground(Color.red);
                qualify = false;
            }
            else if(!quizname.getText().equals(""))
            {
                
                quizname.setBackground(Color.white);
            }
        
        
        if(qualify)
        {
        maxQuestion = Integer.parseInt(maxQ.getText());
        quizName = quizname.getText()+".bin";
        Quiz quiz = new Quiz(maxQuestion, quizName);
        Quiz backupQuiz = new Quiz(100000,"BackUpQuestion.bin");
        index = 0;
          File f = new File("BackUpQuestion.bin");
          if (f.exists()) {
             ReadObjectToBinary reader = new ReadObjectToBinary();
             backupQuiz = reader.readFromBinary("BackUpQuestion.bin");
        }
  
       TypeOfQuestion b = new TypeOfQuestion(mainpane,quiz,index,backupQuiz);
       mainpane.add(b);
       b.show();
        try {
            b.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(SetUpQuiz.class.getName()).log(Level.SEVERE, null, ex);
        }
       this.dispose();
       
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        main.a.setVisible(true);
        this.dispose();
          main.a.enableMenuBar();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField maxQ;
    private javax.swing.JTextField quizname;
    // End of variables declaration//GEN-END:variables
}