package Service;

import org.junit.Test;

import Model.Team;
import Reposoritory.DeveloperRepo;

@SpringBootTest 
public class ServiceTest {
	
	
	@Mock
	private DeveloperRepo developerRepo;
	
	@Mockup{
	
	}
	
	@Test
	public void saveTeamTest() {
	Team team = createTeam();
//		Mockito.(developerRepo.saveTeam(team)).it
		
//		asert("","");
		
	}

	private Team createTeam() {
		// TODO Auto-generated method stub
		Team team = new Team();
		return team;
	}
	

}
