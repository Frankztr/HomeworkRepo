import java.util.Scanner;

public class Proj7_8{
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        int count=0;
        double totLength=0;
        String sent=in.nextLine();
        sent=sent.trim();
        int loc2=0;
        int loc1=0;
        while(loc2!=sent.length()){
            if(sent.charAt(loc2)==' '){
                count++;
                totLength+=sent.substring(loc1,loc2).length();
                loc1=loc2;

            }
            loc2++;
        }

        if(sent.length()!=0){
            count++;
            if(sent.charAt(loc1)==' ')
                loc1++;
            totLength+=sent.substring(loc1).length();
        }
        totLength-=(count-2);
        System.out.println("There are "+count+ " words in this sentence");
        System.out.println("The average length of the word is "+totLength/count);
        System.out.println("There are "+ totLength+ " chars in this sentence");
    }
}