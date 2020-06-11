package design.pattern.examples.behavioral.templatemethod;

public class VenezuelanEmpanadaMaker extends EmpanadaMaker {

	@Override
	void prepareEmpanadaDough() {
		System.out.println("Preparar la masa con harina de maíz y agua fria...");
	}

	@Override
	void prepareEmpanadaFilling() {
		System.out.println("Preparar relleno de pabellón que consiste en carne mechada, caraotas, queso blanco y tajadas (plátano macho maduro frito en lajas)");
	}

	@Override
	void cookEmpanada() {
		System.out.println("Freir la empanada con aceite");
	}

}
