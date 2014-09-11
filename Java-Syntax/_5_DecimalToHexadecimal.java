import java.util.Scanner;
public class _5_DecimalToHexadecimal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		String changedNum = Integer.toHexString(number);
		System.out.println(changedNum);	
	}
}
