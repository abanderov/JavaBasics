import java.util.Scanner;
public class _4_TheSmallestOf3Numbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c, min;
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		input.close();
		min = a;
		if(min > b){
		    min = b;
		}
		if(min > c){
		    min = c;
		}
        System.out.println(min);
	}
}
