package tech.carlos_estrada;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class People implements Iterable{
	private List<Person> personList = new ArrayList<Person>();

	void addPerson(Person person){
		this.personList.add(person);
	}

	Person findById(long id){

		while(this.iterator().hasNext()){
			if(iterator().next().getId() == id)
				return iterator().next();
		}

		return null;
	}

	boolean contains(Person person){
		return personList.contains(person);
	}

	void remove(Person person){
		this.personList.remove(person);
	}

	void remove(long id){
		this.personList.remove(findById(id));
	}

	void removeAll(){
		this.personList.clear();
	}

	int count(){
		return personList.size();
	}

	Person[] toArray(){
		return (Person[]) this.personList.toArray();
	}

	public Iterator<Person> iterator() {
		return personList.iterator();
	}
}
