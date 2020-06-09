package design.pattern.examples.behavioral.observer;

public interface Subject {
	
	void attach(Observer o);

	void dettach(Observer o);

	void notifyUpdate(TrafficLight trafficLight);
}
