package design.pattern.examples.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class EmployeeComposite implements IEmployee {

	private String name;
	private String type;
	
	private List<IEmployee> employees = new ArrayList<IEmployee>();
	
	public void doWork() {
		System.out.println(type+" trabajando");
		for (IEmployee employee : employees) {
			employee.doWork();
		}
	}

	public EmployeeComposite(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public void addEmployee(IEmployee employee) {
		employees.add(employee);
	}
	
	public void removeEmployee(IEmployee employee) {
		employees.remove(employee);
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
