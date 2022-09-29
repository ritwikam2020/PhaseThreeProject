package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.ProductRepository;
import com.example.demo.model.Product;

@RestController
@RequestMapping("products")
public class ProductController {
	@Autowired
	ProductRepository productrepository;
	
	@GetMapping("all")
	public List<Product> getAllProducts()
	{
		List<Product> book=(List<Product>) productrepository.findAll();
		return book;
	}
	@PostMapping("add")
	public Product addProduct(@RequestBody Product product)
	{
		return productrepository.save(product);
	}
	@GetMapping("product/{id}")
	public Optional<Product> getProductId(@PathVariable int id)
	{
		return productrepository.findById(id);
	}
	
	@GetMapping("product/color/{color}")
	public List<Product> getProductColor(@PathVariable String color)
	{
		return productrepository.findByColor(color);
	}
	
	@GetMapping("product/price/{price}")
	public List<Product> getProductPrice(@PathVariable Integer price)
	{
		return productrepository.findByPrice(price);
	}
	@GetMapping("product/catagory/{catagory}")
	public List<Product> getProductCatagory(@PathVariable String catagory)
	{
		return productrepository.findByCatagory(catagory);
	}
	
	@GetMapping("product/brand/{brand}")
	public List<Product> getProductBrand(@PathVariable String brand)
	{
		return productrepository.findByBrand(brand);
	}
	
	@GetMapping("product/season/{season}")
	public List<Product> getProductSeason(@PathVariable String season)
	{
		return productrepository.findBySeason(season);
	}
	
	@GetMapping("product/date/{date}")
	public List<Product> getProductDate(@PathVariable String date)
	{
		return productrepository.findByCreatedDate(date);
	}
	@GetMapping("product/userproduct")
	public List<Object> getUserProductDetails()
	{
		return productrepository.findByProductOrder();
	}
	// update existing student 
	@PutMapping("update/{id}")
	public Product updateProduct(@RequestBody Product product)
	{
		return productrepository.save(product);
	}
	
	// delete particular student from database
	@DeleteMapping("delete/{id}")
	public void deleteProduct(@PathVariable int id)
	{
		productrepository.deleteById(id);
	}
	
	@DeleteMapping("delete")
	public void deleteAllProducts()
	{
		productrepository.deleteAll();
	}

}
