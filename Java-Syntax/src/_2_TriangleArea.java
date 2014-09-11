import java.util.Scanner;
public class _2_TriangleArea {
	public static void main(String[] args) {
		int triangleArea;
		Scanner input = new Scanner(System.in);
		int[] coordA = new int[2];
		for (int i = 0; i < coordA.length; i++) {
			coordA[i] = input.nextInt();
		}
		int[] coordB = new int[2];
		for (int i = 0; i < coordB.length; i++) {
			coordB[i] = input.nextInt();
		}
		int[] coordC = new int[2];
		for (int i = 0; i < coordC.length; i++) {
			coordC[i] = input.nextInt();
		}
		input.close();
		// [0] = x, [1] = y
		int checkAB = (Math.abs(coordA[1]) - Math.abs(coordB[1])) / (Math.abs(coordA[0]) - Math.abs(coordB[0]));
		int checkAC = (Math.abs(coordA[1]) - Math.abs(coordC[1])) / (Math.abs(coordA[0]) - Math.abs(coordB[0]));
		if (checkAB != checkAC) {
			triangleArea = ((coordA[0] * (coordB[1] - coordC[1])) + (coordB[0] * (coordC[1] - coordA[1])) + (coordC[0] * (coordA[1] - coordB[1]))) / 2;
		}
		else {
			triangleArea = 0;
		}
		System.out.println(Math.abs(triangleArea));
	}
}
