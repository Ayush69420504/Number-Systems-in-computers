import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Hexdecimaltodecimal
{
	public static void main(String arg[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String list = "0123456789ABCDEF";
		String hexdm;
		int ongc,dv,p,dn = 0;
		System.out.print("Enter the Hexadecimal number = ");
		hexdm = br.readLine();
		hexdm = hexdm.toUpperCase();
		p = hexdm.length() - 1;
		for (ongc = 0;ongc <= hexdm.length() - 1;ongc++)
		{
			char c = hexdm.charAt(ongc);
			dv = list.indexOf(c);
			dn = (int)Math.pow(16, p) * dv + dn;
			p--;
		}
		System.out.println("Decimal value = "+dn);
		
	}
}