package design.pattern.examples.behavioral.strategy;

public class Question {
	
	private int id;
	private String text;

	public Question(int id, String text) {
		this.id = id;
		this.text = text;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", text=" + text + "]";
	}
}
