package design.pattern.examples.creational.abstractfactory;

public class WarriorFactory implements AbstractFactory<Warrior> {

	public Warrior create(String type) {

		if ("SAMURAI".equals(type)) {
			return new Samurai();
		} else if ("NINJA".equals(type)) {
			return new Ninja();
		} else if ("VIKING".equals(type)) {
			return new Viking();
		}
		
		return null;
	}

}
