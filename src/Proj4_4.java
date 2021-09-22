import java.util.Scanner;

public class Proj4_4 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int fac=in.nextInt();
        long ans=1;
        for(int i=0;i<fac;i++){
            ans*=(i+1);
        }
        System.out.println(ans);
    }
}
