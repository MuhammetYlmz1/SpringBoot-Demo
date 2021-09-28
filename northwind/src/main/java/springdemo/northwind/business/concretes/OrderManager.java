package springdemo.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import springdemo.northwind.business.abstracts.OrderService;
import springdemo.northwind.core.utilities.results.DataResult;
import springdemo.northwind.core.utilities.results.Result;
import springdemo.northwind.core.utilities.results.SuccessDataResult;
import springdemo.northwind.core.utilities.results.SuccessResult;
import springdemo.northwind.dataAccess.abstracts.OrderDao;
import springdemo.northwind.entities.concretes.Order;

@Service
public class OrderManager implements OrderService {
	private OrderDao orderDao;

	@Autowired
	public OrderManager(OrderDao orderDao) {
		super();
		this.orderDao = orderDao;
	}

	@Override
	public DataResult<List<Order>> getAll() {

		return new SuccessDataResult<List<Order>>(this.orderDao.findAll(), "Data Listelendi");
	}

	@Override
	public DataResult<Order> getById(int id) {

		return new SuccessDataResult<Order>(orderDao.getById(id), "Data başarıyla bulundu");
		
	}

	@Override
	public DataResult<List<Order>> getByShipName(String shipName) {
		return new SuccessDataResult<List<Order>>(orderDao.getByShipName(shipName), "Data Listelendi");

	}

	@Override
	public DataResult<List<Order>> getByShipNameAndCustomer(String shipName, int id) {

		return new SuccessDataResult<List<Order>>(orderDao.getByShipNameAndCustomer(shipName, id), "Data Listelendi");

	}

	@Override
	public DataResult<List<Order>> getByShipNameContains(String productName) {
		return new SuccessDataResult<List<Order>>(orderDao.getByShipNameContains(productName), "Data Listelendi");

	}

	@Override
	public DataResult<List<Order>> getByShipNameStartsWith(String shipName) {
		// business codes
		return new SuccessDataResult<List<Order>>(orderDao.getByShipNameStartsWith(shipName), "Data Listelendi");
	}

	@Override
	public Result add(Order order) {
		this.orderDao.save(order);
		return new SuccessResult("Başarıyla Eklendi");
	}

	@Override
	public DataResult<List<Order>> getByNameAndCustomer(String shipName, int customerId) {
		return new SuccessDataResult<List<Order>>(orderDao.getByNameAndCustomer(shipName, customerId),
				"Data Listelendi");
	}

	@Override
	public DataResult<List<Order>> getAll(int pageNo, int pageSize) {
		Pageable pageable= PageRequest.of(pageNo-1, pageSize);
		
		return new SuccessDataResult<List<Order>>(this.orderDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<Order>> getAllSorted() {
		Sort sort=Sort.by(Sort.Direction.ASC,"shipName");
		return new SuccessDataResult<List<Order>>(this.orderDao.findAll(sort),"Başarılı");
	}

}
