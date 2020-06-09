package design.pattern.examples.behavioral.strategy;

import java.util.List;

public class FirstQuestionStrategy implements QuestionStrategy {

	public Question getQuestion(List<Question> questions) {
		return questions.get(0);
	}

}
