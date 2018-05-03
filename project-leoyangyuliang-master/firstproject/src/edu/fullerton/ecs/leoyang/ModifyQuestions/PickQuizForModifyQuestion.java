/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fullerton.ecs.leoyang.ModifyQuestions;

import edu.fullerton.ecs.leoyang.MainWindow;
import edu.fullerton.ecs.leoyang.Quiz;
import edu.fullerton.ecs.leoyang.ReadObjectToBinary;
import edu.fullerton.ecs.leoyang.main;
import static com.sun.media.jfxmediaimpl.MediaUtils.warning;
import java.beans.PropertyVetoException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;

/**
 *
 * @author 49876
 */
public class PickQuizForModifyQuestion extends javax.swing.JInternalFrame {
    private ArrayList<String> q;
    private int[] numberOfQuestion;
    private int index;
    private int numberOfQuiz;
    private JDesktopPane mainpane;
    private Quiz tempQuiz;
    /**
     * Creates new form PickQuiz
     */
    public PickQuizForModifyQuestion() {
        initComponents();
        
    }

    /**
     *
     * @param mainpane
     */
    public PickQuizForModifyQuestion(JDesktopPane mainpane) {
        initComponents();
        this.mainpane = mainpane;
        q = new ArrayList<>();
        this.setTitle("Pick Quiz For Modify Question");
  
    
         try(BufferedReader br = new BufferedReader(new FileReader(".\\quizName.bin")))
        {    
            String line= "";
            do{
            line = br.readLine();
               if(line!=null)
               {
                   numberOfQuiz++;
               }
            }while(line!=null);
        }catch(IOException ioe)
        {
            warning.setText("Fileopen failed");
        
        }
        numberOfQuestion = new int[numberOfQuiz];
        index =0;
        quizChoices.setSelectedItem(null);
        try(BufferedReader br = new BufferedReader(new FileReader(".\\quizName.bin")))
        {    
            String line= "";
            do{
            line = br.readLine();
               if(line!=null)
               {
                   q.add(line);
                   quizChoices.addItem(line);
                   index++;
               }
            }while(line!=null);
            
        }catch(IOException ioe)
        {
            warning.setText("Fileopen failed");
        
        }
        File f = new File("BackUpQuestion.bin");
        if (f.exists()) {
                q.add("BackUpQuestion.bin");
                quizChoices.addItem("BackUpQuestion.bin");
                index++;
        }
        if(quizChoices.getSelectedItem()==null)
        {
            jButton1.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        quizChoices = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        warning = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        quizChoices.setMaximumRowCount(1000);
        quizChoices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizChoicesActionPerformed(evt);
            }
        });

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quizChoices, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(warning, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quizChoices, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jButton2.setText("Back");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quizChoicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizChoicesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quizChoicesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       int x = q.indexOf(String.valueOf(quizChoices.getSelectedItem()));  //get the index of the filename
       ReadObjectToBinary reader = new ReadObjectToBinary();
       Quiz temp = reader.readFromBinary(String.valueOf(quizChoices.getSelectedItem()));
       WindowsForModifyQuestions a = new WindowsForModifyQuestions(mainpane, temp.clone(),x);
       mainpane.add(a);
       a.show();
        try {
            a.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
          main.a.enableMenuBar();
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> quizChoices;
    private javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}