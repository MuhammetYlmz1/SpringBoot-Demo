package springdemo.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import springdemo.northwind.entities.concretes.Order;

public interface OrderDao extends JpaRepository<Order, Integer> {
	List<Order> getByShipName(String shipName);
	
	
	Order getById(int id);
	
	List<Order> getByShipNameAndCustomer(String shipName,int customerId);

	
	List<Order> getByShipNameContains(String shipName);
	
	List<Order> getByShipNameStartsWith(String shipName);
	
	@Query("From Order where shipName =: shipName and customer.id =: customerId")
	List<Order> getByNameAndCustomer(String shipName,int customerId);
	
}
