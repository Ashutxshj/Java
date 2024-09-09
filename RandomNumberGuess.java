//? Develop a game where the user has to guess a randomly generated number within a certain range.
import java.util.*;
import java.util.Random;
class RandomNumberGuess{
    public static void main(String[] args){
        System.out.println("----------------------------------------------- WELCOME TO ASHU's NUMBER GUESSING GAME-----------------------------------------");
        System.out.println("Give the limit: ");
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        Random rand =  new Random();
        int r=rand.nextInt(a);
        System.out.println("Guess the number");
        int guess = sc.nextInt();
        while(guess!=r){
            if(guess>r){
                System.out.println("Try Lower");
            }
            else{
                System.out.println("Try Higher");
        }
        guess=sc.nextInt();
    }
    System.out.println("Congratulations! You've guessed the number correctly.");
    System.out.println("---------------------------------------------------------------------THE END---------------------------------------------------");
    }
}

