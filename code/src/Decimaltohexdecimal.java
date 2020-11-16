import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Decimaltohexdecimal
{
	public static void main(String arg[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String list = "0123456789ABCDEF",hexdm = "";
		int dm,r;
		System.out.print("Enter the decimal number = ");
		dm = Integer.parseInt(br.readLine());
		while (dm != 0)
		{
			r = dm % 16;
			hexdm = list.charAt(r) + hexdm;
			dm = dm / 16;
		}
		System.out.println("------------------------------");
		System.out.println("Hexa decimal value = "+hexdm);
	}
}