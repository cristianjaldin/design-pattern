package design.pattern.examples.creational.singleton;

public class Shenlong {

	private static Shenlong INSTANCE;

	public void fulfillWish(String wish) {
		System.out.println("Your wish has been fulfilled...");
	}

	// Using private constructor we can ensure that no more than one object can be created at a time.
	private Shenlong() {

	}

	public synchronized static Shenlong getINSTANCE() {
		if (INSTANCE == null) {
			INSTANCE = new Shenlong();
		}
		return INSTANCE;
	}

}
