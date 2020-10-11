package specification;

import product.Colour;
import product.Product;

public class ColourSpecification implements Specification<Product> {
	private Colour colour;

	public ColourSpecification(Colour color) {
		this.colour = color;
	}

	@Override
	public boolean isSatisfied(Product p) {
		return p.getColour() == colour;
	}
}
