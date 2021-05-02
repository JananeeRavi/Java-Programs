
public class Calculator {
	
	public void add(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	
	public void addition(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println(d);
	}
	
	public void multiply(int a, int b)
	{
		int c = a*b;
		System.out.println(c);
	}
	
	public void multiplication(int a, double b)
	{
		double c = a*b;
		System.out.println(c);
	}

	public void sub (int a, int b)
	{
		int c = a-b;
		System.out.println(c);
	}
	
	public void subtraction(int a, double b)
	{
		double c = a-b;
		System.out.println(c);
		}
	
	public void div(int a, int b)
	{
		int c=a/b;
		System.out.println(c);
	}
	
	public void divide(double a, int b)
	{
		double c = a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(2, 3);
		c.addition(25, 25, 25);
		c.sub(20, 10);
		c.subtraction(100, 75.25);
		c.multiply(2, 20);
		c.multiplication(2, 7.5);
		c.div(20, 4);
		c.divide(100.0, 20);
		

	}

}
