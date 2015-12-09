
import java.util.Scanner;

public class IfAndBoolean {
		public static void main (String[] args) {
			Scanner input = new Scanner(System.in);
					//normally name, newScan
			
			int num1 = 4;
			
			boolean lessThanFive=false; 
			
			//through this is it evaluated to being true.
			if (num1 <= 5) {
				System.out.println("num1 is 5 or less");
				lessThanFive = true;
			}
			else {
				System.out.println("num 1 is greater than 5");
			}
			
			//Since num1 = 4 & its less than five, then its true, so the code below
			//Will run aswell.
			//If num1 =6 or more, then it will continue to be false bc of its stated above
			//to be initially false
			if (lessThanFive) {
				System.out.println("OMG");
			}
		}

}
