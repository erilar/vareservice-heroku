package no.andsim.service;

import generated.Vare;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import no.andsim.persistence.VareRepository;

@Path("/varer/")
@Produces("application/xml")
public class VareServiceRS {

	private static final VareRepository REPO = VareRepository.getVareRepository();

	@GET
	public List<Vare> listVarer() {
		return REPO.getVareList();
	}

	@PUT
	@Path("/vare")
	public boolean addVare(Vare vare) {
		return REPO.addVare(vare);
	}

	@GET
	@Path("/vare/{barcode}")
	@Produces("application/xml")
	public Vare getVare(@PathParam("barcode") String barcode) {
		return REPO.getVare(Long.parseLong(barcode));
	}

}
