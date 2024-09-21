package com.ibm.hibernate_project_crud_operation.dao;

import java.util.List;

import com.ibm.hibernate_project_crud_operation.dto.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
							//The ProductDao class encapsulates the logic for persisting and retrieving Product entities, making it easier to manage these operations in a centralized manner.
public class ProductDao {  //Purpose: ProductDao is a Data Access Object (DAO) class responsible for performing CRUD operations on Product entities.

	EntityManagerFactory emf=Persistence.createEntityManagerFactory("jpa-hibernate-mysql");
	EntityManager em= emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
		public Product saveProductDao(Product product) {  //Saves a Product entity to the database and returns the saved entity or null if an exception occurs.
			try {
				et.begin();
				em.persist(product);  // Adds the product entity to the persistence context, making it managed and persistent (but not yet saved to the database).
				et.commit();   //Commits the transaction, making all changes (like the persisted product) permanent in the database.
				
				return product;  // // Return the saved product
			}catch(Exception e) {
				e.printStackTrace();
				return null;
			}
		}
		
		public Product getProductByIdDao(int productid) {   //This method retrieves a Product entity from the database by its ID.
			return em.find(Product.class,productid);   // Finds and returns the Product entity with the specified ID. If no such entity exists, it returns null.
		}
		
		
		
		public boolean deleteProductByIdDao(int id) {   //Deletes a Product entity from the database by its ID.
			Product p = getProductByIdDao(id);     
			
			if(p!=null) {    //Checks if the product exists using getProductByIdDao. If it exists, begins a transaction, removes the product, commits the transaction, and returns true.
				try {
					et.begin();
					em.remove(p);
					et.commit();
					return true;
				}catch(Exception e) {
					e.printStackTrace();
					return false;
				}
			}else {
				return false;
			}
		}
		
		
		public Product updateProductNameByIdDao(int id, String name) {
			Product p = getProductByIdDao(id);
			
			if(p!=null) {   
				try {
					p.setName(name);
					et.begin();
					em.merge(p);
					et.commit();
					return p;
				}catch(Exception e) {
					e.printStackTrace();
					return null;
				}
			}else {
				return null;
			}
		}
		
//		displayAllProductDao
		public List<Product> getAllProductDao(){     // Retrieves all Product entities from the database.
			return em.createQuery("from Product").getResultList();   //Process: Uses a JPQL query ("from Product") to fetch all products and returns them as a list.
		}
		
		
		
}





