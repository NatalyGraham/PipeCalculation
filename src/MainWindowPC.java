import java.awt.*;
import javax.swing.*;



public class MainWindowPC {

    private JFrame MainWindow;
    private int dimensionX = 500;
    private int dimensionY = dimensionX * 3 / 2;
    private int mindimensionX = 250;
    private int mindimensionY = mindimensionX * 3 / 2;


    public MainWindowPC()
    {
        MainWindow = new JFrame();
        MainWindow.setSize(dimensionX,dimensionY);
        MainWindow.setLocationRelativeTo(null);
        MainWindow.setResizable(false);
        MainWindow.setMinimumSize(new Dimension(mindimensionX,mindimensionY));
        MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //MainWindow.setBackground(Color.DARK_GRAY);
        MainWindow.setVisible(true);
    }



    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindowPC();
            }
        });

    }
}
