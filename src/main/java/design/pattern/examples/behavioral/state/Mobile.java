package design.pattern.examples.behavioral.state;

public class Mobile {

	private MobileAlarmState alarmState;

	public Mobile() {
		alarmState = new Sound();
	}

	public void setAlarmState(MobileAlarmState alarmState) {
		this.alarmState = alarmState;
	}
	
	public void alert(){
		alarmState.alert(this);
    }

}