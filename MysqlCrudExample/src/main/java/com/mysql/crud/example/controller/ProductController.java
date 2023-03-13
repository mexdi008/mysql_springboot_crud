package com.mysql.crud.example.controller;

import com.mysql.crud.example.entity.Product;
import com.mysql.crud.example.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/product")
public class ProductController {
	private final ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}

	@PostMapping("/saveProducts")
	public List<Product> saveProducts(@RequestBody List<Product> products) {
		return productService.saveProducts(products);
	}
	@GetMapping("/getAll")
	public List<Product> getProducts() {
		return productService.getProducts();
	}

	@GetMapping("/get/{id}")
	public Product getProductById(@PathVariable Long id) {
		return productService.getProductById(id);
	}

	@GetMapping("/getProductByNamed/{name}")
	public Product getProductByName(@PathVariable String name) {
		return productService.getProductByName(name);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable Long id) {
		productService.deleteProductByİd(id);
		return "Product " + id + " Deleted successfully";
	}
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}

}
