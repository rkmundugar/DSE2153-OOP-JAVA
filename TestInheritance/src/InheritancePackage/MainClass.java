package InheritancePackage;

class Person {
	
	String namePerson;
	
	public Person() {
		// TODO Auto-generated constructor stub
		System.out.println("Person - Contructor");
	}
	
	void set(String name) {
		System.out.println("Person - set()");
		namePerson = name;
	}
	
	void get() {
		System.out.println("Person - get()");
		System.out.println("Person Name is :" + namePerson);
	}
	
	final void display() {
		System.out.println("Final");
	}
}

class Teacher extends Person{
	public Teacher() {
		// TODO Auto-generated constructor stub
		System.out.println("Teacher - Contructor");
	}
	
	//void set(String name) {
	//	System.out.println("Teacher - set()");
	//	namePerson = name;
	//}
	
	void get() {
		System.out.println("Teacher - get()");
		System.out.println("Teacher Name is :" + namePerson);
	}
	
//	void display() {
//		
//	}
	
}

class Student extends Person {
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("Student - Contructor");
	}
	
	void set(String name) {
		System.out.println("Student - set()");
		namePerson = name;
	}
	
	void get() {
		super.get();
		System.out.println("Student - get()");
		System.out.println("Student Name is :" + namePerson);
	}
}


public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		p1.set("Newton");
		p1.get();
		System.out.println("---------------___-----------");
		
		Teacher t1 = new Teacher();
		t1.set("Isaac");
		t1.get();
		System.out.println("---------------___-----------");
		
		Student s1 = new Student();
		s1.set("Joy");
		s1.get();

	}

}
