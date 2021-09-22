import java.util.Scanner;

public class Proj4_8 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int base=in.nextInt();
        int exp;

        while(true){
            exp=in.nextInt();
            if(exp==-1){
                break;
            }
            System.out.println(Math.pow(base,exp));
        }

    }
}
