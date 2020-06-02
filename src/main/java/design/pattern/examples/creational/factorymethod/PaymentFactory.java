package design.pattern.examples.creational.factorymethod;

public class PaymentFactory {
	
	public static Payment buildPayment(PaymentType paymentType){
        
		switch (paymentType){
            case MERCADO_PAGO:
                return new MercadoPago();
            case CARD:
                return new CardPayment();
            default:
                return new CardPayment();
        }
		
    }
	
}
