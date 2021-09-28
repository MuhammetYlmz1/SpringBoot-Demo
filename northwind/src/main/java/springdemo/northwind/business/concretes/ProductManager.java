package springdemo.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springdemo.northwind.business.abstracts.ProductService;
import springdemo.northwind.core.utilities.results.DataResult;
import springdemo.northwind.core.utilities.results.Result;
import springdemo.northwind.core.utilities.results.SuccessDataResult;
import springdemo.northwind.core.utilities.results.SuccessResult;
import springdemo.northwind.dataAccess.abstracts.ProductDao;
import springdemo.northwind.entities.concretes.Product;


@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}
	
	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün Eklendi");
	}

	@Override
	public Result deleteByProductId(int id) {
		this.productDao.deleteById(id);
		return new SuccessResult("Ürün Silindi");
	}

	@Override
	public DataResult<List<Product>> findByProductName(String name) {
		return new SuccessDataResult<List<Product>>(this.productDao.findByProductName(name),"İsime göre listelendi");
	}
	
}
