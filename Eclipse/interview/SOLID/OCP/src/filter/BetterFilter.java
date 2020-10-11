package filter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import product.Product;
import specification.Specification;

public class BetterFilter implements Filter<Product> {

	@Override
	public List<Product> filter(List<Product> items, Specification<Product> spec) {
		List<Product> products = new ArrayList<Product>();
		Iterator<Product> productList = items.listIterator();
		for (Iterator iterator = items.iterator(); iterator.hasNext();) {
			Product product = (Product) iterator.next();
			if (spec.isSatisfied(product)) {
				products.add(product);
			}
		}
		return products;
	}
}
