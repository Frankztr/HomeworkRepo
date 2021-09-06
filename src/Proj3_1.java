import java.util.Scanner;

public class Proj3_1 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.print("Please enter the length of the square:");
        double length=in.nextInt();
        System.out.printf("The surface area is %.2f meter squared.",length*length);


    }
}
