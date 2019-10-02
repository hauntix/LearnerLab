package tech.carlos_estrada;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class YearUpWilmington {
	private static final YearUpWilmington instance = new YearUpWilmington();
	private Students students = Students.getInstance();
	private Instructors instructors = Instructors.getInstance();


	private YearUpWilmington(){

	}

	void hostLecture(Teacher teacher, double numberOfHours){
		teacher.lecture((Learner[]) students.toArray(), numberOfHours);
	}

	void hostLecture(long id, double numberOfHours){
		hostLecture((Teacher) instructors.findById(id), numberOfHours);
	}

	Map<Student, Double> getStudyMap(){
		HashMap<Student, Double> studyMap = new HashMap<>();

		while (students.iterator().hasNext()){
			Student tmp = (Student) students.iterator().next();
			studyMap.put(tmp, tmp.getTotalStudyTime());
		}

		return studyMap;
	}

	public static YearUpWilmington getInstance() {
		return instance;
	}
}
