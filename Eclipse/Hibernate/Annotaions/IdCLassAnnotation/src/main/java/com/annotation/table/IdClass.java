package com.annotation.table;

import java.io.Serializable;

public class IdClass implements Serializable {
	private String id;
	private String increment;

	public IdClass() {
		super();
	}

	public IdClass(String id, String increment) {
		super();
		this.id = id;
		this.increment = increment;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIncrement() {
		return increment;
	}

	public void setIncrement(String increment) {
		this.increment = increment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((increment == null) ? 0 : increment.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IdClass other = (IdClass) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (increment == null) {
			if (other.increment != null)
				return false;
		} else if (!increment.equals(other.increment))
			return false;
		return true;
	}

}
