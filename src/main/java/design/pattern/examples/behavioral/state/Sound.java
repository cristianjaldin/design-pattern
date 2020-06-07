package design.pattern.examples.behavioral.state;

public class Sound implements MobileAlarmState {

	public void alert(Mobile mobile) {
		System.out.println("Ring Ring!!!");		
	}

}
