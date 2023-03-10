package binary;
import java.util.Scanner;

public class binaryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
		System.out.println ("Enter y if converting from binary to decimal, enter n if converting from decimal to binary: ");
		
		String typeOfConversion = kb.nextLine();
		
		System.out.println ("Enter number to convert: ");
		String num = kb.nextLine();
		
		if (typeOfConversion.equals("y")) {
			System.out.println ("Converted Number: " + binaryConverter.binaryToDecimal (num));
		}
		else {
			System.out.println ("Converted Number: " + binaryConverter.decimalToBinary (num));
		}
	}

}
