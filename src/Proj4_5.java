import java.util.Scanner;

public class Proj4_5 {
    public static void main(String[] args){

        int iteration;
        Scanner in =new Scanner(System.in);
        iteration=in.nextInt();
        double piOverFour=0;
        for (int i=0;i<iteration;i++){
            piOverFour=piOverFour+(1.0/(4.0*i+1.0))-(1.0/(4.0*i+3.0));
        }
        System.out.println(piOverFour);
    }
}
