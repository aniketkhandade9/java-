import java.util.Scanner;
class Ifpro {
	 public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter any Number:");
			int n=in.nextInt();
			if(n%2==0) {
				System.out.print(n+" is Even");
			}
			else{
				System.out.print(n+" is odd");
			}
	}
}


