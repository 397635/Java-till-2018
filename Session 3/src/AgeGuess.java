//Age Guessing Game
import java.util.Scanner;

public class AgeGuess 
{
	public static void main(String[] args)
	{
	
	System.out.println("WE HAVE THE POWER TO GUESS YOUR AGE IN JUST 3 QUESTIONS!! ");
		//introduction
	System.out.print("\nChoose a number from 1 - 10: ");
	Scanner scanner = new Scanner(System.in);
	int x = scanner.nextInt();
		//print question and obtain x as the answer
		int y = x * 2;
		int n = y +5;
		int m = n * 50;
			//perform series of operations
		int a = 1;
		int b =2;
			//introduce 2 new variables -- 1 as Yes and 2 as No
	System.out.print("Has your birthday happened already for this year? Answer with 1 (Yes) or 2(No). " );
	Scanner scanner1 = new Scanner(System.in);
	int c = scanner1.nextInt();
		//ask next question and obtain integer a or b as answer
	if (c == a) 
	{
		 int d = m + 1768;
		 
		 System.out.print("When is your birth year? ");
		 Scanner scanner2 = new Scanner(System.in);
		 int e = scanner2.nextInt();
		
		 int f = d - e;
		int j = f/100;
		int k = f%100;
		
		System.out.print("The number you guessed was " +j);
		
		System.out.print("\nYour age is "+ k);	
		
		//if Yes is given as answer add the previous variable by 1768 and continue by asking last question. 
		//finally subtract the 2 numbers and obtain a number in which the 1st number was the number you input and the next number(s) is the age of the person.
		//to separate these two values divide by 100 to get 1st value, the % 100 to get the remainder
		//now it prints what number you started with and you AGE!!!!
				
		
		
	}
	
	else
	{
		int g = m + 1767;
		
		System.out.print("When is your birth year? ");
		Scanner scanner2 = new Scanner(System.in);
		int h = scanner2.nextInt();
		
		int i = g - h;

		int l = i/100;
		int p = i % 100;
		

		System.out.print("The number you guessed was " + l);
		
		System.out.print("\nYour age is "+ p);	
		
		//if No is given as the answer --same idea in this else statement however instead of 1768, the number being added is 1767 
	}
	
	}
}