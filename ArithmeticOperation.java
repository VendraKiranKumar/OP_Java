//Write a java program which reads two integers from the keyboard and perform the arithmetic operations
import java.util.*;
class ArithmeticOperation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition of a and b" + (a+b));
		System.out.println("Subtraction of a and b" + (a-b));
		System.out.println("Multiplication of a and b" + (a*b));
		System.out.println("Quotient of a and b" + (a/b));
		System.out.println("Remainder of a and b" + (a%b));
	}
}
		