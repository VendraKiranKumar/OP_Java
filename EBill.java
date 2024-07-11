/*write a java program to calculate electicity bill by reading the previous and current meter reading the charges are as follows
Number of Units: 0 - 100 || Rate in Rs: 0.80
Number of Units: 101 - 200 || Rate in Rs: 1.2
Number of Units: 201 - 300 || Rate in Rs: 1.5
Number of Units: >300 || Rate in Rs: 1.8 */
import java.util.*;
class EBill
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int TotalUnits,CurrentUnits,PreviousUnits;
		float Ebill;
		CurrentUnits=sc.nextInt();
		PreviousUnits=sc.nextInt();
		TotalUnits=CurrentUnits - PreviousUnits;
		System.out.println(TotalUnits);
		if(TotalUnits>0 && TotalUnits<=100)
			Ebill = TotalUnits * 0.8f;
		else if(TotalUnits>101 && TotalUnits<=200)
			Ebill = 80 + (TotalUnits - 100)*1.2f;
		else if(TotalUnits>201 && TotalUnits<=300)
			Ebill = 200 + (TotalUnits - 200)*1.5f;
		else
			Ebill = 350 + (TotalUnits - 300)*1.8f;
		System.out.println("Electricity Bill: " + Ebill);
	}
}
			
		
		