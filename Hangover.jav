import java.util.*;
public class Hangover
{
	public static void main(String [] args)
	{
		double[] m = new double[277];
		m[0] = .5;
		int k =1;
		while(m[k-1] <5.2)
			m[k++] = m[k-1] +(1.0/(k+2));
		double c;
		Scanner sc = new Scanner(System.in);
		c=Double.parseDouble(sc.next());
		while(c>0)
		{
			if(c==0.00)
				break;
			int i = 0;
			while(c>m[i++]);
			System.out.println(i+" card(s)\n");
			c=Double.parseDouble(sc.next());
		}
		
	}

}