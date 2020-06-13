package design.pattern.examples.structural.facade;

public class PrinterFacade {

	private Printer printer;

	public PrinterFacade(String text) {
		printer = new Printer();
		printer.setColour(true);
		printer.setPaperSize("A4");
		printer.setDocumentType("PDF");
		printer.setText(text);
	}

	public void print() {
		printer.printDocument();
	}

}
