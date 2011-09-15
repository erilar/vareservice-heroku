package no.andsim.service;

import generated.Vare;
import generated.VareList;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/varer/")
@Produces("application/xml")
public interface VareServiceRS {

	@GET
	public abstract VareList listVarer();

	@PUT
	@Path("/vare")
	public abstract boolean addVare(Vare vare);

	@GET
	@Path("/vare/{barcode}")
	@Produces("application/xml")
	public abstract Vare getVare(@PathParam("barcode") String barcode);

}