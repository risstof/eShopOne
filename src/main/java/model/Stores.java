package model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Stores {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence_Store")
	@SequenceGenerator(name = "id_Sequence_Store", sequenceName = "ID_SEQ_STORE")
	private long storeId;
	String storeName;
	String storeDescription;
	
}
