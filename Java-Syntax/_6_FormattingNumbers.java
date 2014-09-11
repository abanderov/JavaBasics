import java.util.Scanner;
import java.text.*;
import org.apache.commons.lang3.StringUtils;
public class _6_FormattingNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int numberA = input.nextInt();
        double numberB = input.nextDouble();
        double numberC = input.nextDouble();
        input.close();
        if (numberA >= 500 && numberA <= 0)
        {
        	System.out.println("No valid number entered!");
        }
        String numberADisplay = Integer.toHexString(numberA);
        String binaryString = Integer.toBinaryString(numberA);
        int numberIntB = (int) numberB;
        int numberIntC = (int) numberC;
        String stringB = String.valueOf(numberIntB);
        String stringC = String.valueOf(numberIntC);
        System.out.printf("|%s|%s|", StringUtils.rightPad(numberADisplay, 10), StringUtils.leftPad(binaryString, 10, "0"));
        if (StringUtils.isNumeric(stringB))
        {
        	DecimalFormat myFormatter = new DecimalFormat("0.00");
        	String str = myFormatter.format(numberB);
  	      	System.out.printf("%s|", StringUtils.leftPad(str, 10));   
        }
        else
        {
        	DecimalFormat myFormatter = new DecimalFormat("0.00");
        	String str = myFormatter.format(numberB);
  	      	System.out.printf("%s|", StringUtils.leftPad(str, 10));  
        }
        if (StringUtils.isNumeric(stringC))
       {    	
        	DecimalFormat myFormatter = new DecimalFormat("0.000");
        	String str = myFormatter.format(numberC);
        	System.out.printf("%-10s|", str); 
        }
        else
       {
        	DecimalFormat myFormatter = new DecimalFormat("0.000");
        	String str = myFormatter.format(numberC);
        	System.out.printf("%-10s|", str); 
       }
       
	}
}
