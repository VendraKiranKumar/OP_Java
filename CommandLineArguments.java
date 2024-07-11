import java.io.*;
class CommandLineArguments
{
	public static void main(String args[])
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println(a+b);
		
		String h="10";
		String j="20";
		System.out.println(h+j);
	}
}