import java.util.*;
import java.text.*;


public class Financial
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		double [] s1 = new double [12];
		int i=0;
		while(i<12)
		{
			s1[i] = Double.parseDouble(sc.next());	
			i++;
		}
		double sum =0.0;
		for(int x=0;x<i;x++)
	{		sum += s1[x];
	}	
	double mean = sum/12.0;
	DecimalFormat df = new DecimalFormat("#.##");
	
		System.out.print("$"+(df.format(mean))+"\n");
	}
}