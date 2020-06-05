package design.pattern.examples.creational.prototype;

public interface ElectronicProductPrototype extends Cloneable {
	
	void getElectronicProduct();
	
	ElectronicProductPrototype clone() throws CloneNotSupportedException;
	
}
