package design.pattern.examples.creational.abstractfactory;

public class Samurai implements Warrior {

	public void doAttack(Weapon weapon) {
		System.out.println("Samurai attack ...");
		weapon.doDamage();
	}
	
}
