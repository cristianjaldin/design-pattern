package design.pattern.examples.behavioral.observer;

public class TrafficLight {
	
	public String status;

	public TrafficLight(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}
