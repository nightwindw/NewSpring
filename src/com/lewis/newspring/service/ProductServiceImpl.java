/**
 * 
 */
package com.lewis.newspring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lewis.newspring.entity.Product;

/**
 * @author 吴蔚聪
 *
 */
@Service
public class ProductServiceImpl implements ProductService {

	private List<Product> products;
	/**
	 * 
	 */
	public ProductServiceImpl() {
		products = new ArrayList<Product>();
		products.add(new Product(1L, "洗衣机", "三年保修", 500));
		products.add(new Product(2L, "热水器", "并不能保修半个世纪", 500));
	}

	/* (non-Javadoc)
	 * @see com.lewis.newspring.service.ProductService#getAllBooks()
	 */
	@Override
	public List<Product> getAllBooks() {
		return products;
	}

	/* (non-Javadoc)
	 * @see com.lewis.newspring.service.ProductService#save(com.lewis.newspring.entity.Product)
	 */
	@Override
	public Product save(Product product) {
		product.setId(getNextId());
		products.add(product);
		return product;
	}

	/* (non-Javadoc)
	 * @see com.lewis.newspring.service.ProductService#update(com.lewis.newspring.entity.Product)
	 */
	@Override
	public Product update(Product product) {
		int count = products.size();
		
		for (int i = 0; i < count; i++){
			Product savedProduct = products.get(i);
			if(savedProduct.getId() == product.getId()){
				products.set(i, product);
				return product;
			}
		}
		
		return product;
	}

	/* (non-Javadoc)
	 * @see com.lewis.newspring.service.ProductService#get(long)
	 */
	@Override
	public Product get(long id) {
		for (Product product : products){
			if(id == product.getId()){
				return product;
			}
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.lewis.newspring.service.ProductService#getNextId()
	 */
	@Override
	public long getNextId() {
		long id = 0L;
		for (Product product : products){
			long productId = product.getId();
			if(productId > id){
				id = productId;
			}
		}
		
		return id + 1;
	}

	@Override
	public void delete(long id) {
		Product removeProduct = null;
		for (Product product : products){
			if(id == product.getId()){
				removeProduct = product;
				break;
			}
		}
		
		if(removeProduct != null){
			products.remove(removeProduct);
		}
	}

}
