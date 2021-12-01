import java.util.ArrayList;
import java.util.Scanner;

public class Proj10_1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] inputs=new int[10];

        ArrayList<Integer> evenList=new ArrayList<>();
        ArrayList<Integer> oddList=new ArrayList<>();

        for(int i=0;i<10;i++){
            inputs[i]=in.nextInt();
            if(inputs[i]%2==0) evenList.add(inputs[i]);
            else oddList.add(inputs[i]);
        }
        System.out.print("The input list is: ");
        for(int i=0;i<10;i++){
            System.out.print(inputs[i]+" ");
        }
        System.out.println();
        System.out.print("The odd list is: ");
        for(Integer i:oddList){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("The even list is: ");
        for(Integer i:evenList){
            System.out.print(i+" ");
        }


    }
}
