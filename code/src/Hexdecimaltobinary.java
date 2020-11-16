import java.io.*;
public class Hexdecimaltobinary
{
	public static void main(String arg[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hexn;
		String list = "0123456789ABCDEF";
		char c;
		long ongc,dv,rem,dn,p1,bn = 0;
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
		System.out.println("--------------------------------------");
		System.out.println("Binary value = "+bn);
	}
}