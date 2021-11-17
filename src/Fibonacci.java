
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n;
        int fib;
        int a,b,count;

        while(true){

            System.out.print("Enter a positive integer or -1 to quit: ");
            n = reader.nextInt();
            if(n == -1) break;
            else if(n >= 1){

                fib = 1;
                a = 1;
                b = 1;
                count = 3;
                while (count <= n){
                    fib = a + b;
                    a = b;
                    b = fib;
                    count += 1;
                }
                System.out.println("Fibonacci number " + n + " is " + fib);
            }
        }
    }
}
