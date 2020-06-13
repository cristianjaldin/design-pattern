package design.pattern.examples.structural.decorator;

public interface UserOperation {
	
	void formatDisk(String drive);

	void ping(String host);

	void install(String application);

	void unistall(String application);

	void open(String file);

	void modify(String file);

	void delete(String file);

	void showName();
}
