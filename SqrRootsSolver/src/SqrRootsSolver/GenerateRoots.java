package SqrRootsSolver;

import java.util.List;

public interface GenerateRoots
{
	public List<ComplexNumber> roots(ComplexNumber a2, ComplexNumber a1, ComplexNumber a0) throws GenerateRootsException;
}
