package com.ibm.hibernate_project_crud_operation.controller;

import java.util.List;

import com.ibm.hibernate_project_crud_operation.dao.ProductDao;
import com.ibm.hibernate_project_crud_operation.dto.Product;

public class GetAllProductController {
    public static void main(String[] args) {
        ProductDao dao = new ProductDao();
        List<Product> products = dao.getAllProductDao();  //Calls the getAllProductDao method of the ProductDao class to retrieve a list of all products from the database.

        for (Product product : products) {   //        // Iterate over the list of products and print each product.
            System.out.println(product);
        }
    }
}
