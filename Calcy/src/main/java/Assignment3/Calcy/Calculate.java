package Assignment3.Calcy;

public class Calculate 
{
	int a,b,c;
	public Calculate(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public int add()
	{
		c=a+b;
		return c;
	}
	public int subtract()
	{
		c=a-b;
		return c;
	}
	public int multiply()
	{
		c=a*b;
		return c;
	}
	public int divide()
	{
		c=a/b;
		return c;
	}
}