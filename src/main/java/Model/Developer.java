package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="developer")
@Setter
@Getter
public class Developer {
	
	@Column(name="id")
	private int id;
	
	@Column(name="team_id")
	private int team_id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="phoneNumber")
	private int phoneNumber;
	
	

}
