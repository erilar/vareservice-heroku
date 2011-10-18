package no.itera.pservice.service;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import no.productservice.andsim.product.Product;
import no.productservice.andsim.productlist.ProductList;

@Path("/products/")
@Produces({"application/json", "application/xml"})
public interface ProductServiceRS {

	@GET
	public abstract ProductList listProducts();

	@POST
	public abstract boolean addProduct(Product vare);

	@GET
	@Path("/{barcode}")
	public abstract Product getProduct(@PathParam("barcode") String barcode);

}