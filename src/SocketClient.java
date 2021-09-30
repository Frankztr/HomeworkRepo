import images.APImage;
import images.Pixel;

public class SocketClient {
        public static void main(String[] args)  {
            APImage apImage=new APImage("D:\\test2.png");
            apImage.draw();
            int slope=apImage.getWidth()/apImage.getHeight();
            test:
            for(int i=0;i<apImage.getWidth();i++){
                for(int j=0;j<apImage.getHeight();j++){
                    if(i<slope*j)continue test;
                    if(i==0||i== apImage.getWidth()-1||j==0||j==apImage.getHeight()-1){
                        continue;
                    }
                    int value=getValue(apImage.getPixel(i,j));
                    int rightValue=getValue(apImage.getPixel(i+1,j));
                    int downValue=getValue(apImage.getPixel(i,j+1));
                    Pixel pix= apImage.getPixel(i,j);
                    int red = pix.getRed();
                    int blue = pix.getBlue();
                    int green = pix.getGreen();
                    if(isEdge(value,rightValue,downValue)){
                        pix.setRed(Math.max(0,red-50));
                        pix.setBlue(Math.max(0,blue-50));
                        pix.setGreen(Math.max(0,green-50));
                    }else{
                        pix.setRed(Math.max(0,red));
                        pix.setBlue(Math.max(0,blue));
                        pix.setGreen(Math.max(0,green));
                    }

                }
            }
            apImage.draw();
    }

    public static int getValue(Pixel a){
            return (a.getRed()+a.getGreen()+a.getBlue())/3;
    }
    public static int absDiff(int a,int b){
            return Math.abs(a-b);
    }
    public static boolean isEdge(int value,int right,int down){
            int a=10;
            if(absDiff(value,right)>a){
                return true;
            }else if(absDiff(value,down)>a){
                return true;
            }else{
                return false;
            }

    }


}