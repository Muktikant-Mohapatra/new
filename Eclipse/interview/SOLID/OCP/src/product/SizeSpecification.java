package product;

import specification.Specification;

public class SizeSpecification implements Specification<Product> {
	private Size size;

	public SizeSpecification(Size size) {
		super();
		this.size = size;
	}

	@Override
	public boolean isSatisfied(Product items) {
		return items.getSize() == size;
	}
}
