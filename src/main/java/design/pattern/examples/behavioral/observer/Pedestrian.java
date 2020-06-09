package design.pattern.examples.behavioral.observer;
//Peaton
public class Pedestrian implements Observer {
	
	public void update(TrafficLight trafficLight) {
		if(trafficLight.status.equals("ROJO")){
            System.out.println("Semaforo Rojo  -> Peaton SI puede pasar");
        }else if(trafficLight.status.equals("VERDE")){
            System.out.println("Semaforo Verde: -> Peaton NO puede pasar");
        }else {
        	System.out.println("Semaforo Amarillo: -> Precaucion");
        }
	}
	
}
