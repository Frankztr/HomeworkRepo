import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int N=in.nextInt();
            int[][] lists=new int[N][2];
            int[] sum=new int[N];
            for(int i=0;i<N;i++){
                lists[i][0]=in.nextInt();
                lists[i][1]=in.nextInt();
                sum[i]=lists[i][0]+lists[i][1];
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(lists[i][0]+lists[i][1]<lists[j][0]+lists[j][1]){
                        swap(lists,i,j);
                    }
                }
            }
            for (int i=0;i<N;i++){
                System.out.print(lists[i][0]+" "+lists[i][1]);
                System.out.println();
            }
        }
        static void swap(int[][] list, int i,int j){
            int temp1 = list[i][0];
            int temp2 = list[i][1];
            list[i][0]=list[j][0];
            list[i][1]=list[j][1];
            list[j][0]=temp1;
            list[j][1]=temp2;
        }
}
