import java.util.Scanner;

public class Proj4_6 {

    public static void main(String[] args){
        System.out.print("Please enter the initial number of organism:");
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        System.out.print("Please enter the rate of growth:");
        int rate=in.nextInt();
        System.out.print("Please enter the number of hours to achieve this rate:");
        int hours=in.nextInt();
        System.out.print("Please enter the nubmer of hours to grow:");
        int hour= in.nextInt();
        double ans=num*Math.pow(rate,hour*1.0/hours);
        System.out.printf("The total pop is %.3f",ans);


    }
}
