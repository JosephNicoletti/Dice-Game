// chapter 5 game zone page 280

public class TwoDice
{
	public static void main(String[] args)
	{
		// variables and constants
		Die playerDie = new Die();
		Die computerDie = new Die();
		String outcome;

		//calculation phase
		if(playerDie.getDieValue() > computerDie.getDieValue())
		{
			outcome ="The player wins!";
		}	
		else if(playerDie.getDieValue() < computerDie.getDieValue()) {
			outcome = "the computer has won.";
		}
		else
		{
			outcome = "We have a tie game.";
		}	

		//output phase 
		System.out.println();
		System.out.println("The first die is: " + playerDie.getDieValue());
		System.out.println("The second die is: " + computerDie.getDieValue());
		System.out.println(outcome);
	}
}