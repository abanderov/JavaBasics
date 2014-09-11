import java.util.Scanner;
public class _9_PointsInsideHouse {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] points = new double[2];
		for (int i = 0; i < points.length; i++) {
			points[i] = input.nextDouble();
		}
		input.close();
		// [0] = x , [1] = y;
		//  when checking positionAccAC:
		// -1.0 - on the right side of AC 
		//  1.0 - on the left side of AC 
		//  when checking positionAccBC:
		// -1.0 - on the right side of BC 
		//  1.0 - on the left side of BC 
		//  the same is for AB
		//  when 0.0, the point is on the line
		
		double[] coordA = new double[]{8.5, 12.5};
		double[] coordB = new double[]{8.5, 22.5};
		double[] coordC = new double[]{3.5, 17.5};
		double[] inputPoint = new double[]{points[1], points[0]};
		double positionAccAB = Math.signum( ((coordB[0]-coordA[0])*(inputPoint[1]-coordA[1])) - ((coordB[1]-coordA[1])*(inputPoint[0]-coordA[0])) );
		double positionAccAC = Math.signum( ((coordC[0]-coordA[0])*(inputPoint[1]-coordA[1])) - ((coordC[1]-coordA[1])*(inputPoint[0]-coordA[0])) );
		double positionAccBC = Math.signum( ((coordC[0]-coordB[0])*(inputPoint[1]-coordB[1])) - ((coordC[1]-coordB[1])*(inputPoint[0]-coordB[0])) );
		if (positionAccAB == 1.0 && positionAccAC == -1.0 && positionAccBC == 1.0) {
			System.out.println("Inside");
		}
		else if(positionAccAB == 0.0 || positionAccAC == 0.0 || positionAccBC == 0.0){
			System.out.println("Inside");
		}
		else if (points[0] >= 12.5 && points[1] >= 8.5 && points[0] <= 17.5 && points[1] <= 13.5) {
			System.out.println("Inside");
		}
		else if(points[0] >= 20 && points[1] >= 6 && points[0] <= 22.5 && points[1] <= 13.5){
			System.out.println("Inside");
		}
		else if(points[0] > 17.5 && points[1] > 8.5 && points[0] < 20 && points[1] < 13.5 ){
			System.out.println("Outside");
		}
		else {
			System.out.println("Outside");
		}
	}

}
