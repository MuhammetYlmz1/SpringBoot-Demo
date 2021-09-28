package springdemo.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springdemo.northwind.business.abstracts.CustomerService;
import springdemo.northwind.core.utilities.results.DataResult;
import springdemo.northwind.core.utilities.results.SuccessDataResult;
import springdemo.northwind.dataAccess.abstracts.CustomerDao;
import springdemo.northwind.entities.concretes.Customer;

@Service
public class CustomerManager implements CustomerService{
	
	private CustomerDao customerDao;
	
	@Autowired
	public CustomerManager(CustomerDao customerDao) {
		this.customerDao=customerDao;
	}
	
	@Override
	public DataResult<List<Customer>> getAll() {
		
		return new SuccessDataResult<List<Customer>>(this.customerDao.findAll(),"Data Listelendi");
	}

}
