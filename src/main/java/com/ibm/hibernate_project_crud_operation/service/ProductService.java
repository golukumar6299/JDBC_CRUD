package com.ibm.hibernate_project_crud_operation.service;

import com.ibm.hibernate_project_crud_operation.dao.ProductDao;
import com.ibm.hibernate_project_crud_operation.dto.Product;

public class ProductService {
	ProductDao dao=new ProductDao();
	
	public Product saveProductService(Product product) {
		int id= product.getId();
		String color=product.getColor();
		
		if((id>99 && id<1000)&&(color.equalsIgnoreCase("blue"))) {
			return dao.saveProductDao(product);
		}else {
			System.out.println("Please pass color as blue and id with 3 digits only");
			return null;
		}
	}
}
