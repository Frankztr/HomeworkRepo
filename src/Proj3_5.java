import java.util.Scanner;

public class Proj3_5 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter the hourly wage:");
        Double wage=in.nextDouble();
        String[] week=new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday"};
        double total=0;
        for(int i=0;i<5;i++){
            System.out.print("Please enter the regular time on "+week[i]+":");
            total+=wage*in.nextDouble();
            System.out.print("Please enter overtime time on "+week[i]+":");
            total+=wage*1.5*in.nextDouble();
        }
        System.out.printf("The total wage this week is %.3f",total);
    }
}
