import java.util.Scanner;

public class Proj3_4 {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter the hourly wage:");
        Double wage=in.nextDouble();
        System.out.print("Please enter regular time per week:");
        Double regular=in.nextDouble();
        System.out.print("Please enter overtime time per week:");
        Double overTime=in.nextDouble();
        System.out.printf("The weekly total pay is $%.2f",wage*(regular+1.5*overTime));
    }

}
