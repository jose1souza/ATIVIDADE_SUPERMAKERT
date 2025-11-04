package model;

import java.util.List;

public interface CalculateVenda {
	public void calculate(List<Product> products);
	public List<Product> getProducts();
	public Double getTotaly();
}
