import java.awt.*;
import javax.swing.*;
public class JFrameTest
{
    private static final int WINDOW_WIDTH = 680;
    private static final int WINDOW_HEIGHT = 200;
    private static final int BUTTON_WIDTH = 180;
    private static final int BUTTON_HEIGHT = 60; 
    private JFrame window;
    private JButton btnRed, btnGreen, btnBlue;
    
    private JFrameTest()
    {
        //make window
        window = new JFrame("Colors :D");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT); //set width and height of window
        window.setLocationRelativeTo(null); //center window
        
        //buttons
        Font btnFont = new Font("OpenSymbol", Font.BOLD, 30);
        
        btnRed = new JButton("RED");
        btnRed.setBounds(0, 50, BUTTON_WIDTH, BUTTON_HEIGHT);
        btnRed.setFont(btnFont);
        btnRed.setForeground(Color.RED);
        btnRed.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnRed.addActionListener(event -> {window.setBackground(Color.RED);});
        window.add(btnRed);
        
        btnGreen = new JButton("GREEN");
        btnGreen.setBounds(250, 50, BUTTON_WIDTH, BUTTON_HEIGHT);
        btnGreen.setFont(btnFont);
        btnGreen.setForeground(Color.GREEN.darker());
        btnGreen.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnGreen.addActionListener(event -> {window.setBackground(Color.GREEN);});
        window.add(btnGreen);
   
        btnBlue = new JButton("BLUE");
        btnBlue.setBounds(500,50, BUTTON_WIDTH, BUTTON_HEIGHT);
        btnBlue.setFont(btnFont);
        btnBlue.setForeground(Color.BLUE);
        btnBlue.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnBlue.addActionListener(event -> {window.setBackground(Color.BLUE);});
        window.add(btnBlue);
        
        //exit window
        window.setLayout(null);
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //The Red Button == End
        window.setVisible(true);
    }
    
    public static void main()
    {new JFrameTest();}
}
