import java.io.*;
public class Binarytodecimalfractional
{
	public static void main(String arg[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String bn;
		String list = "01";
		int sep,ongc,kv,x = 1,kn,p1 = 0,p2 = 1;
		char c;
		long sum1 = 0;
		double sum2 = 0,sum;
		System.out.print("Enter the fractional binary number = ");
		bn = br.readLine();
		sep = bn.indexOf('.');
		for (ongc = 0;ongc <= bn.length() - 1;ongc++)
		{
			if (ongc < sep)
			{
				kv = sep - x;
				c = bn.charAt(kv);
				kn = list.indexOf(c);
				sum1 = kn * (long)Math.pow(2, p1) + sum1;
				p1++;
				x++;
			}
			else if (ongc == sep)
			{
				//nothing to do here just left it blank
			}
			else if (ongc > sep)
			{
				c = bn.charAt(ongc);
				kn = list.indexOf(c);
				sum2 = kn * (1 / Math.pow(2, p2)) + sum2;
				p2++;
			}
		}
		sum = sum1 + sum2;
		System.out.println("-----------------------------------");
		System.out.println("Decimal value = "+sum);
	}
}