import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class SugangManager {
	
	private Vector<Sugang> sugangVector;
	
	public SugangManager() {
		sugangVector = new Vector<Sugang>();
	}
	
	public void readSugangFile() throws FileNotFoundException {
		//read Sugang data
	FileInputStream file = new FileInputStream("sugang");	
	Scanner scanner = new Scanner(file);
		while(scanner.hasNext()) {			
			Sugang sugang = new Sugang();
			sugang.lectureID = scanner.nextInt();
			sugang.studentID = scanner.nextInt();
			sugang.score = scanner.nextInt();
			sugangVector.add(sugang);	
		}
	scanner.close();
	}

	public int findLectureid(int id) {
		for (int i=0; i<sugangVector.size(); i++) {
			if(sugangVector.get(i).studentID == id) {
				return sugangVector.get(i).lectureID; //이름을 못 찾아도 값을 반환시켜줘야 함.
			}
		}
		 //null = 비어있는 것.
		return id;
		
	}
	public int findLecturescore(int id) {
		for (int i=0; i<sugangVector.size(); i++) {
			if(sugangVector.get(i).studentID == id) {
				return sugangVector.get(i).score;
			}
		}
		return id;
	}
	
}
