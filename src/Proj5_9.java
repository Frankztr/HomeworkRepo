import images.APImage;
import images.Pixel;
import java.util.Scanner;

public class Proj5_9 {
    public static void main(String[] args) {
        APImage image=new APImage("D:\\test3.jpg");
        int factor=10;
        APImage largeImage=new APImage(image.getWidth()*factor,image.getHeight()*factor);

        for(int i=0;i<image.getWidth();i++){
            for (int j = 0; j <image.getHeight() ; j++) {
                int red = image.getPixel(i,j).getRed();
                int blue = image.getPixel(i,j).getBlue();
                int green = image.getPixel(i,j).getGreen();
                Pixel pixel=new Pixel(red,green,blue);
                for (int k = 0; k < factor; k++) {
                    for (int l = 0; l < factor; l++) {
                        largeImage.setPixel(factor*i+k,factor*j+l,pixel.clone());
                    }
                }


            }
        }







        largeImage.draw();


    }
}