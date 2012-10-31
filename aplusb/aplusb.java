import java.util.*;

public class aplusb
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		String [] temp = (sc.nextLine()).split(" ");
		
		
		int a = Integer.parseInt(temp[0]);
		int b = Integer.parseInt(temp[1]);
		
		System.out.println(a+b);
	
	}

}