package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="team")
@Setter
@Getter
public class Team {

	
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
}
