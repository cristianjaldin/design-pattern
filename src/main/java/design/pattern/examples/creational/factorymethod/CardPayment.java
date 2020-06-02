package design.pattern.examples.creational.factorymethod;

public class CardPayment implements Payment {

    public void doPayment() {
        System.out.println("Pagando con Tarjeta de Credito");
    }
   
}