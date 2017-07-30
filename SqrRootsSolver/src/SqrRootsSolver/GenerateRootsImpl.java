package SqrRootsSolver;

import java.util.List;
import java.util.ArrayList;

import SqrRootsSolver.ComplexNumber;
import SqrRootsSolver.GenerateRootsException;
import SqrRootsSolver.GenerateRoots;

public class GenerateRootsImpl implements GenerateRoots
{
	private String error_1 = "Enter a non-null value";
	private String error_2 = "Enter real value";
	
	@Override
	public List<ComplexNumber> roots(ComplexNumber a2, ComplexNumber a1, ComplexNumber a0) throws GenerateRootsException
	{
		ValueCheck(a2);
		ValueCheck(a1);
		ValueCheck(a0);
		
		List<ComplexNumber> listOfRoots = new ArrayList<ComplexNumber>();
		double delta = a1.getReal()*a1.getReal() - 4*a0.getReal()*a2.getReal();
		ComplexNumber root1 = new ComplexNumber(0,0);
		ComplexNumber root2 = new ComplexNumber(0,0);
		
		if(delta>=0)
		{
			root1.setReal((-1)*a1.getReal()-Math.sqrt(delta)/2*a2.getReal());
			root1.setImaginary(0);
			root2.setReal((-1)*a1.getReal()+Math.sqrt(delta)/2*a2.getReal());
			root2.setImaginary(0);
		}
		else
		{
			root1.setReal((-1)*a1.getReal()/(2*a2.getReal()));
			root1.setImaginary(-Math.sqrt((-1)*delta)/(2*a2.getReal()));
			root2.setReal((-1)*a1.getReal()/(2*a2.getReal()));
			root2.setImaginary(Math.sqrt((-1)*delta)/(2*a2.getReal()));
		}
		
		listOfRoots.add(root1);
		listOfRoots.add(root2);
		return listOfRoots;
	}
	
	private void ValueCheck(ComplexNumber value) throws GenerateRootsException 
	{
		if (value == null) {
			throw new GenerateRootsException(error_1);
		}
		if(value.getImaginary()!=0)
		{
			throw new GenerateRootsException(error_2);
		}
	}
}
