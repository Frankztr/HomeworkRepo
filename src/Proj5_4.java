import images.APImage;
import images.Pixel;

public class Proj5_4 {
    public static void main(String[] args) {
        APImage image=new APImage("D:\\test4.jpg");
        for(Pixel pixel:image){
            int red=pixel.getRed();
            int green=pixel.getGreen();
            int blue=pixel.getBlue();
            if(red<63){
                red=(int)(red*1.1);
                blue=(int)(blue*0.9);
            }else if(red <192){
                red=(int)(red*1.15);
                blue=(int)(blue*0.85);
            }else{
                red=Math.min((int)(red*1.08),255);
                blue=(int)(blue*0.93);
            }
            pixel.setRed(red);
            pixel.setBlue(blue);
            pixel.setGreen(green);

        }
        image.draw();
    }
}
