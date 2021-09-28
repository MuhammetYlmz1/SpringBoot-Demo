package springdemo.northwind.business.abstracts;

import java.util.List;

import springdemo.northwind.core.utilities.results.DataResult;
import springdemo.northwind.core.utilities.results.Result;
import springdemo.northwind.entities.concretes.Product;

public interface ProductService  {
	DataResult<List<Product>> getAll();
	
	Result add(Product product);
	
	Result deleteByProductId(int id);
	
	DataResult<List<Product>> findByProductName(String name);
	
}
