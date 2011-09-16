package no.andsim.persistence;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import no.vareservice.andsim.vare.Vare;

public class VareRepository {
	private Map<Long,Vare> varer = new HashMap<Long, Vare>(); 
	
	private static VareRepository repo;
	
	private VareRepository(){
		
	}
	
	public static synchronized VareRepository getVareRepository(){
		if(repo == null){
			repo = new VareRepository();
		}
		return repo;
	}
	
	public boolean addVare(Vare vare){
		if(!varer.containsKey(vare.getBarcode())){
    		varer.put(vare.getBarcode(), vare);
    		return true;
    	}
    	return false;
	}
	
	public List<Vare> getVareList(){
		return new ArrayList<Vare>(varer.values());
	}
	
	public Vare getVare(Long barcode){
		return varer.get(barcode);
	}
	
}
