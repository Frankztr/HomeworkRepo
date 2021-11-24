import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI extends JFrame  {
    public Space space;
    public Panel panel;
    public Graphics graphics;
    static int test;
    public boolean isMoving=true;
    GUI(){
        space=new Space();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(395,420);
        panel=new Panel();
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isMoving=!isMoving;
            }
        });
        this.add(panel);
        test=10;
    }
    class Panel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics){
            graphics.clearRect(0, 0, getWidth(), getHeight());
            graphics.setColor(Color.BLACK);
            for(Circle c:space.getList()){
                graphics.fillOval((int)c.getLoc()[0],(int)c.getLoc()[1], (int) (c.getRadius()*2),(int) (c.getRadius()*2));
            }
        }

    }
}

