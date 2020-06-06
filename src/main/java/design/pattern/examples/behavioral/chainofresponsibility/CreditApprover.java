package design.pattern.examples.behavioral.chainofresponsibility;

public interface CreditApprover {
	
	void setNext(CreditApprover aprobador);
	CreditApprover getNext();
	void applyForLoan(int amount);

}
