package LogicalPrograms;

public class Prime_Numbers {
	
	
	// using while loop
	
	public void primeNumbers_using_while() {
		int ct=0,n=0,i=1,j=1;  
		while(n<25)  
		{  
		j=1;  
		ct=0;  
		while(j<=i)  
		{  
		if(i%j==0)  
		ct++;  
		j++;   
		}  
		if(ct==2)  
		{  
		System.out.printf("%d ",i);  
		n++;  
		}  
		i++;  
		}    
	}
	
	// using while for
	
		public void primeNumbers_using_for() {
			
			int i =0;
		       int num =0;
		       //Empty String
		       String  primeNumbers = "";

		       for (i = 1; i <= 100; i++)         
		       { 		  	  
		          int counter=0; 	  
		          for(num =i; num>=1; num--)
			  {
		             if(i%num==0)
			     {
		 		counter = counter + 1;
			     }
			  }
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
