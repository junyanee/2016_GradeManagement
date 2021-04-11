import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//����� �����
		Scanner scanner = new Scanner(System.in);
		
		StudentManager studentManager = new StudentManager();
		studentManager.readStudentFile(); //����� ����ִ��� �˷��ְ� ()�ȿ����� ä����~ �ϴ� �� ��, �� ����� ������ ��� �׸��� �ִ� Call by reference
		LectureManager lectureManager = new LectureManager();
		lectureManager.readLectureFile();
		SugangManager sugangManager = new SugangManager();
		sugangManager.readSugangFile();		
		
		System.out.println("�л� ID�� �Է��ϼ��� :");
		
		while (!scanner.hasNextInt()) { //���� �������� �Ǻ�
            scanner.nextLine();  //���� ���ڰ� �ƴϸ� ������.
            System.out.print("�л�ID�� �������� �ʽ��ϴ�.");
		}	
		
		while(true){
		
			int id = scanner.nextInt();
		
			if(0<id && id<6){
				String name = studentManager.findStudentName(id);
				int lectureid = sugangManager.findLectureid(id);
				String lecturename = lectureManager.findLectureName(lectureid);
				int score = sugangManager.findLecturescore(id);
				String address = studentManager.findStudentaddress(id);
		
				System.out.println("�л��̸�:"+name);
				System.out.println("�����ϴ� �����:"+lecturename);
				System.out.println("�ּ�:"+address);
				System.out.println("����:"+score);
				
				while (!scanner.hasNextInt()) { //���� �������� �Ǻ�
		            scanner.next();  //���� ���ڰ� �ƴϸ� ������.
		            System.out.print("�л�ID�� �������� �ʽ��ϴ�.");
				}	
			
			}else{
				System.out.println("�л� ID�� �������� �ʽ��ϴ�.");
			}
		
		}

	}
	
}