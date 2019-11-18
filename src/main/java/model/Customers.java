package model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Customers {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence_Customer")
	@SequenceGenerator(name = "id_Sequence_Customer", sequenceName = "ID_SEQ_CUSTOMER")
	private long CustomerId;
	String customerName;
	String customerLogin;
	String customerNotice;
	String storeNotice;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "orders_customer", joinColumns = @JoinColumn(name = "customerId"), inverseJoinColumns = @JoinColumn(name = "ordersId"))
	Set<Orders> orderCustomer;

	@OneToMany
	@JoinColumn(name = "CustomerId")
	private Set<Address> CustomerAddress;

}
