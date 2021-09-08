import java.util.Scanner;

public class Proj3_3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Please enter the mass of the object:");
        Double mass=in.nextDouble();
        System.out.print("Please enter the velocity of the object:");
        Double velo=in.nextDouble();

        System.out.printf("The momentum of the object is %.3f\n",mass*velo);
        System.out.printf("The kinetic energy of the object is %.3f\n",mass*velo*velo*0.5);
    }
}
