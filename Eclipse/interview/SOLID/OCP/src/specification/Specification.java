package specification;

public interface Specification<T> {
	boolean isSatisfied(T items);
}
