package design.pattern.examples;

import design.pattern.examples.creational.abstractfactory.AbstractFactory;
import design.pattern.examples.creational.abstractfactory.FactoryProvider;
import design.pattern.examples.creational.abstractfactory.Warrior;
import design.pattern.examples.creational.abstractfactory.Weapon;
import design.pattern.examples.creational.builder.BankAccount;
import design.pattern.examples.creational.builder.BankAccount.BankAccountBuilder;
import design.pattern.examples.creational.factorymethod.Payment;
import design.pattern.examples.creational.factorymethod.PaymentFactory;
import design.pattern.examples.creational.factorymethod.PaymentType;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		// factoryMethodExample();
		//abstractFactoryExample();
		builderExample();
	}

	private static void factoryMethodExample() {
		Payment payment = PaymentFactory.buildPayment(PaymentType.CARD);
		payment.doPayment();
	}

	private static void abstractFactoryExample() {

		AbstractFactory<?> abstractFactory = FactoryProvider.getFactory("WARRIOR");

		Warrior oneSamurai = (Warrior) abstractFactory.create("SAMURAI");
		Warrior oneViking = (Warrior) abstractFactory.create("VIKING");

		AbstractFactory<?> abstractFactory1 = FactoryProvider.getFactory("WEAPON");
		Weapon oneSword = (Weapon) abstractFactory1.create("SWORD");
		Weapon onAxe = (Weapon) abstractFactory1.create("AXE");

		oneSamurai.doAttack(oneSword);
		oneViking.doAttack(onAxe);

	}

	private static void builderExample() {

		BankAccount bankAccount1 = new BankAccountBuilder(4234234234l, "Cristian Jaldin").build();

		System.out.println(bankAccount1);

		BankAccount bankAccount2 = new BankAccountBuilder(1114467234l, "Juan Perez").withType("CUENTA_CORRIENTE").withBalance(324234.121).build();

		System.out.println(bankAccount2);
	}
}
