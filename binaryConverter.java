package binary;

public class binaryConverter {
	public static String binaryToDecimal (String binNum) {
		long num = 0;
		for (int i=0; i<binNum.length(); i++) {
			int character = Integer.valueOf (binNum.substring(i,i+1));
			long exp = (long) Math.pow(2, binNum.length()-i-1);	
			num += character*exp;
		}
		String number = Long.toString(num);
		return number;
	}
	
	public static String decimalToBinary (String decNum) {
		String bin = "";
		long num = Long.valueOf(decNum);
		while (num>0) {
			long j = num%2;
			num = num/2;
			String single = Long.toString(j);
			bin = single + bin;
		}
		return bin;
	}
}
