import java.awt.*;
import javax.swing.*;
public class JFrameTest
{
    private static final int WINDOW_WIDTH = 680;
    private static final int WINDOW_HEIGHT = 200;
    private static final int BUTTON_WIDTH = 180; // Button width
    private static final int BUTTON_HEIGHT = 60; //Bytton height
    private static final int BUTTON_DISTANCE = 50;
    private JFrame window;
    private JButton btnRed, btnGreen, btnBlue;
    
    private JFrameTest()
    {
        //make window
        window = new JFrame("Colors :D");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT); // Set the width and the Height of the window
        window.setLocationRelativeTo(null); // Move Window To Center
        
        //buttons
        Font btnFont = new Font("Comic Sans MS", Font.PLAIN, 28);
        
        btnRed = new JButton("RED");
        btnRed.setBounds(0, 50, BUTTON_WIDTH, BUTTON_HEIGHT);
        btnRed.setFont(btnFont);
        btnRed.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnRed.addActionListener(event -> {window.setBackground(Color.RED);});
        window.add(btnRed);
        
        btnGreen = new JButton("GREEN");
        btnGreen.setBounds(250, 50, BUTTON_WIDTH, BUTTON_HEIGHT);
        btnGreen.setFont(btnFont);
        btnGreen.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnGreen.addActionListener(event -> {window.setBackground(Color.GREEN);});
        window.add(btnGreen);
   
        btnBlue = new JButton("BLUE");
        btnBlue.setBounds(500,50, BUTTON_WIDTH, BUTTON_HEIGHT);
        btnBlue.setFont(btnFont);
        btnBlue.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnBlue.addActionListener(event -> {window.setBackground(Color.BLUE);});
        window.add(btnBlue);
        
        window.setLayout(null);
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //The Red Button == End
        window.setVisible(true);
    }
    
    public static void main()
    {new JFrameTest();}
}
