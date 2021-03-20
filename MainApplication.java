//Name:Khushpreet Kaur
//Student ID:201903130
//Date Submitted: March 20,2021
//Class IN2203 Gruop:2
//Name of work:Assignment1:The Gambling Game
import java.util.*;

public class MainApplication{
	
	public static void main(String[] args){
		Casino c = new Casino();
		c.OrganizeNewGame();
	}
}

class Casino{
	// in programming land: we refer to Stories as "requirements"
	// R001: A player walks into a casino and wants to play a game
	// we need to create a Player and we need to create a GAME
    Player p1= new Player();
    Game g1= new Game();
    String userAnswer;
        Scanner s= new Scanner(System.in);
        public void OrganizeNewGame(){
            System.out.println("Welcome to our Casino: Would you like to play the gambling game? (yes/no)");
        userAnswer= s.nextLine();
        if(userAnswer.equals("yes")){
            System.out.println("let's begin");
                    g1.PlayGame();
                    
}
else
{System.out.println("Good bye");}
}
}

class Game{
	Random rand =new Random();
	private int ComputerGuess=-1;
public void PlayGame(){
	System.out.println("Guess a number from 1 to 100");
	System.out.println("And I will guess a game");
	System.out.println("If your guess is within 10 of my guess:then you win. Else I will win");
	ComputerGuess=ComputerGuess();
	System.out.println("Computer Guess is"+ ComputerGuess);
}
public int ComputerGuess(){
	// implement the algorithm to generate the computer's guess:
	// use a random number Generate 
	
	int programGuess =rand.nextInt(100);
	return programGuess;
}
}
class Player{
	Scanner sc=new Scanner(System.in);
	private int userGuess;
	public int guessNumber()
	{
		System.out.println("enter your guess number from 1 to 100");
		userGuess=sc.nextInt();
		return userGuess;
	}
}