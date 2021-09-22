import java.util.Scanner;

public class Proj4_7 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int exp;
        while(true){
            exp=in.nextInt();
            if(exp==-1) break;
            System.out.println(Math.pow(2,exp));
        }

    }
}
