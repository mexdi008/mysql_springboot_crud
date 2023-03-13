package com.mysql.crud.example.service;

import com.mysql.crud.example.entity.Product;
import com.mysql.crud.example.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
	private ProductRepository productRepository;

	public Product saveProduct(Product product) {

		return productRepository.save(product);
	}

	public List<Product> saveProducts(List<Product> products) {
		return productRepository.saveAll(products);
	}

	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	public Product getProductById(Long Id) {
		return productRepository.findById(Id).orElse(null);
	}

	public Product getProductByName(String name) {
		return productRepository.findByName(name);
	}

	public String deleteProductByİd(Long id) {
		productRepository.deleteById(id);
		return "Product " + id + " Deleted succesfully";
	}

	public Product updateProduct(Product product) {
		Product existingProduct = productRepository.findById(product.getId()).orElse(null);
		assert existingProduct != null;
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return productRepository.save(existingProduct);
	}

}
