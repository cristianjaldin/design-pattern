package design.pattern.examples.structural.decorator;

public class RestrictedUserDecorator implements UserOperation {

	private UserOperation user;
	
	public RestrictedUserDecorator(UserOperation user) {
		this.user = user;
	}
	
	public void formatDisk(String drive) {
		this.showName();
		System.out.println("-->No tiene permisos de formatDisk");
	}

	public void ping(String host) {
		this.showName();
		System.out.println("-->No tiene permisos de ping");
	}

	public void install(String application) {
		this.showName();
		System.out.println("-->No tiene permisos de install");
	}

	public void unistall(String application) {
		this.showName();
		System.out.println("-->No tiene permisos de unistall");
	}

	public void open(String file) {
		this.showName();
		this.user.open(file);
	}

	public void modify(String file) {
		this.showName();
		this.user.modify(file);
	}

	public void delete(String file) {
		this.showName();
		System.out.println("-->No tiene permisos de delete");
	}

	public void showName() {
		System.out.print("Restricted User");
		this.user.showName();			
	}
}