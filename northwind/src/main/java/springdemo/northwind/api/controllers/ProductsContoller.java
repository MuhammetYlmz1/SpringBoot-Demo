package springdemo.northwind.api.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springdemo.northwind.business.abstracts.ProductService;
import springdemo.northwind.core.utilities.results.DataResult;
import springdemo.northwind.core.utilities.results.Result;
import springdemo.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsContoller {
	
	
	private ProductService productService;
	
	@Autowired
	public ProductsContoller(ProductService productService) {
		super();
		this.productService = productService;
	}


	@GetMapping("/getall")
	public DataResult<List<Product>> getAll(){
		return this.productService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Product product){
		
		return this.productService.add(product);
	}
	@PostMapping("/delete")
	public Result delete(int id) {
		return this.productService.deleteByProductId(id);
	}
	
	@GetMapping("/searchByProductName")
	public DataResult<List<Product>> getByProductName(@RequestParam String name){
		return this.productService.findByProductName(name);
	}

}
