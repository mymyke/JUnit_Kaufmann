package test;

import static org.junit.Assert.*;

import java.sql.Date;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import daten.Person;
import daten.Student;

public class StudentTest {

	
	@Test
	public void constructorWithValidArguments() {
		Student s = new Student("H", "B");
		assertSame("H", s.getFirstName());
		assertSame("B", s.getLastName());

		s = new Student("Klaus", "Unger");
		assertEquals("Klaus", s.getFirstName());
		assertEquals("Unger", s.getLastName());
	}
	@Test
	public void constructorWithValidArgumentsFalse() {
		Student s = new Student("F", "D");
		assertSame("H", s.getFirstName());
		assertSame("B", s.getLastName());

		s = new Student("S  ", "D   ");
		assertEquals("Klaus", s.getFirstName());
		assertEquals("Unger", s.getLastName());
	}
	@Test
	public void TestGetSetFirstname(){
		Student s = new Student("F", "D");
		s.setFirstname("hans");
		assertEquals(s.getFirstname(), "hans");
	}
	@Test
	public void TestGetSetLastname(){
		Student s = new Student("F", "D");
		s.setLastname("hans");
		assertEquals(s.getLastname(), "hans");
	}

	@Test
	public void TestCompareTo(){
		Student o=new Student("hans","Berger",true);
		Student s= new Student("hans","Berger",true);
		o.setBirthDate(new Date(Date.UTC(1995, 10, 12, 0, 0, 0)));
		s.setBirthDate(new Date(Date.UTC(1995, 10, 12, 0, 0, 0)));
		assertEquals(s.compareTo(o), 0);
	}
	@Test
	public void TestCompareToFalse(){
		Student o=new Student("hans","Berg",true);
		Student s= new Student("Karl","Peter",true);
		o.setBirthDate(new Date(Date.UTC(1995, 10, 12, 0, 0, 0)));
		s.setBirthDate(new Date(Date.UTC(1995, 10, 12, 0, 0, 0)));
		assertEquals(s.compareTo(o), 0);
	}
	
	@Test
	public void testToString() {

		Student s = new Student("Klaus", "Unger",true);
		
		s.setBirthDate(new Date(Date.UTC(1995, 10, 12, 0, 0, 0)));
		assertEquals("Student: Name= Klaus,Nachname= Unger,Gebursdatum= 3895-11-12,SelfEntitled= true",
				s.toString());
	}
	@Test
	public void testToStringFalse() {

		Student s = new Student("Klaus", "Unger",true);
		assertEquals("Student {firstName=Peter, lastName=Unger, selfEntitled=true}",
				s.toString());
	}


}
