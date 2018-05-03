package edu.fullerton.ecs.leoyang;

import java.io.Serializable;

public class Question implements Serializable{
	private String question, answer, questionType;
        private double points;
	public Question(String question, String answer, double points, String questionType){
                this.question = question;
                this.answer = answer;
                this.points = points;
                this.questionType = questionType;
	}
	public String askQuestion(){
		return (question);
	}
        public String getQuestionType(){
            return questionType;
        }
        
	public boolean check(String userAnswer){
            if(questionType.equals("Short Answer")){
               for(String s: answer.split(" "))
               {
                   for(String t: userAnswer.split(" ")){
                     if(t.toLowerCase().equals(s.toLowerCase()))
                       return true;
                   }
               }
               return false;
            }
            else if(questionType.equals("Multiple Choice")||questionType.equals("Multiple Answers"))
                return answer.toLowerCase().equals(userAnswer.toLowerCase());
            else
                return false;
	}
        protected String getAnswer(){
                return answer;
        }	
	public double getPoints(){
            return points;
        }
        public void setAnswer(String answer){
		this.answer = answer;
	}
	public void setQuestion(String question){
		this.question = question;
	}
        public String getQuestion(){
            return question;
        }
 
        public void setPossibleAnswers(String[] possibleAnswers){
         
        }
    
        public String[] getPossibleAnswers(){
            return null;
        }
        
        @Override
	public Question clone(){
		return new Question(question, answer, points, questionType);
	}
        @Override
        public String toString(){
          return askQuestion();
        }
}