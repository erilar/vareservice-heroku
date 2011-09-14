package no.andsim.service;

import generated.Vare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/varer/")
@Produces("application/xml")
public class VareServiceRS {

	private Map<Long,Vare> varer = new HashMap<Long, Vare>(); 
	
	@GET
	public List<Vare> listVarer(){
		return new ArrayList<Vare>(varer.values());
	}
	
	@PUT
	@Path("/vare")
	public boolean addVare(Vare vare){
		if(!varer.containsKey(vare.getBarcode())){
    		varer.put(vare.getBarcode(), vare);
    		return true;
    	}
    	return false;
	}
	
	@GET
	@Path("/vare/add/{barcode}/{name}")
	public Vare addVare(@PathParam("barcode")String barcode,@PathParam("name")String name){
		if(!varer.containsKey(Long.parseLong(barcode))){
			Vare vare = new Vare();
			vare.setBarcode(Long.parseLong(barcode));
			vare.setName(name);
			varer.put(Long.parseLong(barcode), vare);
			return vare;
		}
		return null;
	}
	
	
	@GET
    @Path("/vare/{barcode}")
    @Produces("application/xml")
	public Vare getVare(@PathParam("barcode") String barcode){
		return varer.get(Long.parseLong(barcode));
	}
	
	
}
