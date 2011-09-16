package no.andsim.service;

import org.springframework.stereotype.Service;

import no.andsim.persistence.VareRepository;
import no.vareservice.andsim.vare.Vare;
import no.vareservice.andsim.varelist.VareList;

@Service(value="VareServiceRS")
public class VareServiceRSImpl implements VareServiceRS {

	private static final VareRepository REPO = VareRepository.getVareRepository();

	@Override
	public VareList listVarer() {
		VareList list = new VareList();
		for (Vare vare : REPO.getVareList()) {
			list.getVare().add(vare);
		}
		return list;
	}

	@Override
	public boolean addVare(Vare vare) {
		return REPO.addVare(vare);
	}

	@Override
	public Vare getVare(String barcode) {
		return REPO.getVare(Long.parseLong(barcode));
	}

}
