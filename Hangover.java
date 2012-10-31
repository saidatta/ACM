import java.util.*;
public class Hangover
{
	public static void main(String [] args)
	{
		double[] m = new double[300];
		m[0] = .5;
		int k =1;
		while(m[k-1] <5.2)
		{
			m[k] = m[k-1] +(1.0/(k+2));
			k++;
		}
		double c;
		Scanner sc = new Scanner(System.in);
		c=Double.parseDouble(sc.next());
		while(c>0)
		{
			
			int i = 0;
			while(c>m[i++]);
			System.out.println(i+" card(s)");c=Double.parseDouble(sc.next());
		
		}
		
	}

}