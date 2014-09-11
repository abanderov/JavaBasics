import java.util.Scanner;

public class _1_RectangleArea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rectArea;
		int[] numbers = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		rectArea = numbers[0] * numbers[1];
		input.close();
		System.out.println(rectArea);
	}
}
