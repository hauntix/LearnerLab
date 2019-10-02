package tech.carlos_estrada;

public class Students extends People {
	private static final Students uniqueInstance = new Students();

	private Students() {
		uniqueInstance.addPerson(new Student(0, "Sarah"));
		uniqueInstance.addPerson(new Student(1, "Aubrey"));
		uniqueInstance.addPerson(new Student(2, "Serafin"));
		uniqueInstance.addPerson(new Student(3, "David"));
	}

	public static Students getInstance() {
		return uniqueInstance;
	}
}
