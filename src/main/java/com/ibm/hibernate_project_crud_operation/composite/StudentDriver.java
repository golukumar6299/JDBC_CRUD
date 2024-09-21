package com.ibm.hibernate_project_crud_operation.composite;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDriver {
	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa-hibernate-mysql");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		StudentsId id=new StudentsId("aman.com", "988888878");  //Creates an instance of StudentsId with email and phone.
		
		Student student= new Student(id);  //Creates a Student entity using the composite key id.
		
		et.begin();
		em.persist(student);  //Persists the Student entity to the database.
		et.commit();         //Commits the transaction to save changes.
		
	}
}


//Purpose of Using Composite Key in Hibernate
//	1.Uniqueness Across Multiple Columns:A composite key ensures the uniqueness of a combination of multiple columns
//  2.Logical Grouping: Composite keys logically group related columns together.

//Using composite keys in Hibernate ensures that your application's data model accurately represents
//the real-world entities and relationships, leveraging Hibernate's capabilities to manage complex primary key
//structures.
