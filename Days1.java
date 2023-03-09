import java.util.Scanner;
class Days {
	 public static void main(String[] args) {
	 	Scanner in=new Scanner(System.in);
	 	String str="sun";
	 	switch(str)
	 	{
	 	    case"sun":
	 		    System.out.println("Sunday");
	 		    break;

	 		case"mon":		
				System.out.println("Monday");
				break;

			case"tue":
				System.out.println("Thesday");
				break;
			
			default:
				System.out.println("Wrong choice");
			}
	}
}


