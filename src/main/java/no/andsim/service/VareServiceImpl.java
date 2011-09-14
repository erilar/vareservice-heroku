
package no.andsim.service;

import generated.Vare;

import java.util.List;

import javax.jws.WebService;

import no.andsim.persistence.VareRepository;

@WebService(endpointInterface = "no.andsim.service.VareService")
public class VareServiceImpl implements VareService {

	private static final VareRepository REPO = VareRepository.getVareRepository();
	
	@Override
	public List<Vare> listVarer() {
		return REPO.getVareList();
	}

    public String sayHi(String text) {
        return "Hello from the VareService Mr " + text;
    }
    
    public boolean sendVare(Vare vare){
    	return REPO.addVare(vare);
    }
}

