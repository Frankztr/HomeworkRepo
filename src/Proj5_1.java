import images.APImage;
import images.Pixel;

import java.util.Scanner;

public class Proj5_1 {
    public static void main(String[] args) {
        String fileName;
        Scanner in=new Scanner(System.in);
        fileName=in.nextLine();
        APImage image=new APImage(fileName);
        image.draw();
        for(Pixel a:image){
            int value =(a.getBlue()+a.getRed())/2;
            a.setGreen(value);
            a.setBlue(value);
            a.setRed(value);
        }
        image.draw();


    }

}
