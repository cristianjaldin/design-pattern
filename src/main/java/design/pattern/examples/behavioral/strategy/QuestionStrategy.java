package design.pattern.examples.behavioral.strategy;

import java.util.List;

public interface QuestionStrategy {
	
	Question getQuestion(List<Question> questions);
	
}
