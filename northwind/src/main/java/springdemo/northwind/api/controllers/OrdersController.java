package springdemo.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import springdemo.northwind.business.abstracts.OrderService;
import springdemo.northwind.core.utilities.results.DataResult;
import springdemo.northwind.core.utilities.results.Result;
import springdemo.northwind.entities.concretes.Order;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {
	private OrderService orderService;
	
	@Autowired
	public OrdersController(OrderService orderService) {
		this.orderService=orderService;
	}
	
	
	@PostMapping("/add")
	public Result add(Order order){
		return this.orderService.add(order);
		
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Order>> getAll(){
		
		return this.orderService.getAll();
		
	}
	@GetMapping("/getByShipName")
	public DataResult<List<Order>> getByShipName(@RequestParam String shipName){
		
		return this.orderService.getByShipName(shipName);
	}
	@GetMapping("/getByShipNameAndCustomerId")
	public DataResult<List<Order>> getByShipNameAndCustomerId(@RequestParam String shipName,@RequestParam int customerId){
		
		return this.orderService.getByNameAndCustomer(shipName, customerId);
	}
	@GetMapping("/getShipNameContains")
	public DataResult<List<Order>> getByShipNameContains(@RequestParam String shipName){
		return this.orderService.getByShipNameContains(shipName);
	}
	@GetMapping("/getShipNameStartWith")
	public DataResult<List<Order>> getByShipNameStartsWith(@RequestParam String shipName){
		
		return this.orderService.getByShipNameStartsWith(shipName);
	
	}
	
	@GetMapping("/getAllByPage")
	DataResult<List<Order>> getAll(int pageNo,int pageSize){
		return this.orderService.getAll(pageNo, pageSize);
	}
	@GetMapping("/getAllAsc")
	public DataResult<List<Order>> getAllSorted(){
		return this.orderService.getAllSorted();
	}
		
	
}
