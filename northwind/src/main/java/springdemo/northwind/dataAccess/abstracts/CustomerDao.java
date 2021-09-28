package springdemo.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import springdemo.northwind.entities.concretes.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer>{


	
	
}
