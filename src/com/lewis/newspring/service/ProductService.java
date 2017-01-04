/**
 * 
 */
package com.lewis.newspring.service;

import java.util.List;

import com.lewis.newspring.entity.*;

/**
 * @author Œ‚Œµ¥œ
 *
 */
public interface ProductService {

	List<Product> getAllBooks();
	
	Product save(Product product);
	
	Product update(Product product);
	
	Product get(long id);
	
	void delete(long id);
	
	long getNextId();
}
