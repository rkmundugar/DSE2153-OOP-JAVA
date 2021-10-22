package sampleInheritancePackage;

class Person {
	String Name;
	
	public Person() {
		// TODO Auto-generated constructor stub
		System.out.println("From Person Class - Constructor");
		Name = "Person Not Initialized";
	}
	
	void set (String name) {
		Name = name;
	}
	
	String get () {
		System.out.println("From Person Class -get()");
		return Name;
	}
}

class Teacher extends Person {
	
	public Teacher() {
		// TODO Auto-generated constructor stub
		System.out.println("From Teacher Class - Constructor");
	}
	
	void set (String name) {
		Name = name;
	}
	
	String get () {
		super.get();
		System.out.println("From Teacher Class - get()");
		return Name;
	}
}

class Student extends Person {
	
	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("From Student Class - Constructor");
	}
	
	void set (String name) {
		Name = name;
	}
	
	String get () {
		System.out.println("From Student Class - get()");
		return Name;
	}
}


public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person();
		System.out.println("--- p1 Created -------");
		
		p1.set("Rama");
		String className = p1.get();
		System.out.println("Name is: " + className);
		
		Teacher t1 = new Teacher();
		System.out.println("--- t1 Created -------");
		//t1.set("Newton");
		//t1.Name = "Newton";
		String nameTeacher = t1.get();
		System.out.println("Name is: " + nameTeacher);
		
		
		Student s1 = new Student();
		System.out.println("--- s1 Created -------");
		String nameStudent = s1.get();
		System.out.println("Name is: " + nameStudent);

	}

}
