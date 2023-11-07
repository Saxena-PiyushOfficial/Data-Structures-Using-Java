package recursiveFunction;

public class RecursiveFunctions {
	
   public static int sumOfDigits(int num)
   {
	   if(num!=0)
	   {
		   return num%10+sumOfDigits(num/10);
	   }
	   return 0;
   }
   public static int squareOfNumber(int num,int accum)
   {
		   if(accum==0)
			   return 1;
		   
		   return squareOfNumber(num,accum-1)*num;   
   }
   public static int factorialOfNumber(int num)
   {
	       if(num==0)
	    	   return 1;

		   return num*factorialOfNumber(num-1);
   }
   public static int isPalindrome(int num,int temp)
   {
	   if(num!=0)
	   {
		   return isPalindrome(num/10, temp=num%10+(temp*10)) ; 
	   }
	   return temp;   
   }
}
