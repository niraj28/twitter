package Reposoritory;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Model.Team;


@Repository
public interface TeamRepo extends CrudRepository<Team , String> {
	
}
