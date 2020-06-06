package design.pattern.examples.behavioral.chainofresponsibility;

public class Director implements CreditApprover {
	
	private CreditApprover next;

	public void setNext(CreditApprover aprobador) {
		next = aprobador;
	}

	public CreditApprover getNext() {
		return next;
	}

	public void applyForLoan(int amount) {
		if(amount > 100000) {
			System.out.println("The director processes the loan application");
		}else {
			next.applyForLoan(amount);
		}
	}

}
