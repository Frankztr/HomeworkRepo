import java.util.Random;
import java.util.Scanner;

public class Proj7_1 {
    public static void main(String[] args) {
        Random a=new Random();
        int b;
        Scanner in=new Scanner(System.in);
        ababa:
        while(true){
            b= a.nextInt(100);
            while(true){
            System.out.print("Please enter a number to continue the game(or enter anything that is not number to close the game):");
            String c=in.nextLine();
            if(c.length()==0||(int)(c.charAt(0))>57||(int)(c.charAt(0))<48) break ababa;
            int d=Integer.parseInt(c);
            if(b==d) {System.out.println("You win"); break;}
            else if(b<d) System.out.println("No, the number is smaller");
            else System.out.println("No, the number is bigger");
        }}
    }
}
