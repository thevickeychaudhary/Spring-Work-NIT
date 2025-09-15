package com.vc.service;

import java.util.List;

import com.vc.entity.Product;

public interface IProductMgmtService {

	public Product addProduct(Product product);

	public List<Product> showAllProducts();

	public String deleteProduct(int pid);

	public Product findProductById(int pid);

}
