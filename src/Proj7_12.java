import java.util.Timer;
import java.util.TimerTask;

public class Proj7_12 {
    public static int period=10;
    public static void main(String[] args) {

        GUI gui=new GUI();
        Timer timer =new Timer();
        for(int i=0;i<400;i++){
            gui.space.add(new Wall(1,255,255,255,100,-15,i,0,0));
            gui.space.add(new Wall(1,255,255,255,100,375,i,0,0));
            gui.space.add(new HorizontalWall(1,255,255,255,100,i,-20,0,0));
            gui.space.add(new HorizontalWall(1,255,255,255,100,i,370,0,0));
        }
        Circle circle1=new Circle(1,255,255,100,100,100,250,200,400);
        Circle circle2=new Circle(1,255,255,100,100,300,150,-400,-360);
        circle1.setRadius(15);
        circle2.setRadius(15);
        gui.space.add(circle1);
        gui.space.add(circle2);
        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                if(gui.isMoving) {
                    gui.space.run();
                    gui.panel.repaint();
                }            }
        };
        timer.scheduleAtFixedRate(timerTask,0,period);
    }
}
