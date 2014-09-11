import java.util.Scanner;
public class _3_PointsInsideAFigure {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] points = new double[2];
		for (int i = 0; i < points.length; i++) {
			points[i] = input.nextDouble();
		}
		input.close();
		// [0] = x , [1] = y;
		if (points[0] >= 12.5 && points[1] >= 6 && points[0] <= 17.5 && points[1] <= 13.5) {
			System.out.println("Inside");
		}
		else if(points[0] > 17.5 && points[1] <= 8.5 && points[0] < 20){
			System.out.println("Inside");
		}
		else if(points[0] > 17.5 && points[1] > 8.5 && points[0] < 20 && points[1] < 13.5 ){
			System.out.println("Outside");
		}
		else if(points[0] >= 20 && points[1] >= 6 && points[0] <= 22.5 && points[1] <= 13.5){
			System.out.println("Inside");
		}
		else {
			System.out.println("Outside");
		}
	}
}
