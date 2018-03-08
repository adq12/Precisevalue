import java.util.Scanner;

public class ProDivcalc {
	public static void main(String[] args) {
		float  product, division,errorTerm_1,errorTerm_2,ub1, lb1,ub2,lb2,range,mean,result,product1,division1;//declaration of variables.
		float measureValue_1,measureValue_2,sum,y,z;
		String operator;
		String input_operator;
		Scanner keyboard = new Scanner(System.in);       //Scanner function is used in which its object is declared for multiple input
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
System.out.println("select the operator from *,/");             //Select operator from the given symbols
operator=keyboard.next();
         
        
           if(operator.equals("*"))         //Product of the two measured value and error value
         {
        	 product1=measureValue_1*measureValue_2 ;
        	 product= (((errorTerm_1/measureValue_1)+(errorTerm_2/Math.abs(measureValue_2)))*(Math.abs(product1)));
        System.out.println("The product of the the value are"+product1+" \u00B1"+product);	 
		
         }
         else   if(operator.equals("/"))        //Quotient of the two measured value and error value
         {
        	 division1=measureValue_1/measureValue_2 ;
        	 division= (((errorTerm_1/Math.abs(measureValue_1))+(errorTerm_2/Math.abs(measureValue_2)))*(Math.abs(division1)));
        System.out.println("The division of the value are"+division1+" \u00B1"+division);	
         }
	
         else
         {
        	 System.out.println("wrong input");
         }
	}
}
