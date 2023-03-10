import java.util.Scanner; 
class LeapYear
   {
	 public static void main(String[] args)
	  {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter year:");
        int year=sc.nextInt();
        if (year%4==0) 
        {

        	System.out.println(" This is leap year:");
        }
        else{
        	System.out.println("This is not year: ");
        }
   }

}