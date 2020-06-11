package design.pattern.examples.behavioral.templatemethod;

public class MeatEmpanadaMaker extends EmpanadaMaker {

	@Override
	void prepareEmpanadaDough() {
		System.out.println("Preparar la masa con harina de trigo cuatro ceros...");
	}

	@Override
	void prepareEmpanadaFilling() {
		System.out.println("Preparar relleno de carne picada, cebollas, morron, huevos ...");
	}

	@Override
	void cookEmpanada() {
		System.out.println("Freir la empanada con aceite de girasol.");
	}

}
