package design.pattern.examples.behavioral.strategy;

import java.util.ArrayList;
import java.util.List;

public class Questionnaire {

	private String name;
	private List<Question> questions;
	private QuestionStrategy questionStrategy;
	
	public Questionnaire(String name) {
		this.name = name;
		//default questions
		this.questions = new ArrayList<Question>();
		Question q1 = new Question(1,"What is your name?");
		Question q2 = new Question(2,"How old are you?");
		Question q3 = new Question(3,"Where are you from?");
		this.questions.add(q1);
		this.questions.add(q2);
		this.questions.add(q3);
		//default strategy
		this.questionStrategy = new FirstQuestionStrategy();
	}

	public void setQuestionStrategy(QuestionStrategy questionStrategy) {
		this.questionStrategy = questionStrategy;
	}

	public void getQuestion(){
		System.out.println(questionStrategy.getQuestion(questions));
    }	
}
