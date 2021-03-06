package edu.fullerton.ecs.leoyang.StartQuiz;

import edu.fullerton.ecs.leoyang.ModifyQuestions.*;
import edu.fullerton.ecs.leoyang.DeleteQuiz.PickQuizForDeleteQuiz;
import edu.fullerton.ecs.leoyang.MultipleChoiceQuestion;
import edu.fullerton.ecs.leoyang.Question;
import edu.fullerton.ecs.leoyang.Quiz;
import edu.fullerton.ecs.leoyang.WriteObjectToBinary;
import java.awt.Color;
import java.util.ArrayList;
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
public class MultiplyQuestion extends AnswerQuestion {

    private JDesktopPane mainpane;
    private Quiz quiz;
    private int index;
    private String[] posssibleAnswers;
    /**
     * Creates new form AnswerQuestionTabbedPane
     */
    public MultiplyQuestion() {
        initComponents();

    }

    public MultiplyQuestion(Quiz quiz, int index, JDesktopPane mainpane) {
        initComponents();
        //a[i] = new MultiplyQuestion(quiz.clone(),i,mainpane);
        this.quiz = quiz;
        this.index = index;
        this.mainpane = mainpane;
        question.setText(quiz.getQuestion(index));
        question.setEditable(false);
        this.posssibleAnswers = this.quiz.getPossibleAnswers(index);
        choiceA.setText(posssibleAnswers[0]);
        choiceA.setEditable(false);
        choiceB.setText(posssibleAnswers[1]);
        choiceB.setEditable(false);
        choiceC.setText(posssibleAnswers[2]);
        choiceC.setEditable(false);
        choiceD.setText(posssibleAnswers[3]);
        choiceD.setEditable(false);
        questiontype.setText(quiz.getType(index) + " ( " + quiz.getPoint(index) + " points )");
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        questiontype = new javax.swing.JLabel();
        showAnswer = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        answer = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        showMultipleAnswer = new javax.swing.JLabel();
        question = new javax.swing.JTextField();
        choiceA = new javax.swing.JTextField();
        choiceB = new javax.swing.JTextField();
        choiceC = new javax.swing.JTextField();
        questiontype1 = new javax.swing.JLabel();
        questiontype2 = new javax.swing.JLabel();
        questiontype3 = new javax.swing.JLabel();
        questiontype4 = new javax.swing.JLabel();
        choiceD = new javax.swing.JTextField();
        questiontype5 = new javax.swing.JLabel();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                formInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                formVetoableChange(evt);
            }
        });

        questiontype.setText("jLabel2");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, java.awt.Color.black));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 50));

        answer.setText(null);
        answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerActionPerformed(evt);
            }
        });

        jLabel1.setText("Answer:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(showMultipleAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(showMultipleAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answer, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        question.setText("jTextField1");
        question.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                questionInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        question.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questionActionPerformed(evt);
            }
        });
        question.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                questionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                questionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                questionKeyTyped(evt);
            }
        });

        choiceA.setText("jTextField2");
        choiceA.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                choiceAInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        choiceA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceAActionPerformed(evt);
            }
        });

        choiceB.setText("jTextField3");

        choiceC.setText("jTextField4");

        questiontype1.setText("B:");

        questiontype2.setText("A:");

        questiontype3.setText("Question");

        questiontype4.setText("C:");

        choiceD.setText("jTextField1");
        choiceD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceDActionPerformed(evt);
            }
        });

        questiontype5.setText("D:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(questiontype4)
                            .addComponent(questiontype1)
                            .addComponent(questiontype3)
                            .addComponent(questiontype2)
                            .addComponent(questiontype5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(question)
                            .addComponent(choiceA)
                            .addComponent(choiceB)
                            .addComponent(choiceC)
                            .addComponent(choiceD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)))
                    .addComponent(questiontype)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questiontype, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(question, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(questiontype3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(choiceA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(choiceB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(choiceC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(choiceD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(questiontype2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(questiontype1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(questiontype4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(questiontype5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        questiontype.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void answerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerActionPerformed

    private void choiceAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choiceAActionPerformed

    private void questionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questionActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_questionActionPerformed

    private void choiceDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_choiceDActionPerformed

    private void formInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_formInputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_formInputMethodTextChanged

    private void choiceAInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_choiceAInputMethodTextChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_choiceAInputMethodTextChanged

    private void questionInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_questionInputMethodTextChanged


    }//GEN-LAST:event_questionInputMethodTextChanged

    private void questionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_questionKeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_questionKeyPressed

    private void questionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_questionKeyReleased
        // TODO add your handling code here:
        if (!quiz.getQuestion(index).equals(question.getText())) {
            question.setBackground(Color.GREEN);
        } else if (quiz.getQuestion(index).equals(question.getText())) {
            question.setBackground(Color.white);
        }
    }//GEN-LAST:event_questionKeyReleased

    private void questionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_questionKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_questionKeyTyped

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_formPropertyChange

    private void formVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_formVetoableChange
        // TODO add your handling code here:

    }//GEN-LAST:event_formVetoableChange
    @Override
    public String getAnswer(){
        return answer.getText();
    }
    
    @Override
     public void showAnswer(String answer){
        showMultipleAnswer.setText(answer);
        this.answer.setEditable(false);
    }
    /*
    @Override
    public void updateQuestion(){
        String[] possibleAnswers = {choiceA.getText(),choiceB.getText(),choiceC.getText(),choiceD.getText()};
        Question q = new MultipleChoiceQuestion(question.getText(),  answer.getText(),  Double.parseDouble(points.getText()),  quiz.getType(index), possibleAnswers);
        quiz.updateQuestion(index, q);
    }
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField answer;
    private javax.swing.JTextField choiceA;
    private javax.swing.JTextField choiceB;
    private javax.swing.JTextField choiceC;
    private javax.swing.JTextField choiceD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField question;
    public javax.swing.JLabel questiontype;
    public javax.swing.JLabel questiontype1;
    public javax.swing.JLabel questiontype2;
    public javax.swing.JLabel questiontype3;
    public javax.swing.JLabel questiontype4;
    public javax.swing.JLabel questiontype5;
    public javax.swing.JLabel showAnswer;
    private javax.swing.JLabel showMultipleAnswer;
    // End of variables declaration//GEN-END:variables
}
