package cm.CM_ServerSideService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cm.CM_ServerSideModel.CM_Model;
import cm.CM_ServerSideRepository.CM_Repository;

@Service
public class CM_Service {

	
	@Autowired
	private CM_Repository cmrepository;
	
	public List<CM_Model> getAll(){
		return cmrepository.findAll();
	}
	
	public List<CM_Model> search(String xyz){
		List<CM_Model> empty= new ArrayList<>();
		List<CM_Model> l1= new ArrayList<>();
		List<CM_Model> l2= cmrepository.findAll();
		if(xyz.isEmpty()) {
			return empty;
		}
		
		for(CM_Model c:l2) {
			if(c.getCname().toLowerCase().contains(xyz)|| 
				c.getCost().toString().toLowerCase().contains(xyz)||
				c.getDescription().toLowerCase().contains(xyz)||
				c.getQty().toString().toLowerCase().contains(xyz)) 
			{
				l1.add(c);
			}
		}
		
		return l1;
	}

	
	public String addCommodity(CM_Model c) {
		if(c!=null) {
		cmrepository.save(c);
		return "Success";
		}
		return "error";
	}
	
	public String deleteCM(String cname) {
		cmrepository.deleteById(cname);
		return "Deleted";
	}
	
}
