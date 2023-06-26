package com.devvali.cruddemo;

import com.devvali.cruddemo.dao.StudentDAO;
import com.devvali.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

@Bean
	CommandLineRunner commandLineRunner(StudentDAO studentDAO){

		return runner -> {

			//createStudent(studentDAO);

			CreateMultipleStudents(studentDAO);
			
			readStudent(studentDAO);
			

		};
	}

	private void readStudent(StudentDAO studentDAO) {

		//create a student object

		System.out.println("Creating new student object....");
		Student tempStudent=new Student("Radu", "Babeanu ", "babeanu@gmail.com");

		//save the student
		System.out.println("Saving the student....");
		studentDAO.save(tempStudent);

		//display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved student. Generated id: " + theId);

		//retrive student based on the id: primary key
		System.out.println("Retriving student with id : " + theId);
		Student myStudent=studentDAO.findById(theId);

		//display student
		System.out.println("Found the student: " +myStudent );
	}

	private void CreateMultipleStudents(StudentDAO studentDAO) {
		//create multiple students
//		System.out.println( "Creating new students objects...");
//		Student tempstudent1= new Student("Magda", "Iliescu", "magda@gmail.com");
//
//		Student tempstudent2= new Student("Valentin", "Radu", "valentin8@gmail.com");
//
//		Student tempstudent3= new Student("Andreea", "Radu", "andreea8@gmail.com");
//
//		Student tempstudent4= new Student("David", "Radu", "David@gmail.com");
//		//save the student objects
//		System.out.println("Saving the students....");
//		studentDAO.save(tempstudent1);
//
//		studentDAO.save(tempstudent2);
//
//		studentDAO.save(tempstudent3);
//
//		studentDAO.save(tempstudent4);
	}

	private void createStudent(StudentDAO studentDAO) {
		//create the student object

//		System.out.println( "Creating new student object...");
//		Student tempstudent= new Student("Valentin", "Iliescu", "iliescuvalentin8@gmail.com");
////save the student object
//		System.out.println("Saving the student....");
//		studentDAO.save(tempstudent);
//
//		//display id of the saved student
//		System.out.println("Save student.Generated id: " + tempstudent.getId());
	}
}
