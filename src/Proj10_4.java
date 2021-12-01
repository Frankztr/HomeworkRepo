import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Proj10_4 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<Integer> integers=new ArrayList<>();
        for(int i=0;i<10;i++){
            integers.add(in.nextInt());
        }
        Collections.sort(integers);
        System.out.println("Mode: "+findMod(integers));
        System.out.println("Median: "+findMedian(integers));

    }
    public static int findMod(ArrayList<Integer> integers){
        int answer=0;
        int biggestCount=0;
        for(int i=1;i<10;i++) {
            int index=i-1;
            int count=0;
            while(index!=-1&& integers.get(index).equals(integers.get(i))){
                count++;
                index--;
            }
            if(count>biggestCount) {biggestCount=count;
                answer=i;
            }
        }
        return integers.get(answer);

    }
    public static double findMedian(ArrayList<Integer> integers){
        if(integers.size()%2==1){
            return integers.get(integers.size()/2-1);
        }else{
            return (integers.get(integers.size()/2)+integers.get(integers.size()/2-1))/2.0;
        }
    }
}
