package design.pattern.examples.structural.decorator;

public class User implements UserOperation {
	
	private String name;
	private String home;
	
	//constructor
	public User(String name) {
		this.name = name;
	}
	
	//setter and getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	
	//operations
	public void formatDisk(String drive) {
		System.out.println("-->Disco formateado: "+drive);
	}
	
	public void ping(String host) {
		System.out.println("-->Ping: "+host);
	}
	
	public void install(String application) {
		System.out.println("-->Aplicacion instalada: "+application);
	}

	public void unistall(String application) {
		System.out.println("-->Aplicacion desinstalada: "+application);
	}

	public void open(String file) {
		System.out.println("-->Archivo abierto: "+file);
	}

	public void modify(String file) {
		System.out.println("-->Archivo modificado: "+file);
	}

	public void delete(String file) {
		System.out.println("-->Archivo eliminado: "+file);
	}

	public void showName() {
		System.out.println(" *"+this.name+"* ");		
	}
}