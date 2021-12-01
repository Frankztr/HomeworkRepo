import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Proj10_3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        ArrayList<Integer> integers=new ArrayList<>();
        for(int i=0;i<10;i++){
            integers.add(in.nextInt());
        }
        Collections.sort(integers);
        System.out.println(findMod(integers));

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

}
