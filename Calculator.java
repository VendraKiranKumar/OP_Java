/*write a java program which reads two integer values and perform the arithmetic operations such as addition, subtraction, multiplication, division and modulous by implimenting a simple calculator using switch statement. */
import java.util.*;
class Calculator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,res;
		a=sc.nextInt();
		b=sc.nextInt();
		char Choice=sc.next().charAt(0);
		switch(Choice)
		{
			case '+': res=a+b;
				  System.out.println(res);
				  break;
			case '-': res=a-b;
				  System.out.println(res);
				  break;
			case '*': res=a*b;
				  System.out.println(res);
				  break;
			case '/': res=a/b;
				  System.out.println(res);
				  break;
			case '%': res=a%b;
				  System.out.println(res);
				  break;
			default: System.out.println("Enter the Valid Operation");
		}
	}
}
				