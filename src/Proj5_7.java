import images.APImage;
import images.Pixel;

public class Proj5_7 {
    public static void main(String[] args) {


        APImage image=new APImage("D:\\test3.jpg");
        APImage newImage=new APImage(image.getWidth(),image.getHeight());
        for(int i=1;i<image.getWidth()-1;i++){
            for (int j = 1; j < image.getHeight()-1; j++) {
                int red = (image.getPixel(i-1,j).getRed()+image.getPixel(i+1,j).getRed()+image.getPixel(i,j+1).getRed()+image.getPixel(i,j-1).getRed())/4;
                int blue = (image.getPixel(i-1,j).getBlue()+image.getPixel(i+1,j).getBlue()+image.getPixel(i,j+1).getBlue()+image.getPixel(i,j-1).getBlue())/4;
                int green = (image.getPixel(i-1,j).getGreen()+image.getPixel(i+1,j).getGreen()+image.getPixel(i,j+1).getGreen()+image.getPixel(i,j-1).getGreen())/4;
                Pixel temp=new Pixel(red,green,blue);
                newImage.setPixel(i,j,temp);
            }
        }
        newImage.draw();


    }


}
