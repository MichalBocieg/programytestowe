package SqrRootsSolver;

import org.junit.Assert;

import java.util.List;
import java.util.ArrayList;

import SqrRootsSolver.ComplexNumber;
import SqrRootsSolver.GenerateRootsException;
import SqrRootsSolver.GenerateRootsImpl;
import SqrRootsSolver.GenerateRoots;

import org.junit.Test;

public class GenerateRootsTest {
	
	private GenerateRoots rootsTest = new GenerateRootsImpl();

	@Test
	public void DeltaGreaterThanZero() throws GenerateRootsException
	{
		//given
		ComplexNumber a2 = new ComplexNumber(1,0);
		ComplexNumber a1 = new ComplexNumber(5,0);
		ComplexNumber a0 = new ComplexNumber(4,0);
		//when
		List<ComplexNumber> actualSolution = rootsTest.roots(a2, a1, a0);
		List<ComplexNumber> expectedSolution = new ArrayList<ComplexNumber>();
		expectedSolution.add(new ComplexNumber(-1,0));
		expectedSolution.add(new ComplexNumber(-4,0));
		
		// then
		Assert.assertEquals(expectedSolution,actualSolution);
	}
	
	@Test
	public void DeltaLessThanZero() throws GenerateRootsException
	{
		//given
		ComplexNumber a2 = new ComplexNumber(1,0);
		ComplexNumber a1 = new ComplexNumber(2,0);
		ComplexNumber a0 = new ComplexNumber(4,0);
		//when
		List<ComplexNumber> actualSolution = rootsTest.roots(a2, a1, a0);
		List<ComplexNumber> expectedSolution = new ArrayList<ComplexNumber>();
		expectedSolution.add(new ComplexNumber(-1,-Math.sqrt(3)));
		expectedSolution.add(new ComplexNumber(-1,Math.sqrt(3)));
		
		// then
		Assert.assertEquals(expectedSolution,actualSolution);
	}
	@Test
	public void DeltaEqualThanZero() throws GenerateRootsException
	{
		//given
		ComplexNumber a2 = new ComplexNumber(1,0);
		ComplexNumber a1 = new ComplexNumber(-10,0);
		ComplexNumber a0 = new ComplexNumber(25,0);
		//when
		List<ComplexNumber> actualSolution = rootsTest.roots(a2, a1, a0);
		List<ComplexNumber> expectedSolution = new ArrayList<ComplexNumber>();
		expectedSolution.add(new ComplexNumber(5,0));
		expectedSolution.add(new ComplexNumber(5,0));
		
		// then
		Assert.assertEquals(expectedSolution,actualSolution);
	}
	@Test(expected = GenerateRootsException.class)
	public void ComplexNumber() throws GenerateRootsException
	{
		//given
		ComplexNumber a2 = new ComplexNumber(1,0);
		ComplexNumber a1 = new ComplexNumber(1,1);
		ComplexNumber a0 = new ComplexNumber(4,0);
		
		//when
		List<ComplexNumber> actualSolution = rootsTest.roots(a2, a1, a0);
		
		// then
		Assert.fail();
	}
	@Test(expected = GenerateRootsException.class)
	public void NumberMissing() throws GenerateRootsException
	{
		//given
		ComplexNumber a2 = new ComplexNumber(1,0);
		ComplexNumber a1 = null;
		ComplexNumber a0 = new ComplexNumber(4,0);
		
		//when
		List<ComplexNumber> actualSolution = rootsTest.roots(a2, a1, a0);
		
		// then
		Assert.fail();
	}

}
