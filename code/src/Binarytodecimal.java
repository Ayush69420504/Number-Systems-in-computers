import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Binarytodecimal
{
	public static void main(String arg[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long bn,dm = 0,r,p = 0;
		System.out.print("Enter the binary number = ");
		bn = Long.parseLong(br.readLine());
		while (bn != 0)
		{
			r = bn % 10;
			dm = dm + r * (long)Math.pow(2, p);
			bn = bn / 10;
			p++;
		}
		System.out.println("-----------------------------");
		System.out.println("Decimal value = "+dm);
	}
}