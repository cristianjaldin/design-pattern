package design.pattern.examples.behavioral.templatemethod;

public abstract class EmpanadaMaker {

    //Steps requiring peculiar implementations are "placeholders" in the base class
	abstract void prepareEmpanadaDough();
	abstract void prepareEmpanadaFilling();
	abstract void cookEmpanada();
	
	//Standardize the skeleton of an algorithm in a "template" method
	public void makeEmpanada() {
		prepareEmpanadaDough();
		prepareEmpanadaFilling();
		cookEmpanada();
	}
	
}
