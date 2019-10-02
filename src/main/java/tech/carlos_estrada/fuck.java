package tech.carlos_estrada;

public class fuck {
	public static void main(String[] args) {
		Person person = new Person(1, "Steve");
		People people = new People();
		people.addPerson(person);

		System.out.println(people.findById(1).getName());
	}
}
