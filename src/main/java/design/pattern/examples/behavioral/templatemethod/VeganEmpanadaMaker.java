package design.pattern.examples.behavioral.templatemethod;

public class VeganEmpanadaMaker extends EmpanadaMaker {
	
	@Override
	void prepareEmpanadaDough() {
		System.out.println("Mezclar la harina con la sal, 100 gramos de margarina a temperatura ambiente y el agua natural...");
	}

	@Override
	void prepareEmpanadaFilling() {
		System.out.println("Preparar relleno de lentejas, aceitunas, morron, cebollas y pure de tomates.");
	}

	@Override
	void cookEmpanada() {
		System.out.println("Hornear la empanada.");
	}
}
