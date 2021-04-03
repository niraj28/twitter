package Reposoritory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Model.Developer;

@Repository
public interface DeveloperRepo extends CrudRepository<Developer , String> {

	
	public List<Developer> findByTeamId(int teamId);
}
