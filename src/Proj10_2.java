import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Proj10_2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        double[] doubles=new double[10];
        for(int i=0;i<10;i++) {
            doubles[i]=in.nextDouble();
        }
        double avg=avgList(doubles);
        ArrayList<Double> higher=new ArrayList<>();
        for(double d:doubles){
            if(d>avg){
                higher.add(d);
                System.out.print(d+" ");
            }

        }



    }



    public static double avgList(double[] list){
        double tot=0;
        for(double d:list){
            tot+=d;
        }

        return tot/list.length;

    }
}
