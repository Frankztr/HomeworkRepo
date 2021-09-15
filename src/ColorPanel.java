import javax.swing.*;
import java.awt.*;

public class ColorPanel {
    public static class Panel3_6 extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawLine((int)(this.getWidth()*0.33),(int)(this.getHeight()*0.45),(int)(this.getWidth()*0.66),(int)(this.getHeight()*0.45));
            g.drawLine((int)(this.getWidth()*0.33),(int)(this.getHeight()*0.45),(int)(this.getWidth()*0.33-this.getWidth()*0.05),(int)(this.getHeight()*0.45+this.getWidth()*0.05));
            g.drawLine((int)(this.getWidth()*0.33),(int)(this.getHeight()*0.45),(int)(this.getWidth()*0.33-this.getWidth()*0.05),(int)(this.getHeight()*0.45-this.getWidth()*0.05));
            g.drawLine((int)(this.getWidth()*0.66),(int)(this.getHeight()*0.45),(int)(this.getWidth()*0.66+this.getWidth()*0.05),(int)(this.getHeight()*0.45-this.getWidth()*0.05));
            g.drawLine((int)(this.getWidth()*0.66),(int)(this.getHeight()*0.45),(int)(this.getWidth()*0.66+this.getWidth()*0.05),(int)(this.getHeight()*0.45+this.getWidth()*0.05));
            g.drawLine((int)(this.getWidth()*0.33),(int)(this.getHeight()*0.65),(int)(this.getWidth()*0.66),(int)(this.getHeight()*0.65));
            g.drawLine((int)(this.getWidth()*0.33),(int)(this.getHeight()*0.65),(int)(this.getWidth()*0.33+this.getWidth()*0.05),(int)(this.getHeight()*0.65+this.getWidth()*0.05));
            g.drawLine((int)(this.getWidth()*0.33),(int)(this.getHeight()*0.65),(int)(this.getWidth()*0.33+this.getWidth()*0.05),(int)(this.getHeight()*0.65-this.getWidth()*0.05));
            g.drawLine((int)(this.getWidth()*0.66),(int)(this.getHeight()*0.65),(int)(this.getWidth()*0.66-this.getWidth()*0.05),(int)(this.getHeight()*0.65-this.getWidth()*0.05));
            g.drawLine((int)(this.getWidth()*0.66),(int)(this.getHeight()*0.65),(int)(this.getWidth()*0.66-this.getWidth()*0.05),(int)(this.getHeight()*0.65+this.getWidth()*0.05));

        }
    }
    public static class Panel3_7 extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawString("("+this.getWidth()/2+","+this.getHeight()/2+")",this.getWidth()/2,this.getHeight()/2);
        }


    }
}
