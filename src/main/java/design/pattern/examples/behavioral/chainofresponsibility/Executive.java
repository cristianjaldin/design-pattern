package design.pattern.examples.behavioral.chainofresponsibility;

public class Executive implements CreditApprover {
	
	private CreditApprover next;

	public void setNext(CreditApprover aprobador) {
		next = aprobador;
	}

	public CreditApprover getNext() {
		return next;
	}

	public void applyForLoan(int amount) {
		if(amount <= 10000) {
			System.out.println("The executive processes the loan application ...");
		}else {
			next.applyForLoan(amount);
		}
		
	}

}
