import java.util.Scanner;

public class Proj4_2 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        double one , two, three;
        one  = in.nextDouble();
        two  = in.nextDouble();
        three  = in.nextDouble();
        if(Math.round(one*one)==Math.round(two*two+three*three)){
            System.out.println("It is a right angle");
        }else if(Math.round(two*two)==Math.round(one*one+three*three))System.out.println("It is a right angle");
        else if (Math.round(three*three)==Math.round(one*one+two*two)) System.out.println("It is a right angle");
        else System.out.println("Nope, it isn't");
    }
}
