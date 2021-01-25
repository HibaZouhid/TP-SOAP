package EX1WS;

import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(name = "NotebookService")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface NotebookService {
	boolean addPerson(Person p);
	List<Person> getPersons();
	Person getPersonAt(String name);
}
