package car.carexhibition.cars;

public abstract class Car {

	private long price;

	public abstract String getBrand();

	public void setPrice(long price) {
		this.price = price;
	}

	public long getPrice() {
		return price;
	}
}
