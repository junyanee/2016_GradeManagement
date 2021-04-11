import java.util.Scanner;

public class Student {
	private int ID;
	private String name;
	private String address;
	
	// member functions
	public void read(Scanner scanner)  {
		this.ID = scanner.nextInt();
		this.name = scanner.next();
		this.address = scanner.next();
		
	}
	// getter & setters
	public int getID() {
		return ID;
	}
	public String getName() {
		return this.name;
	}
	public String getAddress() {
		return this.address;
	}

	
}