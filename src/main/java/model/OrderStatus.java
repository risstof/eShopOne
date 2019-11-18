package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class OrderStatus {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence_OrderStatus")
	@SequenceGenerator(name = "id_Sequence_OrderStatus", sequenceName = "ID_SEQ_ORDERSTATUS")
	private long orderstatusId;
	String status;
	String description;

}
