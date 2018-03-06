import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		float  product, division,errorTerm_1,errorTerm_2,subtraction,modulus,pow,sum1, ub1, lb1,ub2,lb2,range,mean,result;
		float measureValue_1,measureValue_2,sum,y,z;
		String operator;
		String input_operator;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input mesaured value 1.");
		measureValue_1= keyboard.nextFloat();
		System.out.println("Input error value 1");
		errorTerm_1= keyboard.nextFloat();
		System.out.println("Value 1:   "+measureValue_1+ "\u00B1 "+errorTerm_1);
		System.out.println("Input measured value 2");
		measureValue_2= keyboard.nextFloat();
		System.out.println("Input error value 2");
		errorTerm_2= keyboard.nextFloat();
		System.out.println("Value 2:   "+measureValue_2+ "\u00B1 "+errorTerm_2);
System.out.println("select the operator");
operator=keyboard.next();
         if(operator.equals("+"))
         {
		 ub1= measureValue_1+errorTerm_1;
			lb1= measureValue_1-errorTerm_1;
			 ub2= measureValue_2+errorTerm_2;
				lb2= measureValue_2-errorTerm_2;
				y=ub1+ub2;
				z= lb1+lb2;
		range=(y+z)/2;
		mean=(y-z)/2;
		System.out.println("the value of the addition is"+range+" \u00B1 "+mean);
         }
         else   if(operator.equals("-"))
         {
		 ub1= measureValue_1+errorTerm_1;
			lb1= measureValue_1-errorTerm_1;
			 ub2= measureValue_2+errorTerm_2;
				lb2= measureValue_2-errorTerm_2;
				y=ub1-ub2;
				z= lb1-lb2;
		range=(y+z)/2;
		mean=(y-z)/2;
		System.out.println("the value of the addition is"+range+" \u00B1 "+mean);
         }
	}
		
		
	}


