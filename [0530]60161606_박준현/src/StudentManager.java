import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class StudentManager {
	//member variables
	private Vector<Student> studentVector; //�ٱ����� ������ �����ؼ��� �����̴�. ��°� private
	//constructor 
	public StudentManager() { //�ַ� ����Ǵ� �ڵ�� �����ϴ� �ڵ�� ������ ¥�°� ����. �� �Լ�
		studentVector = new Vector<Student>();
	}
	
	//method /member functions
	public void readStudentFile() throws FileNotFoundException{ //�ۿ����� �� �� �ֵ��� �ϴ�, ������ public
		//read Student data

		FileInputStream file = new FileInputStream("student"); //file�� �ص� ����
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
				return studentVector.get(i).getName(); //�̸��� �� ã�Ƶ� ���� ��ȯ������� ��.
			}
		}
		return null; //null = ����ִ� ��.
		
	}
	

	public String findStudentaddress(int id) {
		for (int i=0; i<studentVector.size(); i++) {
			if(studentVector.get(i).getID() == id) {
				return studentVector.get(i).getAddress(); //�̸��� �� ã�Ƶ� ���� ��ȯ������� ��.
			}
		}
		return null;
		
	}
}
