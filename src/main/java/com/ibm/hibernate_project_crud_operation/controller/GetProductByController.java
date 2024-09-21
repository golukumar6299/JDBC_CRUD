package com.ibm.hibernate_project_crud_operation.controller;

import com.ibm.hibernate_project_crud_operation.dao.ProductDao;   //ProductDao is the Data Access Object class used to interact with the Product entity.
import com.ibm.hibernate_project_crud_operation.dto.Product;   //Product is the entity class representing the data model.

public class GetProductByController {    //Class Purpose: GetProductByController is a controller class responsible for retrieving and displaying a Product entity by its ID.
	public static void main(String[] args) {
		Product p=new ProductDao().getProductByIdDao(123);  //Creates a new instance of ProductDao.Calls the getProduct method on the ProductDao instance to retrieve a Product entity with the ID 123.The retrieved Product entity is stored in the variable p.
		
		if(p!=null){
			System.out.println(p);
		}else {
			System.out.println("not found");
		}
	}
}

//This controller class demonstrates how to use the ProductDao to fetch a Product entity from the database and handle the result accordingly.