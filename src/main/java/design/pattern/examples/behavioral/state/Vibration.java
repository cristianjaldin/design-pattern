package design.pattern.examples.behavioral.state;

public class Vibration implements MobileAlarmState {

	public void alert(Mobile mobile) {
		System.out.println("Vibration!!!");		
	}

}
