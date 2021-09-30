import images.APImage;
import images.Pixel;


public class Proj5_2 {
    public static void main(String[] args) {

        APImage image=new APImage("D:\\test2.png");
        image.draw();
        for(Pixel a:image){
            int value =(a.getBlue()+a.getRed()+a.getGreen());
            a.setGreen((int) Math.min(255,value*0.587));
            a.setBlue((int) Math.min(255,value*0.299));
            a.setRed((int) Math.min(255,value*0.114));
        }
        image.draw();
    }
}
