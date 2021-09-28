package springdemo.northwind.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@Table(name="customers")
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","orders"})
public class Customer {
	@Id
	@GeneratedValue()
	@Column(name="id")
	private int id;
	
	@Column(name="company")
	private String company;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	
	@OneToMany(mappedBy = "customer")
	private List<Order> orders;
	
}
