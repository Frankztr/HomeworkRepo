import images.APImage;

public class Proj5_10 {
    public static void main(String[] args) {
        APImage image=new APImage("D:\\test2.png");
        APImage rotatedImage= new APImage(image.getHeight(),image.getWidth());
        for(int i=0;i<image.getWidth();i++){
            for (int j = 0; j < image.getHeight(); j++) {
                rotatedImage.setPixel(j,i, image.getPixel(i,j));
            }
        }
        rotatedImage.draw();
    }
}
