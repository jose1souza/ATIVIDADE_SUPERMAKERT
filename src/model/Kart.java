package model;

public class Kart {
	CalculateVenda venda;
	
	public Kart(CalculateVenda venda) {
		this.venda = venda;
	}
	
	public void fiscal() {
		Double totalCompra=0.0;
		System.out.println("Produto " +" Quantidade" + "  Valor" + "  Total");
		for (Product product : venda.getProducts()) {
			System.out.println(product.getName() + "         " + product.getQuantity() +""+ "      "+product.getValue() + "  "+(product.getQuantity() * product.getValue()));
			totalCompra+=product.getQuantity() * product.getValue();
		}
		System.out.println("Total da compra: "+totalCompra);
	}
}
