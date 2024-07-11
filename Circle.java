//write a java program to find the area and circumference of a circle 
import java.util.*;
class Circle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float r=sc.nextFloat();
		float area = 3.14f*r*r;
		float circumference = 2*3.14f*r;
		System.out.println("Area of the circle is " + area);
		System.out.println("Circumference of the circle is " + circumference);
	}
}