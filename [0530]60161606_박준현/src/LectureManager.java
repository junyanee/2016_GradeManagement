import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class LectureManager {
	//member variables
	private Vector<Lecture> lectureVector;
	
	//Constructor
	public LectureManager() { 
		lectureVector = new Vector<Lecture>();
	}
	
	
	//member functions
	public void readLectureFile() throws FileNotFoundException {
		//read Lecture data
		FileInputStream file = new FileInputStream("lecture");
		Scanner scanner = new Scanner(file);
			while(scanner.hasNext()) {			
				Lecture lecture = new Lecture();
				lecture.ID = scanner.nextInt();
				lecture.name = scanner.next();
				lectureVector.add(lecture);
			}
		scanner.close();
	}
	//member functions
	public String findLectureName(int lectureid) {	
			for (int j=0; j<lectureVector.size(); j++) {
				if (lectureVector.get(j).ID == lectureid)
					return lectureVector.get(j).name;
			}
				return null;
	}

    }
    
	
