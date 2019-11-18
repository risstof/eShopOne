package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence_Address")
	@SequenceGenerator(name = "id_Sequence_Address", sequenceName = "ID_SEQ_ADDRESS")
	private long addressId;
	String country;
	String postalCode;
	String city;
	String street;
	String houseNo;
	Integer localNo;
	String addresDescription;
	
}
