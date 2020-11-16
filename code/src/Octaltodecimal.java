import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Octaltodecimal
{
	public static void main(String arg[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int octn,dn = 0,r,p = 0;
		System.out.print("Enter the Octal value = ");
		octn = Integer.parseInt(br.readLine());
		while (octn != 0)
		{
			r = octn % 10;
			dn = dn + r * (int)Math.pow(8, p);
			octn = octn / 10;
			p++;
		}
		System.out.println("-----------------------------------");
		System.out.println("Decimal value = "+dn);
	}
}