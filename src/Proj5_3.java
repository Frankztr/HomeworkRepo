import images.APImage;
import images.Pixel;

public class Proj5_3 {
    public static void main(String[] args) {
        APImage image=new APImage("D:\\test2.png");
        image.draw();
        for(Pixel a:image){
            a.setGreen(255-a.getGreen());
            a.setBlue(255-a.getBlue());
            a.setRed(255-a.getRed());
        }
        image.draw();
    }

}
