import javax.swing.*;
import java.awt.*;

public class GUIWindow {
    public static void main(String[] args){
        JFrame frame3_6=new JFrame("Project 3-6");
        frame3_6.setVisible(true);
        frame3_6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3_6.setSize(300,200);
        Container pane=frame3_6.getContentPane();
        pane.add(new ColorPanel.Panel3_6());
        JFrame frame3_7=new JFrame("Project 3-7");
        frame3_7.setVisible(true);
        frame3_7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3_7.setSize(300,200);
        Container pane2=frame3_7.getContentPane();
        pane2.add(new ColorPanel.Panel3_7());
    }





}
