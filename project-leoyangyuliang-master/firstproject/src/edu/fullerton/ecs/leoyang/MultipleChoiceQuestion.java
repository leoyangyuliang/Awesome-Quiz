package edu.fullerton.ecs.leoyang;

public class MultipleChoiceQuestion extends Question{
  private String[] possibleAnswers;
  private String question;
  public MultipleChoiceQuestion(String question, String answer, double points, String questionType, String[] possibleAnswers){
    super(question, answer,points, questionType);
    this.question = question;
    this.possibleAnswers = possibleAnswers;
  }


   @Override
  public void setPossibleAnswers(String[] possibleAnswers){
    this.possibleAnswers = possibleAnswers;
  }
   @Override
  public String[] getPossibleAnswers(){
    return possibleAnswers;
  }
     @Override
  public void setQuestion(String question){
		super.setQuestion(question);
  }
  @Override
    public void setAnswer(String answer){
		super.setAnswer(answer);
	}
  @Override
  public String askQuestion(){
    String result = super.askQuestion()+"\r\n";
    for(int i=0; i<possibleAnswers.length; i++){
      result +=  (possibleAnswers[i] + "\r\n");
    }
    return result;
  }
  @Override
  public MultipleChoiceQuestion clone(){
    MultipleChoiceQuestion temp = new MultipleChoiceQuestion(super.askQuestion(), getAnswer(), getPoints(),getQuestionType(), possibleAnswers.clone());
   return temp;
  }
  @Override
  public String toString(){
    return askQuestion();
  }
  
}
