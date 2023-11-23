package main;

public class Student {
	
	String firstName,lastName,course,section,year;
	float midtermGrade,finalGrade;
	
	
	Student(String firstName, String lastName, 
			String course, 
			String section, String year, float midtermGrade, float finalGrade ){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.section = section;
		this.year = year;
		this.midtermGrade = midtermGrade;
		this.finalGrade = finalGrade;
		
	}
	
		void introduceSelf() {
			System.out.println("Full Name: " + lastName + " , " + firstName );
			System.out.println("Course: " + course );
			System.out.println("School Year: " + year );
			System.out.println("Section: " + section );
			
		}
		
		void evaluateGrade() {
			float average = (midtermGrade + finalGrade) / 2;
			System.out.println("Full Name: " + firstName + " " + lastName);
			System.out.println("Average : " + average);
			
			String remark = "";
			
			if ( average > 100) remark = "Invalid Grade";
			else if ( average >= 98 ) remark = "With Highest Honors";
			else if ( average >= 95 ) remark = "With High Honors";
			else if ( average >= 90 ) remark = "With Honors";
			else if ( average >= 75 ) remark = "Passed";
			else remark = "Failed";
			
			System.out.println("Remarks : " + remark);
		}
}




