package design.pattern.examples.behavioral.observer;

public class Car implements Observer {

	public void update(TrafficLight trafficLight) {
		if(trafficLight.status.equals("ROJO")){
            System.out.println("Semaforo Rojo: -> Coche NO puede pasar");
        }else if(trafficLight.status.equals("VERDE")){
            System.out.println("Semaforo Verde: -> Coche SI puede pasar");
        }else {
        	System.out.println("Semaforo Amarillo: -> Precaucion");
        }
	}

}
