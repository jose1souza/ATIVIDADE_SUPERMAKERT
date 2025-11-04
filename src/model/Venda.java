package model;

import java.util.ArrayList;
import java.util.List;

public class Venda implements CalculateVenda{
	private Double total = 0.0;
	private List<Product> products;
	
	public Venda( List<Product> products){
		this.products = new ArrayList<>();
		this.products = products;
	}

	@Override
	public void calculate(List<Product> products) {
		for (Product product : products) {
			total += product.calculateValue();
		}
	}

	public List<Product> getProducts(){
		return products;
	}
	
	public Double getTotaly(){
		return total;
	}
	
}
