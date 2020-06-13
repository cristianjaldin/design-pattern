package design.pattern.examples.structural.decorator;

public class RootUserDecorator implements UserOperation {

	private UserOperation user;
	
	public RootUserDecorator(UserOperation user) {
		this.user = user;
	}
	
	public void formatDisk(String drive) {
		this.showName();
		this.user.formatDisk(drive);
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
		this.user.unistall(application);
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
		System.out.print("Root User");
		this.user.showName();			
	}

}
