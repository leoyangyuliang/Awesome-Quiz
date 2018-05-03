package edu.fullerton.ecs.leoyang.CreatQuiz;

import edu.fullerton.ecs.leoyang.StartQuiz.*;
import edu.fullerton.ecs.leoyang.Quiz;
import edu.fullerton.ecs.leoyang.WriteObjectToBinary;
import edu.fullerton.ecs.leoyang.main;
import java.beans.PropertyVetoException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.swing.JDesktopPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 49876
 */
public class ShowBackupQuestions extends javax.swing.JPanel {
       private JDesktopPane mainpane;
       private Quiz backupQuiz,quiz;
       private int index;
       private BackupQuestionMainWindow parentWindow;
    /**
     * Creates new form AnswerQuestionTabbedPane
     */
    public ShowBackupQuestions() {
        initComponents();
        jTextArea1.setEditable(false);
        
    }
       public ShowBackupQuestions(Quiz temp,int index,  JDesktopPane mainpane, Quiz quiz, BackupQuestionMainWindow a) {
        initComponents();
        this.backupQuiz = temp;
        this.index = index;
        this.quiz = quiz;
        this.mainpane = mainpane;
        parentWindow =a;
        jTextArea1.setEditable(false);
        jTextArea1.setText(backupQuiz.renderQuestion(index));
        questiontype.setText(backupQuiz.getType(index)+" ( "  + backupQuiz.getPoint(index)+" points )");
        answer.setText(backupQuiz.getAnswer(index));
        answer.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        answer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        questiontype = new javax.swing.JLabel();
        showAnswer = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        answer.setText(null);
        answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerActionPerformed(evt);
            }
        });

        jLabel1.setText("Answer:");

        questiontype.setText("jLabel2");

        jButton1.setText("Add this Question to Quiz");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(questiontype)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(75, 75, 75))
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questiontype, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(showAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        questiontype.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents
    
    private void answerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        quiz.addQuestion(backupQuiz.getQuestionObject(index));
        this.index++;
         if (this.index < quiz.getMaxQuestion()) {
           
            TypeOfQuestion b = new TypeOfQuestion(mainpane, quiz, index,backupQuiz);
            mainpane.add(b);
            b.show();
            try {
                b.setMaximum(true);
            } catch (PropertyVetoException ex) {
            }
            parentWindow.dispose();
        } else if (this.index == quiz.getMaxQuestion()) {
            //questionIndex.setText("not working");
            /* writer = new WriteObjectToBinary();
            writer.writeToBinary(quiz, quiz.getName());
            writer.writeToBinary(backupQuiz, backupQuiz.getName());
            */
             ExecutorService exec = Executors.newCachedThreadPool();
             exec.execute(new WriteObjectToBinary(quiz, quiz.getName()));
            
            quiz.saveQuizName();
            parentWindow.dispose();

            main.a.enableMenuBar();
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed
    public void setanswer(){
        answer.setText("Correct");
    }
    public String getAnswer(){
        return answer.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField answer;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    public javax.swing.JLabel questiontype;
    public javax.swing.JLabel showAnswer;
    // End of variables declaration//GEN-END:variables
}
