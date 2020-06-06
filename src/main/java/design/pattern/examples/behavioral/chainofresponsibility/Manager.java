package design.pattern.examples.behavioral.chainofresponsibility;

public class Manager implements CreditApprover {
	
	private CreditApprover next;

	public void setNext(CreditApprover aprobador) {
		next = aprobador;
	}

	public CreditApprover getNext() {
		return next;
	}

	public void applyForLoan(int amount) {
		if(amount > 10000 && amount <= 100000) {
			System.out.println("The manager processes the loan application");
		}else {
			next.applyForLoan(amount);
		}
	}

}
