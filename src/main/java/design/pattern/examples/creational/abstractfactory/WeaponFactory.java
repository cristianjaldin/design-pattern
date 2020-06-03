package design.pattern.examples.creational.abstractfactory;

public class WeaponFactory implements AbstractFactory<Weapon>{

	public Weapon create(String type) {
		
		if ("AXE".equals(type)) {
			return new Axe();
		} else if ("SWORD".equals(type)) {
			return new Sword();
		}
		
		return null;
	}

}
