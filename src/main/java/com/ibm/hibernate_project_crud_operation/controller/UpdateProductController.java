package com.ibm.hibernate_project_crud_operation.controller;

import com.ibm.hibernate_project_crud_operation.dao.ProductDao; //The Data Access Object (DAO) class that handles database operations for Product entities.

import com.ibm.hibernate_project_crud_operation.dto.Product;  //The Product entity class that represents a product in the database.

public class UpdateProductController {
	public static void main(String[] args) {
		ProductDao productDao = new ProductDao();   //        // Create an instance of ProductDao to perform database operations.
        Product p = productDao.updateProductNameByIdDao(101, "Pen");   //The updateProductNameByIdDao method of the ProductDao class is called to update the name of the product with ID 101 to "Pen".


		if(p!=null){
			System.out.println("Data updated");
		}else {
			System.out.println("Given id is not found");
		}
	}
}
