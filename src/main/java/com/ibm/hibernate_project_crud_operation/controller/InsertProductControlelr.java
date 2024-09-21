package com.ibm.hibernate_project_crud_operation.controller;

import java.time.LocalDate;

import com.ibm.hibernate_project_crud_operation.dao.ProductDao;
import com.ibm.hibernate_project_crud_operation.dto.Product;

public class InsertProductControlelr {
	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		
		Product product2 = new Product(101,"marker", "red",LocalDate.parse("2020-03-04"),LocalDate.parse("2020-03-03"));
		
		Product p=dao.saveProductDao(product2);
//		Product p=dao.saveProductService(product2);

		
		if(p!=null) {
			System.out.println("Data Stored");
		}else {
			System.out.println("Data not stored");
		}
	}
}
