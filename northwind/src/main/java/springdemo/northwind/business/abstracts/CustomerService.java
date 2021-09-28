package springdemo.northwind.business.abstracts;

import java.util.List;

import springdemo.northwind.core.utilities.results.DataResult;
import springdemo.northwind.entities.concretes.Customer;


public interface CustomerService {
	DataResult<List<Customer>> getAll();
	

}
