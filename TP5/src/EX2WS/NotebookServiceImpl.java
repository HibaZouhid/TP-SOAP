package EX2WS;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface="EX2WS.NoteBookService",serviceName=
"NoteBookService", portName = "NoteBookPort")
public class NotebookServiceImpl implements NotebookService {

	private List<Person> persons = new ArrayList<Person>();

	public NotebookServiceImpl() {
		Person newPerson = new Person();
		newPerson.setName("hiba");
		newPerson.setAddress("CASA");
		persons.add(newPerson);

		newPerson = new Person();
		newPerson.setName("zouhid");
		newPerson.setAddress("Agadir");
		persons.add(newPerson);
		
		newPerson = new Person();
		newPerson.setName("HIBA");
		newPerson.setAddress("KESH");
		persons.add(newPerson);
	}

	@Override
	public boolean addPerson(Person p) {
		System.out.println("addPerson method has been invoked:" + p);

		if (p == null) {
			throw new NullPointerException("Person is null");
		}

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return persons.add(p);
	}

	@Override
	public List<Person> getPersons() {
		System.out.println("getPersons method has been invoked.");

		return persons;
	}

	@Override
	public Person getPersonAt(String name) {
		System.out.println("getPersonAt method has been invoked: " + name);

		if (name == null || name.isEmpty()) {
			throw new NullPointerException("Name is null.");
		}

		for (Person person : persons) {
			if (name.equalsIgnoreCase(person.getName())) {
				return person;
			}
		}

		return null;
	}
}
