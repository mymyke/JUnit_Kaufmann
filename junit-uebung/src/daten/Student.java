package daten;
import java.util.Date;

public class Student extends Person implements Comparable<Student> {

	public Student(String firstName, String lastName) {
		this(firstName, lastName, false);
		setFirstname(firstName);
		setLastname(lastName);
	}

	public Student(String firstName, String lastName, boolean selfEntitled) {
		super(firstName, lastName);
		setFirstname(firstName);
		setLastname(lastName);
		setSelfEntitled(selfEntitled);
	}

	private boolean selfEntitled;
	private Date birthDate; 
	private String firstname;
	private String lastname;  // TODO add getter,setter,Constructors

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setSelfEntitled(boolean selfEntitled) {
		this.selfEntitled = selfEntitled;
	}
	public boolean getSelfEntitled() {
		return selfEntitled;
	}

	@Override
	public int compareTo(Student o) {
		int result = 0;

		// TODO implement meaningful unit tests
		if ((result = getLastName().compareTo(o.getLastName())) == 0) {
			if ((result = getFirstName().compareTo(o.getFirstName())) == 0) {
				result = birthDate.compareTo(o.birthDate); // TODO change to
															// getter after
															// implementation
			}
		}
		return result;
	}

	@Override
	public String toString() {
		// TODO missing implementation
		return "Student: Name= "+getFirstname()+
				",Nachname= "+getLastname()+
				",Gebursdatum= "+getBirthDate()+
				",SelfEntitled= "+getSelfEntitled();
		
		
	}
}
