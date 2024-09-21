package com.ibm.hibernate_project_crud_operation.composite;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
					//A composite key is a primary key composed of multiple columns. 
					//In Hibernate, composite keys are implemented using an embeddable class, which is annotated with @Embeddable, and then using this embeddable class as a field in the main entity class annotated with @EmbeddedId.
@Embeddable   		//@Embeddable: Indicates that this class is intended for use as part of another entity.
@AllArgsConstructor
@NoArgsConstructor
public class StudentsId {
	
	private String email;   //email and phone: These fields together make up the composite key.
	private String phone;
}

