import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Random rc = new Random();
        System.out.println("Welcome to Rock Paper and Scissor Game!");
        System.out.println("type 1 for 'Rock' \n2 for Paper \n3 for Scissor");
        System.out.println("Enter a number");
        int human = sc.nextInt();

        switch(human){
            case 1:
                System.out.println("You choose Rock");
                break;
            case 2:
                System.out.println("You choose Paper");
                break;
            case 3:
                System.out.println("you choose Scissor");
                break;
            default:
                System.out.println("Please choose a valid number!");
        }

        System.out.println("Now it's computer's turn!");
        int computer = rc.nextInt(3);

        if(computer==1){
            System.out.println("computer choose Rock");
        }
        if (computer==2) {
            System.out.println("computer choose Paper");
        }
        if (computer==3){
            System.out.println("computer choose Scissor");
        }

        if(human==1 && computer==2 || human==2 && computer==3 || human==3 && computer==1){
            System.out.println("You lose the match\nBetter luck next time");
        }
        else if (human==computer){
            System.out.println("Match draw!");
        }
        else {
            System.out.println("You won the match");
        }
    }
}
