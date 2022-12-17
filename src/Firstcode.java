import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Firstcode{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your move: ");
        String myMove= sc.nextLine();
        System.out.println("You moved "+ myMove);

        List<String> moves= new ArrayList<>();
        moves.add("rock");
        moves.add("scissor");
        moves.add("paper");

        Firstcode sc1= new Firstcode();
        System.out.println("opponent move: ");
        String opponentMove= sc1.getRandomElement(moves);
        System.out.println(opponentMove);
        System.out.println("opponent moved: "+ opponentMove);

        if(myMove.equals("rock") && opponentMove.equals("rock")){
            System.out.println("Game tied");
        }else if (myMove.equals("rock") && opponentMove.equals("paper")){
            System.out.println("you loose");
        } else if (myMove.equals("rock") && opponentMove.equals("scissor")){
            System.out.println("you win");
        }else if (myMove.equals("paper") && opponentMove.equals("rock")){
            System.out.println("you win");
        }else if (myMove.equals("paper") && opponentMove.equals("scissor")){
            System.out.println("you loose");
        }else if (myMove.equals("paper") && opponentMove.equals("paper")){
            System.out.println("Game tied");
        }else if (myMove.equals("scissor") && opponentMove.equals("scissor")){
            System.out.println("Game tie");
        }else if (myMove.equals("scissor") && opponentMove.equals("rock")){
            System.out.println("you loose");
        }else if (myMove.equals("scissor") && opponentMove.equals("paper")){
            System.out.println("you win");
        }else {
            System.out.println("Invalid selection");
        }

    }
    public  String getRandomElement(List<String> moves){
        Random rand= new Random();
        return moves.get(rand.nextInt(moves.size()));
    }
}

