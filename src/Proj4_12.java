import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

class Proj4_12{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the number of rows:");
        int row=in.nextInt();
        System.out.print("Please enter the number of column:");
        int column=in.nextInt();
        JFrame frame = new JFrame("Project 4-11");
        frame.setDefaultCloseOperation(3);
        frame.setSize(400, 400);
        frame.setVisible(true);
        Container container = frame.getContentPane();


        container.setLayout(new GridLayout(row, column));

        for(int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j) {
                JPanel panel = new JPanel();
                if ((i % 2 != 1 || j % 2 != 0) && (i % 2 != 0 || j % 2 != 1)) {
                    panel.setBackground(Color.RED);
                } else {
                    panel.setBackground(Color.BLACK);
                }

                frame.add(panel);
            }
        }
    }
}