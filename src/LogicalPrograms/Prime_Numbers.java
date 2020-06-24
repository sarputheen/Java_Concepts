package LogicalPrograms;

public class Prime_Numbers {

	public static void main (String[] args)
	   {		
	       String  primeNumbers = "";

	       for (int i = 1; i <= 100; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(int num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
	       // the counter value is always 2 since the prime numbers can be divided by 1 and itself
	          
		  if (counter ==2) 
		  {
		     //Appended the Prime number to the String
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to 100 are :");
	       System.out.println(primeNumbers);
	   }
}
