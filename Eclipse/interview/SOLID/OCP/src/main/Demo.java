package main;


import java.util.ArrayList;
import java.util.List;

import filter.BetterFilter;
import product.Colour;
import product.Product;
import product.Size;
import product.SizeSpecification;
import specification.AndSpecification;
import specification.ColourSpecification;

public class Demo {

  public static void main(String[] args) {
	    Product apple = new Product("Apple", Colour.GREEN, Size.SMALL);
	    Product apple1 = new Product("Apple", Colour.BLUE, Size.SMALL);
	    Product tree = new Product("Tree", Colour.GREEN, Size.LARGE);
	    Product house = new Product("House", Colour.BLUE, Size.EXTRA_LARGE);
	    List<Product> products = new ArrayList<Product>();
	    products.add(tree);
	    products.add(house);
	    products.add(apple);
	    products.add(apple1);
	  BetterFilter bf = new BetterFilter();
	  System.out.println(bf.filter(products, new SizeSpecification(Size.SMALL)));
	  System.out.println(bf.filter(products, new AndSpecification<Product>(new SizeSpecification(Size.LARGE),
			                                                              new ColourSpecification(Colour.BLUE))));
}
	    
	

}
