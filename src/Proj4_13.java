import javax.swing.*;
import java.awt.*;

public class Proj4_13 {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Project 4-13");
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(1,2));
        MyPanel panel1=new MyPanel();
        MyPanel panel2=new MyPanel();
        panel1.setBackground(Color.BLACK);
        panel2.setBackground(Color.WHITE);
        frame.add(panel1);
        frame.add(panel2);
        panel1.repaint();
        panel2.repaint();


    }

    public static class MyPanel extends JPanel{
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.setColor(Color.GRAY);
            g.fillRect(this.getWidth()/4,this.getHeight()/4,this.getWidth()/2,this.getHeight()/2);

        }
    }
}
