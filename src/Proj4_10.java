import java.util.Scanner;

public class Proj4_10 {


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double base = in.nextDouble();
        double inc=in.nextDouble();
        int years=in.nextInt();
        System.out.println("Years    Salary");
        for(int i=0;i<years;i++){
            if(i<9)
            System.out.printf("%d       %.3f",i+1,base);else
                System.out.printf("%d      %.3f",i+1,base);
            base=base+base*inc;
            System.out.println();
        }



    }
}
