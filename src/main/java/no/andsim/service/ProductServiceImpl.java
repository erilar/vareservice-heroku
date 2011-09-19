
package no.andsim.service;


import javax.jws.WebService;

import no.andsim.persistence.ProductRepository;
import no.productservice.andsim.product.Product;
import no.productservice.andsim.productlist.ProductList;

@WebService(endpointInterface = "no.andsim.service.ProductService")
public class ProductServiceImpl implements ProductService {

	private static final ProductRepository REPO = ProductRepository.getProductRepository();
	
	@Override
	public ProductList listProducts() {
		ProductList list = new ProductList();
		for (Product product : REPO.getProductList()) {
			list.getProduct().add(product);
		}
		return list;
	}

    public String sayHi(String text) {
        return "Hello from the ProductService Mr " + text;
    }
    
    public boolean sendProduct(Product vare){
    	return REPO.addProduct(vare);
    }
}

