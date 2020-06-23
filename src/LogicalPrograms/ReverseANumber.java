package LogicalPrograms;

public class ReverseANumber {

	public static void main(String[] args) {

		int num = 1234; ///4321
		int rev  = 0;
		
		while(num !=0){
			int n = num % 10;//getting remainder
			rev = rev * 10 + n; //43 
			num = num/10;	// getting the quotient	 	
		}
		
		
		System.out.println("reversed number is : " + rev);
		
		
	}

}
