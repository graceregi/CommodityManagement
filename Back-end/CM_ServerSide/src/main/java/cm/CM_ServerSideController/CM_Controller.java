package cm.CM_ServerSideController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cm.CM_ServerSideModel.CM_Model;
import cm.CM_ServerSideService.CM_Service;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("")
public class CM_Controller {

	@Autowired
	private CM_Service cmService;
	
	@GetMapping("/commodities")
	public List<CM_Model> getAllCommodity(){
		System.out.println("jhg");
		return cmService.getAll();
	}
	
	@GetMapping("/commodities/{xyz}")
	public List<CM_Model> searchCommodity(@PathVariable String xyz){
		return cmService.search(xyz);
	}
	
	@PostMapping("/commodities")
	public String addCommodity(@Valid @RequestBody CM_Model c) {
		return cmService.addCommodity(c);
	}
	
}
