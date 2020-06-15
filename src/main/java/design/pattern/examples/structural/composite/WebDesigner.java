package design.pattern.examples.structural.composite;

public class WebDesigner implements IEmployee {
	
	private String name;

	public void doWork() {
		System.out.println("----------------------------------------Diseñador trabajando");
	}
	
	public WebDesigner(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
