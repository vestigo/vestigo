package org.nightlabs.eclipse.jjqb.childvm.shared;


public class ResultCellNullDTO extends ResultCellDTO
{
	private static final long serialVersionUID = 1L;

	public ResultCellNullDTO() { }

	@Override
	public int hashCode() {
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
