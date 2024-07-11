//write a java program to find the different geometrical shapes circle, square, rectangle, //triangle, by passing figure code as choice.

import java.util.*;
class Geometricalshapes
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("********AREA OF GEOMETRICAL SHAPES*********");
		System.out.println("120:Circle");
		System.out.println("124:Square");
		System.out.println("116:Rectangle");
		System.out.println("112:Triangle");
		float area,radius,side,length,breadth,base,height;
		System.out.println("Enter the figure code:");
		int fig_code=sc.nextInt();
		switch(fig_code)
		{
			case 120: System.out.println("Enter the Radius:");
				  radius=sc.nextFloat();
				  area=3.142F*radius*radius;
				  System.out.println("Area of Circle: " + area);
				  break;
			case 124: System.out.println("Enter the Side:");
				  side=sc.nextFloat();
				  area=side*side;
				  System.out.println("Area of Square: "+area);
				  break;
			case 116: System.out.println("Enter the length and breadth:");
				  length=sc.nextFloat();
				  breadth=sc.nextFloat();
				  area=length*breadth;
				  System.out.println("Area of Rectangle: " + area);
				  break;
			case 112: System.out.println("Enter the base and height: ");
				  base=sc.nextFloat();
				  height=sc.nextFloat();
				  area=0.5f*base*height;
				  System.out.println("Area of Triamgle: " + area);
				  break;
			default: System.out.println("Invalid figure code");
		}
	}
}

			
				  
		