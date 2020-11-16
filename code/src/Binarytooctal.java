import java.io.*;
public class Binarytooctal
{
	public static void main(String arg[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long bn,bnoctrem,dmrem,dn,p1,octn = 0,p2 = 0;
		System.out.print("Enter the binary value = ");
		bn = Long.parseLong(br.readLine());
		while (bn != 0)
		{
			p1 = 0;
			dn = 0;
			bnoctrem = bn % 1000;
			while (bnoctrem != 0)
			{
				dmrem = bnoctrem % 10;
				dn = dmrem * (long)Math.pow(2,p1) + dn;
				bnoctrem = bnoctrem / 10;
				p1++;
			}
			bn = bn / 1000;
			octn = dn * (long)Math.pow(10,p2) + octn;
			p2++;
		}
		System.out.println("----------------------------------");
		System.out.println("Octal value = "+octn);
	}
}