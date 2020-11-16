import java.io.*;
public class Hexdecimaltooctal
{
	public static void main(String arg[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hexn;
		String list = "0123456789ABCDEF";
		char c;
		long ongc,dv,rem,dn,p1,bn = 0;
		long bnoctrem,dmrem,dnoct = 0,p2,octn = 0,p3 = 0;
		System.out.print("Enter the Hexadecimal number = ");
		hexn = br.readLine();
		hexn = hexn.toUpperCase();
		for (ongc = 0;ongc <= hexn.length() - 1;ongc++)
		{
			p1 = 0;
			dn = 0;
			c = hexn.charAt((int)ongc);
			dv = list.indexOf(c);
			while (dv != 0)
			{
				rem = dv % 2;
				dn = rem * (long)Math.pow(10,p1) + dn;
				dv = dv / 2;
				p1++;
			}
			bn = bn * (long)Math.pow(10,4) + dn;
		}
		while (bn != 0)
		{
			p2 = 0;
			dnoct = 0;
			bnoctrem = bn % 1000;
			while (bnoctrem != 0)
			{
				dmrem = bnoctrem % 10;
				dnoct = dmrem * (long)Math.pow(2,p2) + dnoct;
				bnoctrem = bnoctrem / 10;
				p2++;
			}
			bn = bn / 1000;
			octn = dnoct * (long)Math.pow(10,p3) + octn;
			p3++;
		}
		System.out.println("----------------------------------");
		System.out.println("Octal value = "+octn);
	}
}