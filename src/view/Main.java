package view;

import java.util.ArrayList;
import java.util.List;

import model.CalculateVenda;
import model.Kart;
import model.Pen;
import model.Product;
import model.Venda;

public class Main {
	public static void main(String[] args) {
		Product pen = new Pen(3,3.0);
		Product pen2 = new Pen(4,5.0);
		
		List<Product> products = new ArrayList<Product>();
		products.add(pen);
		products.add(pen2);
		
		CalculateVenda venda = new Venda(products);
		
		venda.calculate(products);
		Kart carrinho = new Kart(venda);
		carrinho.fiscal();
	}
}
