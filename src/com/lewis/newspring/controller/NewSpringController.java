/**
 * 
 */
package com.lewis.newspring.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lewis.newspring.entity.Product;
import com.lewis.newspring.service.ProductService;

import org.springframework.ui.*;

/**
 * @author Œ‚Œµ¥œ
 *
 */
@Controller
public class NewSpringController {

	@Autowired
	private ProductService productService;

	private static final Log logger = LogFactory.getLog(NewSpringController.class);

	@RequestMapping(value = "/hello")
	public String printHello(ModelMap model){
		logger.info("printHello called");
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "hello";
	}
	
	@RequestMapping(value = "/index")
	public String login(ModelMap model){
		logger.info("login called");
		return "ProductList";
	}
	
	@RequestMapping(value = "/product_input")
	public String inputProduct(ModelMap model){
		logger.info("inputProduct called");
		Product product = new Product();
		model.addAttribute("product", product);
		return "ProductForm";
	}
	
	@RequestMapping(value = "/product_edit/{index}")
	public String editProduct(Model model, @PathVariable long index){
		logger.info("editProduct called");
		Product product = productService.get(index);
		model.addAttribute("product", product);
		return "ProductEditForm";
	}
	
	@RequestMapping(value = "/product_delete/{index}")
	public String deleteProduct(Model model, @PathVariable long index){
		logger.info("deleteProduct called");
		productService.delete(index);
		return "redirect:/product_list";
	}
	
	@RequestMapping(value = "/product_save")
	public String saveProduct(Product product, Model model){
		logger.info("saveProduct called");
		productService.save(product);
		return "redirect:/product_list";
	}
	
	@RequestMapping(value = "/product_update")
	public String updateProduct(Product product, Model model){
		logger.info("updateProduct called");
		productService.update(product);
		return "redirect:/product_list";
	}
	
	@RequestMapping(value = "/product_list")
	public String listProducts(Model model){
		logger.info("listProducts called");
		List<Product> products = productService.getAllBooks();
		model.addAttribute("products", products);
		return "ProductList";
	}

}
