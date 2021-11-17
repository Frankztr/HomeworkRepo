import java.util.Random;
import java.util.Scanner;

public class Proj7_2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String answer;
        int largeEnd;
        int smallEnd;
        int guess;
        String respond;
        game:
        while(true){
            System.out.print("Please enter a number between 0 to 100(or anything that doesn't follow this requirement to close the game):");
            answer=in.nextLine();
            if(answer.length()==0||(int)(answer.charAt(0))>57||(int)(answer.charAt(0))<48)break;
            largeEnd=100;
            smallEnd=0;
            while(true){
                guess=(int)(Math.random()*(largeEnd-smallEnd+1)+smallEnd);
                System.out.println("\nThe computer guesses "+guess);
                System.out.println("Please enter W for win, B for should be bigger, or S for should be smaller");
                System.out.print("Enter anything else would close the game:");
                respond=in.nextLine();
                if(respond.length()!=1||(respond.toUpperCase().charAt(0)!='B'&&respond.toUpperCase().charAt(0)!='S'&&respond.toUpperCase().charAt(0)!='W'))
                    break game;

                if(respond.toUpperCase().charAt(0)=='W'){
                    System.out.println("The computer wins");break;}
                else if(guess==Integer.parseInt(answer)) {
                    System.out.println("You made a mistake\nThe computer wins");
                    break;
                }
                if(respond.toUpperCase().charAt(0)=='B'){if(Integer.parseInt(answer)>guess)smallEnd=guess+1;
                else{
                    System.out.println("You made a mistake, it should be smaller");
                    largeEnd=guess-1;
                }
                }
                if(respond.toUpperCase().charAt(0)=='S'){
                    if(Integer.parseInt(answer)<guess)
                    largeEnd=guess-1;
                    else{
                        System.out.println("You made a mistake, it should be bigger");
                        smallEnd=guess+1;
                    }
                }

            }


        }
    }
}
