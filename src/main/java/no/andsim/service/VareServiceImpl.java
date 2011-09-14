
package no.andsim.service;

import generated.Vare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.jws.WebService;

@WebService(endpointInterface = "no.andsim.service.VareService")
public class VareServiceImpl implements VareService {

	@Override
	public List<Vare> listVarer() {
		return new ArrayList<Vare>(varer.values());
	}

	private Map<Long,Vare> varer = new HashMap<Long, Vare>(); 
	
    public String sayHi(String text) {
        return "Hello from the VareService Mr " + text;
    }
    
    public boolean sendVare(Vare vare){
    	if(!varer.containsKey(vare.getBarcode())){
    		varer.put(vare.getBarcode(), vare);
    		return true;
    	}
    	return false;
    }
}

