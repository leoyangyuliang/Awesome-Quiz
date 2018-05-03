package edu.fullerton.ecs.leoyang;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Quiz implements Serializable {

    private ArrayList<Question> questions;
    private int qCount;
    private int maxQuestion;
    private String filename;

    public Quiz(int maxQuestions, String filename) {
        questions = new ArrayList<>();
        qCount = 0;
        this.maxQuestion = maxQuestions;
        this.filename = filename;
    }

    public boolean checkAnswers(int index, String userAnswer) {
        return questions.get(index).check(userAnswer);
    }

    public String getAnswer(int index) {
        return questions.get(index).getAnswer();
    }
    
    public void addQuestion(Question q) {
       questions.add(q);
       qCount++;
    }
    public void deleteQuestion(int index){
        questions.remove(index);
        qCount--;
        maxQuestion--;
    }
    public int getQCount(){
        return qCount;
    }
    public void setQuestion(int index,String question){
        questions.get(index).setQuestion(question);
    }
    public void getPossibleAnswers(int index, String[] possibleAnaswers)
    {
        questions.get(index).setPossibleAnswers(possibleAnaswers);
    }
    
    public String[] getPossibleAnswers(int index){
       return questions.get(index).getPossibleAnswers();
    }
    public String getQuestion(int index){
        return questions.get(index).getQuestion();
    }
    public Question getQuestionObject(int index){
        return questions.get(index);
    }
    public void updateQuestion(int index,Question q){
        questions.set(index, q);
    }
    public double getTotalPoints() {
        double total = 0;
        for (int i = 0; i < qCount; i++) {
            total += questions.get(i).getPoints();
        }
        return total;
    }

    public String getName() {
        return filename;
    }

    public int getMaxQuestion() {
        return maxQuestion;
    }

    public double getPoint(int index) {
        return questions.get(index).getPoints();
    }

    public String getType(int index) {
        return questions.get(index).getQuestionType();
    }

    public String renderQuestion(int index) {
        return questions.get(index).toString();
    }
    
    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < qCount; i++) {
            result += (questions.get(i));
        }
        return result;
    }

    public void save() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int i = 0; i < qCount; i++) {
                writer.write((i + 1) + ") ");
                writer.write(questions.get(i).toString());
                writer.write(questions.get(i).getAnswer());
                writer.write("\r\n");
                writer.write(Double.toString(questions.get(i).getPoints()));
                writer.write("\r\n");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void saveQuizName() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(".\\quizName.bin", true))) {
            writer.write(filename);
            writer.write("\r\n");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public Quiz clone() {
        Quiz temp = new Quiz(this.maxQuestion, this.filename);
        for (int i = 0; i < qCount; i++) {
            temp.addQuestion(questions.get(i).clone());
        }
        return temp;

    }

}
