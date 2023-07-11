package Collection.predicate;


public class Car {

	String name;
	String colour;
	Integer price;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Car(String name, String colour, Integer price) {
		super();
		this.name = name;
		this.colour = colour;
		this.price = price;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	

	@Override
	public String toString() {
		return "Car [name=" + name + ", colour=" + colour + ", price=" + price + "]";
	}
}
