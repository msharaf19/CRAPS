import java.util.Scanner;

public class CrapsMain {

	public static void main(String[] args) 
	{
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		String one = " _ _ _\n|     |\n|  *  |\n|     |\n - - -";
		String two = " _ _ _\n|*    |\n|     |\n|    *|\n - - -";
		String three = " _ _ _\n|*    |\n|  *  |\n|    *|\n - - -";
		String four = " _ _ _\n|*   *|\n|     |\n|*   *|\n - - -";
		String five = " _ _ _\n|*   *|\n|  *  |\n|*   *|\n - - -";
		String six = " _ _ _\n|*   *|\n|*   *|\n|*   *|\n - - -";
		boolean keepGoing = true;
		
		System.out.println(six);
		while (keepGoing) 
		{
			int roll1 = die1.roll();
			int roll2 = die2.roll();
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Welcome to CRAPS!! Please press enter to continue...");
			in.nextLine();
			
			System.out.println("Please press enter to roll the dice");
			in.nextLine();
			
			int point = roll1 + roll2;
			
	
			System.out.println("Your roll is " + point );
			if ( roll1 == 1) 
			{
				System.out.println(one);
			}
			if ( roll1 == 2) 
			{
				System.out.println(two);
			}
			if ( roll1 == 3) 
			{
				System.out.println(three);
			}
			if ( roll1 == 4) 
			{
				System.out.println(four);
			}
			if (roll1 == 5) 
			{
				System.out.println(five);
			}
			if ( roll1 == 6) 
			{
				System.out.println(six);
			}
			
			if ( roll2 == 1) 
			{
				System.out.println(one);
			}
			if ( roll2 == 2) 
			{
				System.out.println(two);
			}
			if ( roll2 == 3) 
			{
				System.out.println(three);
			}
			if ( roll2 == 4) 
			{
				System.out.println(four);
			}
			if (roll2 == 5) 
			{
				System.out.println(five);
			}
			if ( roll2 == 6) 
			{
				System.out.println(six);
			}
			
			
			if (point == 7 || point == 11) 
			{
				System.out.println("You Win!!!");
			}
			
			else if (point == 2 || point == 12) 
			{
				System.out.println("You lose!");
			}
			
			else 
			{
				System.out.println("Please press enter to roll the dice");
				in.nextLine();
				
				int roll3 = die1.roll();
				int roll4 = die2.roll();
				
					
				int sum = roll3 + roll4;
				
				System.out.println("You rolled a " + sum);
				if ( roll3 == 1) 
				{
					System.out.println(one);
				}
				if ( roll3 == 2) 
				{
					System.out.println(two);
				}
				if ( roll3 == 3) 
				{
					System.out.println(three);
				}
				if ( roll3 == 4) 
				{
					System.out.println(four);
				}
				if (roll3 == 5) 
				{
					System.out.println(five);
				}
				if ( roll3 == 6) 
				{
					System.out.println(six);
				}
				
				if ( roll4 == 1) 
				{
					System.out.println(one);
				}
				if ( roll4 == 2) 
				{
					System.out.println(two);
				}
				if ( roll4 == 3) 
				{
					System.out.println(three);
				}
				if ( roll4 == 4) 
				{
					System.out.println(four);
				}
				if (roll4 == 5) 
				{
					System.out.println(five);
				}
				if ( roll4 == 6) 
				{
					System.out.println(six);
				}
				
				
				while ( sum != point && sum != 7) 
				{
					System.out.println("Please press enter to roll the dice");
					in.nextLine();
					
					roll3 = die1.roll();
					roll4 = die2.roll();
					
					sum = roll3 + roll4;
					
					
					System.out.println("Your roll is " + sum);
					if ( roll3 == 1) 
					{
						System.out.println(one);
					}
					if ( roll3 == 2) 
					{
						System.out.println(two);
					}
					if ( roll3 == 3) 
					{
						System.out.println(three);
					}
					if ( roll3 == 4) 
					{
						System.out.println(four);
					}
					if (roll3 == 5) 
					{
						System.out.println(five);
					}
					if ( roll3 == 6) 
					{
						System.out.println(six);
					}
					
					if ( roll4 == 1) 
					{
						System.out.println(one);
					}
					if ( roll4 == 2) 
					{
						System.out.println(two);
					}
					if ( roll4 == 3) 
					{
						System.out.println(three);
					}
					if ( roll4 == 4) 
					{
						System.out.println(four);
					}
					if (roll4 == 5) 
					{
						System.out.println(five);
					}
					if ( roll4 == 6) 
					{
						System.out.println(six);
					}
					
				}
				
				if ( sum == point ) 
				{
					System.out.println("You win!!!");
					
				}
				
				if ( sum == 7 )
				{
					System.out.println("You lose!!!");
				}
				
				
			}
			
			
			
			boolean yesOrNo = true;
		
			
			while (yesOrNo) 
			{
				System.out.println("Would you like to play again?");
				String answer = in.next();
				
				if (answer.equalsIgnoreCase("yes")) 
				{
					keepGoing = true;
					yesOrNo = false;
				}
				else if (answer.toLowerCase().equals("no")) 
				{
					keepGoing = false;
					yesOrNo = false;
				}
				else 
				{
					System.out.println("Invalid Input!");
					yesOrNo = true;
					
				}
			}
		}

	}

}
	
