import java.util.*;
import java.math.*;

public class Exponentiation
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		
		String [] t = (sc.nextLine()).split(" ");
	
		
		BigDecimal r1 = new BigDecimal(t[0]);
		
		int e = Integer.parseInt(t[1]);
		
		System.out.println(r1.pow(e)+"\n");
	
	}
}