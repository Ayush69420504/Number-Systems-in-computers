import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Decimaltobinary
{
	public static void main(String arg[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n,ans = 0,p = 0;
		System.out.print("Enter the decimal number = ");
		n = Long.parseLong(br.readLine());
		while (n != 0)
		{
			ans = (n % 2) * (long)Math.pow(10, p) + ans;
			n = n / 2;
			p++;
		}
		System.out.println("-----------------------------");
		System.out.println("Binary value = "+ans);
	}
}