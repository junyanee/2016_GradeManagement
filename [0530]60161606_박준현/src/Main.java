import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//냉장고를 만든것
		Scanner scanner = new Scanner(System.in);
		
		StudentManager studentManager = new StudentManager();
		studentManager.readStudentFile(); //냉장고 어디있는지 알려주고 ()안에껄로 채워라~ 하는 것 즉, 이 방식이 사탕을 담는 그릇을 주는 Call by reference
		LectureManager lectureManager = new LectureManager();
		lectureManager.readLectureFile();
		SugangManager sugangManager = new SugangManager();
		sugangManager.readSugangFile();		
		
		System.out.println("학생 ID를 입력하세요 :");
		
		while (!scanner.hasNextInt()) { //값이 숫자인지 판별
            scanner.nextLine();  //값이 숫자가 아니면 버린다.
            System.out.print("학생ID가 존재하지 않습니다.");
		}	
		
		while(true){
		
			int id = scanner.nextInt();
		
			if(0<id && id<6){
				String name = studentManager.findStudentName(id);
				int lectureid = sugangManager.findLectureid(id);
				String lecturename = lectureManager.findLectureName(lectureid);
				int score = sugangManager.findLecturescore(id);
				String address = studentManager.findStudentaddress(id);
		
				System.out.println("학생이름:"+name);
				System.out.println("수강하는 과목명:"+lecturename);
				System.out.println("주소:"+address);
				System.out.println("점수:"+score);
				
				while (!scanner.hasNextInt()) { //값이 숫자인지 판별
		            scanner.next();  //값이 숫자가 아니면 버린다.
		            System.out.print("학생ID가 존재하지 않습니다.");
				}	
			
			}else{
				System.out.println("학생 ID가 존재하지 않습니다.");
			}
		
		}

	}
	
}