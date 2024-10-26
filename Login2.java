package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
/***Redirecting to Admin Frame**/
public class Login2 extends JFrame implements ActionListener {
    JTextField textField1;
    JPasswordField passwordField1;
    JButton b1,b2;
    Login2(){

        JLabel label1=new JLabel("Username");  //give a label or text to textfield
        label1.setBounds(40,20,100,30); //bounds/location are set to frame width and height
        label1.setFont(new Font("Tahoma",Font.BOLD, 16));
        label1.setForeground(Color.cyan);
        add(label1);


        textField1 = new JTextField();
        textField1.setBounds(150,20,150,30);
        textField1.setForeground(new Color(1, 31, 31));
        textField1.setFont(new Font("Tahoma", Font.PLAIN,15));
        textField1.setBackground(Color.cyan);
        add(textField1);

/************************************************************************/

        JLabel label2=new JLabel("Password");
        label2.setBounds(40,70,100,30);
        label2.setFont(new Font("Tahoma",Font.BOLD, 16));
        label2.setForeground(Color.CYAN);
        add(label2);

        passwordField1 = new JPasswordField();
        passwordField1.setBounds(150,70,150,30);
        passwordField1.setForeground(new Color(1, 31, 31));
        setFont(new Font("Tahoma", Font.PLAIN,15));
        passwordField1.setBackground(Color.cyan);
        add(passwordField1);

/****************************************************************************/


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/logoImage.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(255,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(318,-30,255,300);
        add(label);


        b1 = new JButton("Login");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.setBackground(Color.cyan);
        b1.setForeground(new Color(16, 1, 24, 229));
        b1.addActionListener(this);
        add(b1);

/*****************************************************************************/

        b2 = new JButton("Cancel");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.cyan);
        b2.setForeground(new Color(16, 1, 24, 229));
        b2.addActionListener(this);
        add(b2);

        getContentPane().setBackground(Color.black);
        setLayout(null);
        setLocation(400,279);
        setSize(600,300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            /***Now connect for login*******/
                    try{
                        Room.Con c = new Room.Con();
                        String user = textField1.getText();  //extracting the username from textfield entered by user
                        String pass = passwordField1.getText();

                        String q = "Select * from login2 where user_name = '"+user+"'and password = '"+pass+"'"; //query if username and password is present in rows in db
                        ResultSet resultSet = c.statement.executeQuery(q);
                        if(resultSet.next()){
                            new Admin();
                            setVisible(false);
                        }else {
                            JOptionPane.showMessageDialog(null,"Invalid username and password"); //if username and password is  not present in db
                }
            }catch (Exception E){
                E.printStackTrace();
            }

        } else{
            new Dashboard();
            this.setVisible(false);
        }


    }
    public static void main(String args[]){
        new Login2();
    }

}
