import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Proj7_10 {
    public static int period=10;
    public static int time=0;
    public static void main(String[] args) {
        GUI gui=new GUI();
        Timer timer =new Timer();
        Random random=new Random();
        Circle circle1=new Circle(1,255,255,100,100,200,250,80,0);
        gui.space.add(circle1);



        TimerTask timerTask=new TimerTask() {
            @Override
            public void run() {
                if(gui.isMoving){
                    time+=10;
                    double x= (100*Math.cos(1.9*time/1000))+200;
                    double y=  (100*Math.sin(1.9*time/1000))+200;
                    double[] newLoc= new double[]{x,y};
                    circle1.setLoc(newLoc);
                gui.panel.repaint();
            }}
        };
        timer.scheduleAtFixedRate(timerTask,0,period);
    }


}
