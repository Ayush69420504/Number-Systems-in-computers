import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Decimaltooctal
{
	public static void main(String arg[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int octn = 0,dn,r,p = 0;
		System.out.print("Enter the Decimal value = ");
		dn = Integer.parseInt(br.readLine());
		while (dn != 0)
		{
			r = dn % 8;
			octn = r * (int)Math.pow(10, p) + octn;
			dn = dn / 8;
			p++;
		}
		System.out.println("----------------------------");
		System.out.println("Octal value = "+octn);
	}
}