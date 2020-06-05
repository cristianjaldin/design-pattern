package design.pattern.examples.creational.prototype;

import java.util.HashMap;
import java.util.Map;
import static design.pattern.examples.creational.prototype.PrototypeFactory.ElectronicProductType.PLAY;
import static design.pattern.examples.creational.prototype.PrototypeFactory.ElectronicProductType.TV;
import static design.pattern.examples.creational.prototype.PrototypeFactory.ElectronicProductType.LAPTOP;

public class PrototypeFactory {

	public static class ElectronicProductType {
		public static final String PLAY = "play";
		public static final String TV = "tv";
		public static final String LAPTOP = "laptop";
	}

	private static Map<String, ElectronicProductPrototype> prototypes = new HashMap<String, ElectronicProductPrototype>();

	public static ElectronicProductPrototype getInstance(final String type) throws CloneNotSupportedException {
		return prototypes.get(type).clone();
	}

	public static void loadElectronicProduct() {

		PlayStation play = new PlayStation();
		play.setBrand("Sony");
		play.setGpu("32-bit Sony GPU");
		play.setSpu("16-bit Sony SPU");
		prototypes.put(PLAY, play);

		Tv tv = new Tv();
		tv.setBrand("LG");
		tv.setResolution("Full hd");
		tv.setSize(55);
		tv.setType("LED");
		prototypes.put(TV, tv);

		Laptop laptop = new Laptop();
		laptop.setBrand("Asus");
		laptop.setProcessor("Intel i3");
		laptop.setMemory(512);
		laptop.setHardDisk(1024);
		prototypes.put(LAPTOP, laptop);

	}
}
