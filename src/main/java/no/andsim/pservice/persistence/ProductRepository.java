package no.andsim.pservice.persistence;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import no.productservice.andsim.product.Product;

public class ProductRepository {
	private Map<Long,Product> products = new HashMap<Long, Product>(); 
	
	private static ProductRepository repo;
	
	private ProductRepository(){
		
	}
	
	public static synchronized ProductRepository getProductRepository(){
		if(repo == null){
			repo = new ProductRepository();
		}
		return repo;
	}
	
	public boolean addProduct(Product product){
		if(!products.containsKey(product.getBarcode())){
    		products.put(product.getBarcode(), product);
    		return true;
    	}
    	return false;
	}
	
	public List<Product> getProductList(){
		return new ArrayList<Product>(products.values());
	}
	
	public Product getProduct(Long barcode){
		return products.get(barcode);
	}
	
}
