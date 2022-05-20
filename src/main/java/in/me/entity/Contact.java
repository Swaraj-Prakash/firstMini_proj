package in.me.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="Contact_DTLS")
@Data
public class Contact {
	
	//This is the Table which is created by @Entity
	@Id
	@GeneratedValue
	private int cid;
	private String name;
	private String email;
	private long phno;
	private String activeSw;
}
