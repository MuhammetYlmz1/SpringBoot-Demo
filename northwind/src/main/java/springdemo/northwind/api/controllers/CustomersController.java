package springdemo.northwind.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springdemo.northwind.business.abstracts.CustomerService;
import springdemo.northwind.core.utilities.results.DataResult;
import springdemo.northwind.entities.concretes.Customer;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {
	
	private CustomerService customerService;

	public CustomersController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Customer>> getAll(){
		return this.customerService.getAll();
		
	}

}
