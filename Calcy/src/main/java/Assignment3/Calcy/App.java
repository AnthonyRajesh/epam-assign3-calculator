package Assignment3.Calcy;

import java.util.*;
public class App 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Addition\n2.Subtraction\n3.Multipication\n4.Division\n");
		System.out.println("Enter the operation number which you want to perform: ");
		int n=sc.nextInt();
		if(n<1 || n>4)
		{
			System.out.println("Enter valid operation number.");
			System.exit(0);
		}
		System.out.println("Enter two operands to perform the operation: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Calculate c=new Calculate(a,b);
		int ans=0;
		switch(n)
		{
			case 1:
				ans=c.add();
				System.out.println("Addition of two numbers is: "+ans);
				break;
			case 2:
				ans=c.subtract();
				System.out.println("Subtraction of two numbers is: "+ans);
				break;
			case 3:
				ans=c.multiply();
				System.out.println("Multiplication of two numbers is: "+ans);
				break;
			case 4:
				if(b==0)
				{
					System.out.println("Please, Enter a valid number");
				}
				else
				{
					ans=c.divide();
					System.out.println("Division of two numbers is: "+ans);
				}
				break;
		}
	}
}