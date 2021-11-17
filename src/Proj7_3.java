import java.util.Scanner;

public class Proj7_3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num;
        String input;
        while(true){
            System.out.print("Please enter the numeric grade:");
            input=in.nextLine();
            try {
                num=Integer.parseInt(input);
            }catch (Exception e){continue;}
            if(num==-1)break;
            if(num<0||num>100)continue;
            if(num>=96) {System.out.println("A+");continue;}
            if(num>=92) {System.out.println("A");continue;}
            if(num>=90) {System.out.println("A-");continue;}
            if(num>=86) {System.out.println("B+");continue;}
            if(num>=82) {System.out.println("B");continue;}
            if(num>=80) {System.out.println("B-");continue;}
            if(num>=76) {System.out.println("C+");continue;}
            if(num>=72) {System.out.println("C");continue;}
            if(num>=70) {System.out.println("C-");continue;}
            if(num>=66) {System.out.println("D+");continue;}
            if(num>=62) {System.out.println("D");continue;}
            if(num>=60) {System.out.println("D-");continue;}
            if(num>=0) {System.out.println("F");continue;}


        }


    }
}
