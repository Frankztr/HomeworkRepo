import images.APImage;
import images.Pixel;

public class Proj5_5 {
    public static void main(String[] args) {
        APImage image=new APImage("D:\\test.png");
        for(Pixel pixel:image){
            int red=Math.min(pixel.getRed()+40, 255);
            pixel.setRed(red);
        }
        image.draw();
    }
}
