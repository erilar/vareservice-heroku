package no.andsim.service;

import javax.jws.WebService;

import no.productservice.andsim.product.Product;
import no.productservice.andsim.productlist.ProductList;

@WebService
public interface ProductService {
    String sayHi(String text);
    boolean sendProduct(Product product);
    ProductList listProducts();
}

