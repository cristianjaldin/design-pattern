package design.pattern.examples.behavioral.strategy;

import java.util.List;

public class LastQuestionStrategy implements QuestionStrategy {

	public Question getQuestion(List<Question> questions) {
		return questions.get(questions.size()-1);
	}

}
