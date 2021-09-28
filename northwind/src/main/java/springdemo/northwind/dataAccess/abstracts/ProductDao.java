package springdemo.northwind.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import springdemo.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	
	List<Product> findByProductName(String name);
	
}
