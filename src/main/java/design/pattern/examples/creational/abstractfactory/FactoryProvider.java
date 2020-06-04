package design.pattern.examples.creational.abstractfactory;

public class FactoryProvider {

	public static AbstractFactory<?> getFactory(String chooseFactory) {

		if ("WARRIOR".equals(chooseFactory)) {
			return new WarriorFactory();
		} else if ("WEAPON".equals(chooseFactory)) {
			return new WeaponFactory();
		}

		return null;
	}
}
