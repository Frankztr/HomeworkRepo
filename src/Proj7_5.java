import java.util.Scanner;

public class Proj7_5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter the first integer:");
        int a=in.nextInt();
        System.out.print("Please enter the second integer:");
        int b=in.nextInt();
        System.out.println(findGCD(a,b));
    }
    public static int findGCD(int a, int b){
        if(a>b){
            int temp=a;
            a=b;
            b=temp;
        }
        if(a==0) return b;
        else return findGCD(b%a,a);
    }
}
