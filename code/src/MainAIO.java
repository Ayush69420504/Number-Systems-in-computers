import java.io.*;
public class MainAIO
{
	public static void main(String arg[])throws Exception
	{
		System.out.println("ASCII Number formats of a computer system converter \nWorks for all formats i.e = Binary, Decimal, Hexadecimal and Octal.");
		System.out.println("Build no. = 1.00");
		System.out.println("Author : Anonymous \nCodename : Prodigy");
		System.out.println("----------------------------------------------");
		MainAIO.exe(arg);
	}	
	public static void exe(String arg[])throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int mch;
		char ch;
		System.out.println("Decimal to Binary (1) \nBinary to Decimal (2) \nDecimal to Octal (3) \nOctal to Decimal (4) \nDecimal to Hexadecimal (5) \nHexadecimal to Decimal (6) \nBinary to Octal (7) \nOctal to Binary (8) \nBinary to Hexadecimal (9) \nHexadecimal to Binary (10) \nOctal to Hexadecimal (11) \nHexadecimal to Octal (12) \nFractional Binary to Decimal (13) \nFractional Decimal to binary (14)");
		System.out.print(": ");
		mch = Integer.parseInt(br.readLine());
		System.out.println("----------------------------------------------");
		if (mch == 1)
		{
			Decimaltobinary.main(arg);
		}
		else if (mch == 2)
		{
			Binarytodecimal.main(arg);
		}
		else if (mch == 3)
		{
			Decimaltooctal.main(arg);
		}
		else if (mch == 4)
		{
			Octaltodecimal.main(arg);
		}
		else if (mch == 5)
		{
			Decimaltohexdecimal.main(arg);
		}
		else if (mch == 6)
		{
			Hexdecimaltodecimal.main(arg);
		}
		else if (mch == 7)
		{
			Binarytooctal.main(arg);
		}
		else if (mch == 8)
		{
			Octaltobinary.main(arg);
		}
		else if (mch == 9)
		{
			Binarytohexdecimal.main(arg);
		}
		else if (mch == 10)
		{
			Hexdecimaltobinary.main(arg);
		}
		else if (mch == 11)
		{
			Octaltohexdecimal.main(arg);
		}
		else if (mch == 12)
		{
			Hexdecimaltooctal.main(arg);
		}
		else if (mch == 13)
		{
			Binarytodecimalfractional.main(arg);
		}
		else if (mch == 14)
		{
			Decimaltobinaryfloatingpoint.main(arg);
		}
		if (mch == 1 || mch == 2 || mch == 3 || mch == 4 || mch == 5 || mch == 6 || mch == 7 || mch == 8 || mch == 9 || mch == 10 || mch == 11 || mch == 12 || mch == 13 || mch == 14)
		{
			System.out.println("-------------------------------------------");
			System.out.println("Do you want to continue : (y/n) ");
			System.out.print(": ");
			ch = (char)br.read();
			if (ch == 'y')
			{
				System.out.println("-------------------------------");
				MainAIO.exe(arg);
			}
			else
			{
				System.out.println("-----------------------------");
				System.out.println("Terminated, Thank you");
			}
		}
		else 
		{
			System.out.println("Invalid choice, select choice identifiers from the list");
			System.out.println("------------------------------------------------------------------");
			System.out.println("Do you want to continue : (y/n) ");
			System.out.print(": ");
			ch = (char)br.read();
			System.out.println("-------------------------------------");
			if (ch == 'y')
			{
				MainAIO.exe(arg);
			}
			else
			{
				System.out.println("Terminated, Thank you");
			}
		}
	}
}