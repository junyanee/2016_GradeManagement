import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class StudentManager {
	//member variables
	private Vector<Student> studentVector; //바깥에서 못쓰고 내장해서만 쓸것이다. 라는거 private
	//constructor 
	public StudentManager() { //주로 실행되는 코드와 정의하는 코드는 나눠서 짜는게 좋음. 이 함수
		studentVector = new Vector<Student>();
	}
	
	//method /member functions
	public void readStudentFile() throws FileNotFoundException{ //밖에서도 쓸 수 있도록 하는, 공공재 public
		//read Student data

		FileInputStream file = new FileInputStream("student"); //file로 해도 가능
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNext()) {
			Student student = new Student();
			student.read(scanner);
			studentVector.add(student);
		}
		scanner.close();
	}
	
	public String findStudentName(int id) {
		for (int i=0; i<studentVector.size(); i++) {
			if(studentVector.get(i).getID() == id) {
				return studentVector.get(i).getName(); //이름을 못 찾아도 값을 반환시켜줘야 함.
			}
		}
		return null; //null = 비어있는 것.
		
	}
	

	public String findStudentaddress(int id) {
		for (int i=0; i<studentVector.size(); i++) {
			if(studentVector.get(i).getID() == id) {
				return studentVector.get(i).getAddress(); //이름을 못 찾아도 값을 반환시켜줘야 함.
			}
		}
		return null;
		
	}
}
