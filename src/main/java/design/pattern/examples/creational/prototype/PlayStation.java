package design.pattern.examples.creational.prototype;

public class PlayStation implements ElectronicProductPrototype {

	private String brand;
	private String gpu;
	private String spu;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	public String getSpu() {
		return spu;
	}

	public void setSpu(String spu) {
		this.spu = spu;
	}

	public void getElectronicProduct() {
		System.out.println("Esto es un Play station");
	}

	public ElectronicProductPrototype clone() throws CloneNotSupportedException {
		System.out.println("Clonando Play station...");
		return (PlayStation) super.clone();
	}
}
