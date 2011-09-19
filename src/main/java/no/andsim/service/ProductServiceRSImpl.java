package no.andsim.service;

import no.andsim.persistence.ProductRepository;
import no.productservice.andsim.product.Product;
import no.productservice.andsim.productlist.ProductList;

import org.springframework.stereotype.Service;

@Service(value="ProductServiceRS")
public class ProductServiceRSImpl implements ProductServiceRS {

	private static final ProductRepository REPO = ProductRepository.getProductRepository();

	@Override
	public ProductList listProducts() {
		ProductList list = new ProductList();
		for (Product vare : REPO.getProductList()) {
			list.getProduct().add(vare);
		}
		return list;
	}

	@Override
	public boolean addProduct(Product vare) {
		return REPO.addProduct(vare);
	}

	@Override
	public Product getProduct(String barcode) {
		return REPO.getProduct(Long.parseLong(barcode));
	}

}
