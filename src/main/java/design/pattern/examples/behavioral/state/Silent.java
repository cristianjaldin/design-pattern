package design.pattern.examples.behavioral.state;

public class Silent implements MobileAlarmState {

	public void alert(Mobile mobile) {
		System.out.println("Turn on screen light!!!");		
	}

}
