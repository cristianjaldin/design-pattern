package design.pattern.examples.structural.facade;

public class Printer {
	
	private String documentType;
	private Boolean colour;
	private String paperSize;
	private String text;
	
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public Boolean getColour() {
		return colour;
	}
	public void setColour(Boolean colour) {
		this.colour = colour;
	}
	public String getPaperSize() {
		return paperSize;
	}
	public void setPaperSize(String paperSize) {
		this.paperSize = paperSize;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public void printDocument() {
		System.out.println("Printer printing document: "+text);
	}
}