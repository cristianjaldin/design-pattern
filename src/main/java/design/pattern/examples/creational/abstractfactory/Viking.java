package design.pattern.examples.creational.abstractfactory;

public class Viking implements Warrior {
	
	public void doAttack(Weapon weapon) {
		System.out.println("Viking attack ...");
		weapon.doDamage();	
	}
	
}
