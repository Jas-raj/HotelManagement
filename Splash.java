package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame {
    Splash(){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/splash.gif")); //assigns splash gif to ImageIcon object with provided location

        JLabel label = new JLabel(imageIcon); //creates imageIcon to label
        label.setBounds(0,0,858,680); //set bounds of label
        add(label); //displays in frame


        //frame are by default is bordered layout
        setLayout(null);
        setLocation(300,80); //position at which frame should be open
        setSize(858,680); //Frame size
        Color color = new Color(194, 180, 228);
        getContentPane().setBackground((color));
        setVisible(true); //to view frame



        //should be written after setVisible(true)
        try{
            Thread.sleep(3000); //helps displays splash for 5 secs
            new Login();
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

        public static void main(String[] args) {
        new Splash();
        }
    }

