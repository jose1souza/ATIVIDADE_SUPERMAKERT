package model;

import java.util.List;

public abstract class Product {
	protected int quantity;
	protected Double value;
	protected String name;
	
	public abstract Double calculateValue();
	public abstract int getQuantity();
	public abstract Double getValue();
	public abstract String getName();
}
