import java.util.Scanner;

public class Proj4_3 {
    public static void main(String[] args){
        double totalMinutes;
        Scanner in =new Scanner(System.in);
        totalMinutes=in.nextDouble();
        double base=1.15;
        if (totalMinutes<=2){
            System.out.printf("The cost is $%.3f",base);
        }else{
            System.out.printf("The cost is $%.3f",base+0.5*(totalMinutes-2));
        }



    }
}
