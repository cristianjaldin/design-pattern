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
import design.pattern.examples.creational.prototype.ElectronicProductPrototype;
import design.pattern.examples.creational.prototype.PrototypeFactory;
import design.pattern.examples.creational.singleton.Shenlong;
import design.pattern.examples.structural.adapter.IPerson;
import design.pattern.examples.structural.adapter.Person;
import design.pattern.examples.structural.adapter.Pessoa;
import design.pattern.examples.structural.adapter.PessoaToPersonAdapter;
import design.pattern.examples.structural.facade.PrinterFacade;

import static design.pattern.examples.creational.prototype.PrototypeFactory.ElectronicProductType.PLAY;
import static design.pattern.examples.creational.prototype.PrototypeFactory.ElectronicProductType.TV;

import java.util.ArrayList;
import java.util.List;

import design.pattern.examples.behavioral.chainofresponsibility.Bank;
import design.pattern.examples.behavioral.observer.Car;
import design.pattern.examples.behavioral.observer.MessagePublisher;
import design.pattern.examples.behavioral.observer.Pedestrian;
import design.pattern.examples.behavioral.observer.TrafficLight;
import design.pattern.examples.behavioral.state.Mobile;
import design.pattern.examples.behavioral.state.Silent;
import design.pattern.examples.behavioral.state.Vibration;
import design.pattern.examples.behavioral.strategy.LastQuestionStrategy;
import design.pattern.examples.behavioral.strategy.Question;
import design.pattern.examples.behavioral.strategy.Questionnaire;
import design.pattern.examples.behavioral.strategy.RandomQuestionStrategy;
import design.pattern.examples.behavioral.templatemethod.EmpanadaMaker;
import design.pattern.examples.behavioral.templatemethod.MeatEmpanadaMaker;
import design.pattern.examples.behavioral.templatemethod.VeganEmpanadaMaker;
import design.pattern.examples.behavioral.templatemethod.VenezuelanEmpanadaMaker;

import static design.pattern.examples.creational.prototype.PrototypeFactory.ElectronicProductType.LAPTOP;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) throws Exception {
		
		// factoryMethodExample();
		// abstractFactoryExample();
		// builderExample();
		// prototypeExample();
		// singlentonExample();

		// comportamiento
		// chainofresponsibilityExample();
	    // observerExample();
		// stateExample();

		// strategyExample();
	    // templateMethodExample();
	       
	    // structural
		// adapterExample();
		   facadeExample();
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

		BankAccount bankAccount2 = new BankAccountBuilder(1114467234l, "Juan Perez").withType("CUENTA_CORRIENTE")
				.withBalance(324234.121).build();
		System.out.println(bankAccount2);
	}

	private static void prototypeExample() {

		PrototypeFactory.loadElectronicProduct();

		try {

			ElectronicProductPrototype play = PrototypeFactory.getInstance(PLAY);
			play.getElectronicProduct();

			ElectronicProductPrototype tv = PrototypeFactory.getInstance(TV);
			tv.getElectronicProduct();

			ElectronicProductPrototype laptop = PrototypeFactory.getInstance(LAPTOP);
			laptop.getElectronicProduct();

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	private static void singlentonExample() {
		Shenlong shenlong = Shenlong.getINSTANCE();
		shenlong.fulfillWish("I just want to travel as much as I can, explore the world, meet people and learn from my experiences.");
	}

	private static void chainofresponsibilityExample() {
		Bank bank = new Bank();
		bank.applyForLoan(100000000);
	}

	private static void observerExample() throws InterruptedException {
		
		Car car = new Car();
		Pedestrian walker = new Pedestrian();
		
		MessagePublisher messagePublisher = new MessagePublisher();

		messagePublisher.attach(car);
		messagePublisher.attach(walker);
		
		messagePublisher.notifyUpdate(new TrafficLight("ROJO"));
		
		Thread.sleep(5000);
		
		messagePublisher.notifyUpdate(new TrafficLight("VERDE"));
	}

	private static void stateExample() {
		Mobile mobile = new Mobile();
		mobile.alert();

		mobile.setAlarmState(new Vibration());
		mobile.alert();

		mobile.setAlarmState(new Silent());
		mobile.alert();
	}

	private static void strategyExample() {
		Questionnaire oneQuestionnaire = new Questionnaire("Quiz");
		// default strategy - get first question
		oneQuestionnaire.getQuestion();
		// change strategy - get last question
		oneQuestionnaire.setQuestionStrategy(new LastQuestionStrategy());
		oneQuestionnaire.getQuestion();
		// change strategy - get random question
		oneQuestionnaire.setQuestionStrategy(new RandomQuestionStrategy());
		oneQuestionnaire.getQuestion();
	}
	
	private static void templateMethodExample() {	
        System.out.println("-----Making Meat Empanada-----");
        EmpanadaMaker meatEmpanadaMaker = new MeatEmpanadaMaker();
        meatEmpanadaMaker.makeEmpanada();
        
        System.out.println("-----Making Vegan Empanada-----");
        EmpanadaMaker veganEmpanadaMaker = new VeganEmpanadaMaker();
        veganEmpanadaMaker.makeEmpanada();
        
        System.out.println("-----Making Venezuelan Empanada-----");
        EmpanadaMaker venezuelanEmpanadaMaker = new VenezuelanEmpanadaMaker();
        venezuelanEmpanadaMaker.makeEmpanada();
	}
	
	private static void adapterExample() {	
		
		List<IPerson> people = new ArrayList<IPerson>();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("João");
		pessoa.setSobrenome("Da silva");
		PessoaToPersonAdapter adapter = new PessoaToPersonAdapter(pessoa);
	
		IPerson person = new Person();
		person.setName("Frank");
		person.setSurname("Williams");
		
		people.add(person);
		people.add(adapter);
		
		for (IPerson p : people) {
			System.out.println(p.getName());
			System.out.println(p.getSurname());	
		}
		
	}
	
	private static void facadeExample(){
		PrinterFacade printerFacade = new PrinterFacade("...Testing printer...");
		printerFacade.print();
	}
}