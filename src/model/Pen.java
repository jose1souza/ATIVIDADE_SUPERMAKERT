package model;

public class Pen extends Product{
	
	public Pen(int quantity, Double value){
		this.quantity = quantity;
		this.value = value;
	}
	
	@Override
	public Double calculateValue() {
		return this.value * quantity;
	}

	@Override
	public int getQuantity() {
		return this.quantity;
	}

	@Override
	public Double getValue() {
		return this.value;
	}

	@Override
	public String getName() {
		return "Caneta";
	}
	
}
