import images.APImage;
import images.Pixel;

public class Proj5_8 {
    public static void main(String[] args) {
        APImage image=new APImage("D:\\test2.png");
        int factor=5;
        APImage smallImage=new APImage(image.getWidth()/factor,image.getHeight()/factor);
        for(int i=0;i<smallImage.getWidth();i++){
            for (int j = 0; j < smallImage.getHeight(); j++) {
                Pixel pixel=new Pixel(image.getPixel(i*factor,j*factor).getRed(),image.getPixel(i*factor,j*factor).getGreen(),image.getPixel(i*factor,j*factor).getBlue());
                smallImage.setPixel(i,j,pixel);
            }
        }
        smallImage.draw();
    }
}
