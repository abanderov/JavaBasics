import java.util.Scanner;
public class _8_CountEqualBitPairs {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		String binaryStr = Integer.toBinaryString(number);
		char[] charArray = binaryStr.toCharArray();
		int countEquals = 0;
		for (int i = 1; i < charArray.length; i++) {
			if (charArray[i] == charArray[i-1]) {
				countEquals++;
			}
		}
		System.out.println(countEquals);
		
	}
}
