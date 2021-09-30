import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Proj4_9 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in =new Scanner(new File("C:\\Homework\\src\\4_9File.txt"));
        while (in.hasNext()){
            int a =in.nextInt();
            int b=in.nextInt();
            System.out.println(a+" "+b+" "+Math.pow(a,b));
        }
    }

}
