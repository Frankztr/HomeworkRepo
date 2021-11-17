import java.util.Random;
import java.util.Scanner;

public class Proj7_4 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] list=new int[100];
        String[] strings=new String[100];
        for(int i=0;i< list.length;i++) {
            list[i]= random.nextInt(100);
            strings[i]=getLetterGrade(list[i]);
            System.out.println(strings[i]);
        }
    }

    public static String getLetterGrade(int num){
        if(num<0||num>100) return "Error";
        if(num>=96) return "A+";
        if(num>=92) return "A";
        if(num>=90) return "A-";
        if(num>=86) return "B+";
        if(num>=82) return "B";
        if(num>=80) return "B-";
        if(num>=76) return "C+";
        if(num>=72) return "C";
        if(num>=70) return "C-";
        if(num>=66) return "D+";
        if(num>=62) return "D";
        if(num>=60) return "D-";
        if(num>=0) return "F";
        else return "Error";


    }

    }

