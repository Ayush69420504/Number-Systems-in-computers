import java.io.*;
public class Octaltohexdecimal
{
	public static void main(String arg[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long octn,octrem,bsp,rem,p1,p2 = 0,bs = 0;
		long bnp,dmp,p,dn;
		char hexchar;
		String list = "0123456789ABCDEF";
		String hexnum = "";
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
		while (bs != 0)
		{
			dn = 0;
			p = 0;
			bnp = bs % 10000;
			while (bnp != 0)
			{
				dmp = bnp % 10;
				dn = dmp * (long)Math.pow(2,p) + dn;
				bnp = bnp / 10;
				p++;
			}
			bs = bs / 10000;
			hexchar = list.charAt((int)dn);
			hexnum = hexchar + hexnum;
		}
		System.out.println("---------------------------------");
		System.out.println("Hexa decimal value = "+hexnum);
	}
}