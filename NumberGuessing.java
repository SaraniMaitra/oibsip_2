import java.util.Scanner;
import java.util.Random;
public class NumberGuessing
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int numberofattempts = 1,n,totalattempts = 5,points;
		points = totalattempts;
		Random randomNum = new Random();
		while(numberofattempts <= totalattempts)
		{
			System.out.println("Enter a number: ");
			n = sc.nextInt();
			numberofattempts++;
			int showMe = randomNum.nextInt(100);
			
			if(n == showMe)
			{
				System.out.println("The Guess is correct");
				break;
			}
			else if(n < showMe)
			{
				System.out.println("Number you entered is less than random number");
			}
			else
			{
				System.out.println("Number you entered is greater than random number");
			}
			System.out.println("The Random Number is: "+showMe);
			points--;
		}
		System.out.println("The Score is: "+points);	
	}
}