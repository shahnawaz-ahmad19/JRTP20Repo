package in.ashokit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="CONTACT_DTLS")
@Data
public class Contact {
	
	@Id
	@GeneratedValue
	private int cid;
	private String name;
	private String email;
	private long phno;
	private String activeSw;
	
	
	
	

}
