package filter;

import java.util.List;

import specification.Specification;

public interface Filter<T> {
	List<T> filter(List<T> items, Specification<T> spec);
}
