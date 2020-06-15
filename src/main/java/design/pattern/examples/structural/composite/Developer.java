package design.pattern.examples.structural.composite;

public class Developer implements IEmployee {
	
	private String name;

	public void doWork() {
		System.out.println("----------------------------------------Developer trabajando");
	}
	
	public Developer(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
