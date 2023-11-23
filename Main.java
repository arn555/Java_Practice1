package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
//		Example of Class instantiation
//		Person p = new Person();
//		
//		p.firstName = "David";
//		p.lastName = "Sdpt";
//		p.sex = 'M';
//		p.age = 19;
//		
//		Person p1 = new Person();
//		p1.firstName = "Alenere";
//		p1.lastName = "Sdpt";
//		p1.sex = 'F';
//		p1.age = 19;
//		
//		System.out.println(p.firstName);
//		System.out.println(p1.firstName);
		
//		Scanner s = new Scanner(System.in);
//		
//		System.out.print("Name: " );
//		String name = s.nextLine();
//		
//		System.out.print("Price: " );
//		float price = s.nextFloat();
		
//		Product p = new Product(name,price);
		
//		Product p = new Product("Noodles", 52.2f);
//		
//		
//		Person per = new Person("Arn", "Mendoza", 'M', 25);
//		

//		Character c = new Character("Arn", "Hello, Welcome!", 100, 50, 5);
//		Character c1 = new Character("Alenere", "Hi, Welcome!", 75, 125, 10);
//		c1.introduce();
//		c1.sayDialog();
		
//		System.out.println(c.talkTo(c1));
		
//		Student s = new Student("Arn", "Mendoza" , "BSIT", "Bonifacio", "Second Year", 95.5f, 97.75f);
//		s.evaluateGrade();
		
//		User u = new User(483326, "admin", "John", "Smith");
////		u.setUserID(241);
//		int id = u.getUserID();
//		System.out.println("User Id: " + id);
//		
//		String user = u.getUserName();
//		System.out.println("Username: " + user);
		
//		unprotected without private
//		String user = u.userName = "asdfsdf";
//		System.out.println(user);
		
		
//		u.setFirstName("Robert");
//		u.setLastName("Downey, Jr.");
//		
//		String name = u.getFirstName();
//		System.out.println("Firstname: " + name);
//		
//		String last = u.getLastName();
//		System.out.println("Lastname: " + last);

		
		Employee e = new Employee ("David", "Sdpt", "Programmer", "Mars", "Mars", 21);
		
		Employee e1 = new Employee("Alenere", "Sdpt", "Programmer");
		
		Employee e2 = new Employee();
		
		System.out.println(e1.sex);
		
	}

}
