package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Model.Developer;
import Model.Team;
import Service.DevTeamService;

@RestController
public class DevTeam {
	
	@Autowired
	private DevTeamService devTeamService;
	
	@RequestMapping(value="/team", method=RequestMethod.POST)
	public  void saveTeam(@RequestBody Model.Team team) {
		devTeamService.saveTeam(team);
	}
	
	@RequestMapping(value="/dev", method=RequestMethod.POST)
	public  void saveDeveloper(@RequestBody Developer developer) {
		devTeamService.saveDeveloper(developer);
	}
	
	
	@RequestMapping(value="/send/Alert", method=RequestMethod.POST)
	public  void sendAlert(@RequestBody Team team) {
		devTeamService.sendAlert(team);
	}
	
	
	
	

}
