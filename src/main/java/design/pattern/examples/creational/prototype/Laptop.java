package design.pattern.examples.creational.prototype;

public class Laptop implements ElectronicProductPrototype {
	
	private String brand;
	private String processor;
	private int memory;
	private int hardDisk;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public int getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(int hardDisk) {
		this.hardDisk = hardDisk;
	}
	public void getElectronicProduct() {
		System.out.println("Esto es una laptop");
	}
	public ElectronicProductPrototype clone() throws CloneNotSupportedException {
		System.out.println("Clonando laptop...");
		return (Laptop) super.clone();
	}
}
