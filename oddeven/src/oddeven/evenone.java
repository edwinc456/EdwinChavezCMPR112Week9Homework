package oddeven;
import java.util.Scanner;

public class evenone {
	
		public static void main(String[]args)
		{
			
			int num2;
			
			eventwo number = new eventwo();
			 int computernum = number.randomnumber();
			Scanner input = new Scanner(System.in);
			
			System.out.println("Is the number odd or even? Press 1 for odd and 2 for even: ");
			num2 = input.nextInt();
			
			if( (num2 == 1 && computernum == 1) || (num2==1 && computernum == 3) || (num2==1 && computernum==5)|| (num2==1 && computernum==7) || (num2==1 && computernum == 9))
			{
				System.out.printf("You win! The number was %d" , computernum);
			}
			else if((num2 == 2 && computernum==2) ||(num2==2 && computernum==4)|| (num2 == 2 && computernum==6)||(num2==2 && computernum == 8) || (num2 ==2 && computernum==10))
			{
				System.out.printf("You win! The answer was %d", computernum);
			}
			else
			{
				System.out.printf("You lose! the number was %d", computernum);
			}
		}
		
	
	
}

// Good job
