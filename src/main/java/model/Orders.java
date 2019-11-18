package model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_Sequence_Orders")
	@SequenceGenerator(name = "id_Sequence_Orders", sequenceName = "ID_SEQ_ORDERS")
	private long ordersId;
	String orderName;
	String description;
	String clientLogin;
	String clientName;
	String orderStatus;
	String orderedBy;
	Date dateFrom;
	Date dateTo;
	String PaymentsType;

}
