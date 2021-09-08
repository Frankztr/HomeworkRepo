import java.util.Scanner;

public class Proj3_2 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.print("Please enter the radius of the sphere:");
        double radius =in.nextDouble();
        System.out.printf("The diameter of the sphere is %.3f\n",radius*2);
        System.out.printf("The circumference of the circle is %.3f\n",radius*2*Math.PI);
        System.out.printf("The surface area of the sphere is %.3f\n",radius*radius*4*Math.PI);
        System.out.printf("The volume of the sphere is %.3f\n",radius*radius*radius*Math.PI*4/3);

    }
}
