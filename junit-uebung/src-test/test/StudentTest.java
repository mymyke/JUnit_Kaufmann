package test;

import static org.junit.Assert.*;

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
	public void TestCompareTo(){
		Student o=new Student("hans","Berg",true);
		Student s= new Student("hans","Berger",true);
		assertEquals(s.compareTo(o), 0);
	}
	@Test
	public void TestCompareToFalse(){
		Student o=new Student("hans","Berg",true);
		Student s= new Student("Karl","Peter",true);
		assertEquals(s.compareTo(o), 0);
	}
	
	@Test
	public void testToString() {

		Student s = new Student("Klaus", "Unger",true);
		assertEquals("Student {firstName=Klaus, lastName=Unger, selfEntitled=true}",
				s.toString());
	}
	@Test
	public void testToStringFalse() {

		Student s = new Student("Klaus", "Unger",true);
		assertEquals("Student {firstName=Peter, lastName=Unger, selfEntitled=true}",
				s.toString());
	}


}
