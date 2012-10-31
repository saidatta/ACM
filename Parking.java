import java.util.*;
public class Parking
{
	public static void main(String [] args)
	{
		int t;
		Scanner sc = new Scanner(System.in);
		t = Integer.parseInt(sc.nextLine());
		while (t>0) {
		int n = Integer.parseInt(sc.next());	
		int min=100, max=0;
		for (int i=0;i<n;i++) {
			int x=0;
			x = Integer.parseInt(sc.next());
			if (x<min) min=x;
			if (x>max) max=x;
		}
		System.out.println((max-min)*2);
		t--;
	}
}
	
}
	