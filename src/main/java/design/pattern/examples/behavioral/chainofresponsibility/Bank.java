package design.pattern.examples.behavioral.chainofresponsibility;

public class Bank implements CreditApprover {
	//The bank organizes the chain.
	private CreditApprover next;

	public void setNext(CreditApprover creditApprover) {
		next = creditApprover;
	}

	public CreditApprover getNext() {
		return next;
	}

	public void applyForLoan(int amount) {
		//Build the chain
		Executive executive = new Executive();
		this.setNext(executive);
		
		Manager manager = new Manager();
		executive.setNext(manager);
		
		Director director = new Director();
		manager.setNext(director);
				
		next.applyForLoan(amount);
	}

}
