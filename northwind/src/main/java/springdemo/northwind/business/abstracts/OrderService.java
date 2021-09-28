package springdemo.northwind.business.abstracts;


import java.util.List;


import springdemo.northwind.core.utilities.results.DataResult;
import springdemo.northwind.core.utilities.results.Result;
import springdemo.northwind.entities.concretes.Order;


public interface OrderService{
	DataResult<List<Order>> getAll();
	
	DataResult<List<Order>> getAllSorted();
	
	DataResult<List<Order>> getAll(int pageNo,int pageSize);
	
	Result add(Order order);
	
	DataResult<Order> getById(int id);
	
	DataResult<List<Order>> getByShipName(String shipName);

	DataResult<List<Order>> getByShipNameAndCustomer(String shipName, int id);

	DataResult<List<Order>> getByShipNameContains(String shipName);

	DataResult<List<Order>> getByShipNameStartsWith(String shipName);

	DataResult<List<Order>> getByNameAndCustomer(String shipName, int customerId);

}
