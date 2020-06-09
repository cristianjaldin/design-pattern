package design.pattern.examples.behavioral.strategy;

import java.util.List;
import java.util.Random;

public class RandomQuestionStrategy implements QuestionStrategy {

	public Question getQuestion(List<Question> questions) {
		int position = new Random().nextInt(questions.size());
		return questions.get(position);
	}

}
