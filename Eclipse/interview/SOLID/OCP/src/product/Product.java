package product;

public class Product {
	private String name;
	private Size size;
	private Colour colour;

	public Product(String name, Colour colour,Size size) {
		super();
		this.name = name;
		this.size = size;
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Colour getColour() {
		return colour;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", size=" + size + ", colour=" + colour + "]";
	}
	

}
