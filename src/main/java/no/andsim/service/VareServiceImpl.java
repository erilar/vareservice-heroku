
package no.andsim.service;


import javax.jws.WebService;

import no.andsim.persistence.VareRepository;
import no.vareservice.andsim.vare.Vare;
import no.vareservice.andsim.varelist.VareList;

@WebService(endpointInterface = "no.andsim.service.VareService")
public class VareServiceImpl implements VareService {

	private static final VareRepository REPO = VareRepository.getVareRepository();
	
	@Override
	public VareList listVarer() {
		VareList list = new VareList();
		for (Vare vare : REPO.getVareList()) {
			list.getVare().add(vare);
		}
		return list;
	}

    public String sayHi(String text) {
        return "Hello from the VareService Mr " + text;
    }
    
    public boolean sendVare(Vare vare){
    	return REPO.addVare(vare);
    }
}

