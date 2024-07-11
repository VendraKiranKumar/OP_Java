/*write a java program which reads the temperature either of these cases(C,F,K) and then print equivalent temperature in other two scales
CT=(FT-32.0f)*5/9
FT=(CT*9/5)+32.0f
KT=CT+273.03f */
import java.util.*;
class CFK_Temp_Conversion
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float Temp = sc.nextFloat();
		String Choice = sc.next();
		float CT = (Temp-32.0f)*5/9;
		float FT=(CT*9/5)+32.0f;
		float KT=CT+273.03f;
		switch(Choice)
		{
			case "CT":  System.out.println("FT: "+FT);
				    System.out.println("KT: "+KT);
				     break;
			case "FT":  System.out.println("CT: "+CT);
				    System.out.println("KT: "+KT);
				     break;
			case "KT":  System.out.println("CT: "+CT);
				    System.out.println("KT: "+KT);
				     break;
			default: System.out.println("Enter a valid Temperature");
		}
	}
}