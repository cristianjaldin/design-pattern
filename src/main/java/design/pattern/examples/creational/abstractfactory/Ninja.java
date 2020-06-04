package design.pattern.examples.creational.abstractfactory;

public class Ninja implements Warrior {
	
	public void doAttack(Weapon weapon) {
		System.out.println("Ninja attack ...");
		weapon.doDamage();	
		
	}
	
}