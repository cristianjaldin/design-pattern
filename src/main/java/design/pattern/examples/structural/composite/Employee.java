package design.pattern.examples.structural.composite;

public class Employee implements IEmployee {

	private String name;
	private String type;

	public void doWork() {
		System.out.println(type + " trabajando");
	}

	public Employee(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
