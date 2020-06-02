package design.pattern.examples;

import design.pattern.examples.creational.factorymethod.Payment;
import design.pattern.examples.creational.factorymethod.PaymentFactory;
import design.pattern.examples.creational.factorymethod.PaymentType;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		
		probarFactoryMethod();
	
	}
	
	
    private static void probarFactoryMethod(){
        Payment payment = PaymentFactory.buildPayment(PaymentType.CARD);
        payment.doPayment();
    }
}
