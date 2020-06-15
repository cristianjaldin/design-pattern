package design.pattern.examples.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader implements IEmployee {

	private String name;
	private List<IEmployee> employees = new ArrayList<IEmployee>();
	
	public void doWork() {
		System.out.println("------------------Team Leader trabajando");
		for (IEmployee employee : employees) {
			employee.doWork();
		}
	}

	public TeamLeader(String name) {
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
