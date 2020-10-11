package specification;

public class AndSpecification<T> implements Specification<T> {
	private Specification<T> first, second;

	public AndSpecification(Specification<T> first, Specification<T> second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public boolean isSatisfied(T items) {

		return first.isSatisfied(items) && second.isSatisfied(items);
	}
}
