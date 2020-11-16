import java.io.*;
public class Binarytohexdecimal
{
	public static void main(String arg[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long bn,bnp,dmp,p,dn;
		char hexchar;
		String list = "0123456789ABCDEF";
		String hexnum = "";
		System.out.print("Enter the binary value = ");
		bn = Long.parseLong(br.readLine());
		while (bn != 0)
		{
			dn = 0;
			p = 0;
			bnp = bn % 10000;
			while (bnp != 0)
			{
				dmp = bnp % 10;
				dn = dmp * (long)Math.pow(2,p) + dn;
				bnp = bnp / 10;
				p++;
			}
			bn = bn / 10000;
			hexchar = list.charAt((int)dn);
			hexnum = hexchar + hexnum;
		}
		System.out.println("------------------------------------");
		System.out.println("Hexa decimal value = "+hexnum);
	}
}