package design.pattern.examples.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager implements IEmployee {
	
	private String name;
	private List<IEmployee> employees = new ArrayList<IEmployee>();
	
	public void doWork() {
		System.out.println("Gerente trabajando");
		for (IEmployee employee : employees) {
			employee.doWork();
		}
	}
	
	public Manager(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addEmployee(IEmployee employee) {
		employees.add(employee);
	}

}