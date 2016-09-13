package javaInterface;

public class CellPhone extends Electronics implements IProduct {

	public CellPhone() {
		// TODO Auto-generated constructor stub
	}
	private int price;
	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSalePrice()
	{
		return price/2;
	}
	public int ProductId;
	public String Name;
}
