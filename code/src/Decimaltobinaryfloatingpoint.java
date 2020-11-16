import java.io.*;
public class Decimaltobinaryfloatingpoint
{
	public static void main(String arg[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double n,fp,srcval,p2 = 1,bn,fbp = 0;
		int nfp,ongc,op,p = 0,mc;
		long dp = 0;
		System.out.print("Enter the fractional decimal value = ");
		n = Double.parseDouble(br.readLine());
		System.out.println("-------------------------------------------");
		System.out.print("Enter the maximum amount of digits to be retained = ");
		mc = Integer.parseInt(br.readLine());
		nfp = (int)n;
		fp = n - (double)nfp;
		while (nfp != 0)
		{
			dp = (nfp % 2) * (long)Math.pow(10, p) + dp;
			nfp = nfp / 2;
			p++;
		}
		for (ongc = 0;ongc <= mc - 1;ongc++)
		{
			srcval = fp * 2;
			op = (int)srcval;
			if (srcval > 1)
			{
				fp = srcval - (double)op;
			}
			else
			{
				fp = srcval;
			}
			fbp = (double)op / Math.pow(10, p2) + fbp;
			p2++;
		}
		bn = dp + fbp;
		System.out.println("-----------------------------------");
		System.out.println("Binary value = "+bn);
	}
}