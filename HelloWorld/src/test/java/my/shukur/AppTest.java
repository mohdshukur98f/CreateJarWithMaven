package my.shukur;

import javax.swing.*;

public class AppTest extends JFrame
{

    public AppTest(){
        setTitle("HelloWorld");
        setSize(600, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setVisible(true);
    }

    public static void main (String[] args)
    {
        new AppTest();
    }
}
