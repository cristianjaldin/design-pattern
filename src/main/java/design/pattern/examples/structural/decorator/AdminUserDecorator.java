package design.pattern.examples.structural.decorator;

public class AdminUserDecorator implements UserOperation {
	
	private UserOperation user;
	
	public AdminUserDecorator(UserOperation user) {
		this.user = user;
	}
	public void formatDisk(String drive) {
		this.showName();
		System.out.println("-->No tiene permisos de formatDisk");
	}

	public void ping(String host) {
		this.showName();
		this.user.ping(host);
	}

	public void install(String application) {
		this.showName();
		this.user.install(application);
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
		this.user.delete(file);
	}

	public void showName() {
		System.out.print("Admin User");
		this.user.showName();			
	}
	
}
