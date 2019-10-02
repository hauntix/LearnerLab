package tech.carlos_estrada;

public class Instructors extends People {
	private static final Instructors instructors = new Instructors();

	private Instructors(){
		instructors.addPerson(new Instructor(69, "Mikaila"));
	}

	public static Instructors getInstance() {
		return instructors;
	}
}
