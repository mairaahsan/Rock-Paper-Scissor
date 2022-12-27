import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String repeatGame = "Y";

        while (repeatGame.equals("Y")) {

            String userMove = "";
            String computerMove = "";

            System.out.println("Lets play Rock, Paper Scissor!");
            //prompt userMove input
            System.out.println("Select your move: R, P, S");
            //userMove = input
            userMove = input.next();
            //computerMove = generate random computerMove
            computerMove = getComputerMove();
            System.out.println(computerMove);
            //print computerMove

            //if (USER= P COMP= R or USER= S COMP= P or USER= R COMP= S), print "YOU WIN!"
            if (((userMove.equals("P") && computerMove.equals("R"))||(userMove.equals("S") && computerMove.equals("P"))||(userMove.equals("R") && computerMove.equals("S")))){
                System.out.println("YOU WIN!");
            }
            //if (USER= P COMP= S or USER= S COMP= R or USER= R COMP= P), print "COMPUTER WINS!"
            if (((userMove.equals("P") && computerMove.equals("S"))||(userMove.equals("S") && computerMove.equals("R"))||(userMove.equals("R") && computerMove.equals("P")))){
                System.out.println("COMPUTER WINS!"); }
            //if (USER= P COMP= P or USER= S COMP= S or USER= R COMP= R), print "IT'S A TIE. TRY AGAIN!"
            if (((userMove.equals("P") && computerMove.equals("P"))||(userMove.equals("S") && computerMove.equals("S"))||(userMove.equals("R") && computerMove.equals("R")))){
                System.out.println("IT'S A TIE. TRY AGAIN!"); }
            System.out.println("Would you like to play again? Y or N?");
            repeatGame=input.next();

        }
    }

    public static String getComputerMove() {
        int randomNum = (int) ((Math.random() * 3) + 1);
        String computerMove1;
        String x = "";

        if (randomNum == 1) {
            computerMove1 = "R";
            x = computerMove1;
        }

        if (randomNum == 2) {
            computerMove1 = "P";
            x = computerMove1;
        }

        if (randomNum == 3) {
            computerMove1 = "S";
            x = computerMove1;
        }
        return x;

    }

}
