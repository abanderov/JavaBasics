import java.util.Scanner;
public class _7_CountOfBits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		int bitOneCount = 0;
		 while (number > 0)
         {
             number = number & (number - 1);
             bitOneCount++;
         }
		 System.out.println(bitOneCount);
	}
}
