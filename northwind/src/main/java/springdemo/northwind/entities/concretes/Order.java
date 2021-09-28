package springdemo.northwind.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@Table(name="orders")
@NoArgsConstructor
public class Order {
	
	@Id
	@GeneratedValue()
	@Column(name="id")
	private int id;
	
	/*@Column(name="customer_id")
	private int customerId;*/
	
	@Column(name="order_date")
	private Date orderDate;
	
	@Column(name="shipped_date")
	private Date shippedDate;
	
	@Column(name="ship_name")
	private String shipName;
	
	//ilişkilendirme
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customer;
	
	

}
