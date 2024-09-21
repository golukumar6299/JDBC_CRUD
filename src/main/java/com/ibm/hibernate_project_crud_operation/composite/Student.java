package com.ibm.hibernate_project_crud_operation.composite;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity  				//@Entity: Indicates that this class is a JPA entity.
@Data					//@Data: A Lombok annotation to generate getters, setters, toString, equals, and hashCode methods.
@AllArgsConstructor    //@AllArgsConstructor and @NoArgsConstructor: Generate constructors.
@NoArgsConstructor
public class Student {
	
	@EmbeddedId
	private StudentsId id;  //id: An instance of StudentsId, used as the composite key.

}
