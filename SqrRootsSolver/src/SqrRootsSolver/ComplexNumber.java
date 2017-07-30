package SqrRootsSolver;

public class ComplexNumber
{
	private double imaginary;
	private double real;
	
	public ComplexNumber(double real, double imaginary)
	{
		super();
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public double getImaginary()
	{
		return imaginary;
	}
	public void setImaginary(double imaginary)
	{
		this.imaginary = imaginary;
	}

	public double getReal()
	{
		return real;
	}
	public void setReal(double real)
	{
		this.real = real;
	}
	
	public ComplexNumber ComplexNumberAdd(ComplexNumber arg1, ComplexNumber arg2)
	{
		ComplexNumber solution = new ComplexNumber(0,0);
		solution.setReal(arg1.getReal()+arg2.getReal());
		solution.setImaginary(arg1.getImaginary()+arg2.getImaginary());
		return solution;
	}
	
	public ComplexNumber ComplexNumberSubtract(ComplexNumber arg1, ComplexNumber arg2)
	{
		ComplexNumber solution = new ComplexNumber(0,0);
		solution.setReal(arg1.getReal()-arg2.getReal());
		solution.setImaginary(arg1.getImaginary()-arg2.getImaginary());
		return solution;
	}
	
	public ComplexNumber ComplexNumberMultiply(ComplexNumber arg1, ComplexNumber arg2)
	{
		ComplexNumber solution = new ComplexNumber(0,0);
		solution.setReal(arg1.getReal()*arg2.getReal()-arg1.getImaginary()*arg2.getImaginary());
		solution.setImaginary(arg1.getImaginary()*arg2.getReal()-arg2.getImaginary()*arg2.getReal());
		return solution;
	}
	
	public ComplexNumber ComplexNumberDivide(ComplexNumber arg1, ComplexNumber arg2)
	{
		ComplexNumber solution = new ComplexNumber(0,0);
		solution.setReal((arg1.getReal()*arg2.getReal()+arg1.getImaginary()*arg2.getImaginary())/(arg2.getReal()*arg2.getReal()+arg2.getImaginary()*arg2.getImaginary()));
		solution.setImaginary((arg1.getImaginary()*arg2.getReal()-arg1.getReal()*arg2.getImaginary())/(arg2.getReal()*arg2.getReal()+arg2.getImaginary()*arg2.getImaginary()));
		return solution;
	}
}
