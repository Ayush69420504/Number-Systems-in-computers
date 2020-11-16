import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Octaltobinary
{
	public static void main(String arg[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long octn,octrem,bsp,rem,p1,bs = 0,p2 = 0;
		System.out.print("Enter the octal number = ");
		octn = Long.parseLong(br.readLine());
		while (octn != 0)
		{
			p1 = 0;
			bsp = 0;
			octrem = octn % 10;
			while (octrem != 0)
			{
				rem = octrem % 2;
				bsp = rem * (long)Math.pow(10,p1) + bsp;
				octrem = octrem / 2;
				p1++;
			}
			bs = bsp * (long)Math.pow(10,3 * p2) + bs;
			octn = octn / 10;
			p2++;
		}
		System.out.println("------------------------------");
		System.out.println("Binary value = "+bs);
	}
}