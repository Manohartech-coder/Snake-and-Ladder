import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to play Snake and Ladder game");
        playGame();
    }
    private static  int rollDice(){
        Random r=new Random();
        return r.nextInt(6);
    }
    public static void playGame(){
        Scanner sc=new Scanner(System.in);

        int position=0;
        System.out.println("Initial player position: "+position);
        System.out.println("Enter to roll Die");
        String s=sc.nextLine();
        if(s.equalsIgnoreCase("roll")){
           int diceVal=rollDice();
           System.out.println("you rolled "+diceVal);
        }
    }
}