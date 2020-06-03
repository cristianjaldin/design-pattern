package design.pattern.examples.creational.abstractfactory;

public interface AbstractFactory<T> {
	
	T create(String type);
	
}
