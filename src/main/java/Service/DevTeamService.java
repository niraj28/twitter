package Service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import Model.Developer;
import Model.Team;
import Reposoritory.DeveloperRepo;
import Reposoritory.TeamRepo;


public class DevTeamService {
	
	@Autowired
	private TeamRepo teamRepo;
	
	@Autowired
	private DeveloperRepo developerRepo;
	
	
	
	public  void saveTeam(Team team) {
		teamRepo.save(team);
	}

	public void saveDeveloper(Developer developer) {
		developerRepo.save(developer);
		
	}

	public void sendAlert(Team team) {
		List<Developer> devList =developerRepo.findByTeamId(team.getId());	
		Random rand = new Random();
	    Developer randomElement = devList.get(rand.nextInt(devList.size()));
	    
	    sendMessage(randomElement.getPhoneNumber());
		
	}

	private void sendMessage(int phoneNumber) {
		//send me=saage on phoneNumber
		
	}

}
