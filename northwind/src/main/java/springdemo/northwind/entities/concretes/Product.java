package springdemo.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="products")
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	@Column(name="supplier_ids")
	private String supplierIds;
	
	@Id
	@GeneratedValue()
	@Column(name="id")
	private int id;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="list_price")
	private double listPrice;
	
	@Column(name="category")
	private String category;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;


}
