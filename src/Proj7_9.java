import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Proj7_9{
    public static void main(String [] args) throws IOException {
        Scanner in=new Scanner(System.in);
        String fileName=in.nextLine();
        String targetWord=in.nextLine();
        Scanner inFile=new Scanner(new File(fileName));
        int count=0;
        while(inFile.hasNext()){
            String next=inFile.next();
            System.out.println(next);
            if(next.equalsIgnoreCase(targetWord))count++;
        }
        System.out.println(count);

    }

}