package design.pattern.examples.creational.prototype;

public class Tv implements ElectronicProductPrototype {

	private String brand;
	private String type;
	private String resolution;
	private float size;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public void getElectronicProduct() {
		System.out.println("Esto es una tv");
	}

	public ElectronicProductPrototype clone() throws CloneNotSupportedException {
		System.out.println("Clonando tv...");
		return (Tv) super.clone();
	}
}
