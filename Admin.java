package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener {
    JButton add_Employee;
    JButton add_Room, add_Driver, logout, back;

    Admin(){
        add_Employee = new JButton("Add Employee");
        add_Employee.setBounds(250,230,200,30);
        add_Employee.setBackground(Color.cyan);
        add_Employee.setForeground(new Color(16, 1, 24, 229));
        add_Employee.setFont(new Font("Tahome",Font.BOLD,15));
        add_Employee.addActionListener(this);
        add(add_Employee);


        add_Room = new JButton("Add Room");
        add_Room.setBounds(250,380,200,30);
        add_Room.setBackground(Color.cyan);
        add_Room.setForeground(new Color(16, 1, 24, 229));
        add_Room.setFont(new Font("Tahome",Font.BOLD,15));
        add_Room.addActionListener(this);
        add(add_Room);

        add_Driver = new JButton("Add Driver");
        add_Driver.setBounds(250,530,200,30);
        add_Driver.setBackground(Color.cyan);
        add_Driver.setForeground(new Color(16, 1, 24, 229));
        add_Driver.setFont(new Font("Tahome",Font.BOLD,15));
        add_Driver.addActionListener(this);
        add(add_Driver);

        logout = new JButton("Logout");
        logout.setBounds(40,730,95,30);
        logout.setBackground(Color.green);
        logout.setForeground(new Color(16, 1, 24, 229));
        logout.setFont(new Font("Tahome",Font.BOLD,15));
        logout.addActionListener(this);
        add(logout);


        back = new JButton("Back");
        back.setBounds(150,730,95,30);
        back.setBackground(Color.GREEN);
        back.setForeground(new Color(16, 1, 24, 229));
        back.setFont(new Font("Tahome",Font.BOLD,15));
        back.addActionListener(this);
        add(back);


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/employees.png"));
        Image l11 = imageIcon.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(l11);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(70,190,120,120);
        add(label);

        ImageIcon imageIcon2 = new ImageIcon(ClassLoader.getSystemResource("icons/room.png"));
        Image l1 = imageIcon2.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon3 = new ImageIcon(l1);
        JLabel label1 = new JLabel(imageIcon3);
        label1.setBounds(70,340,120,120);
        add(label1);

        ImageIcon imageIcon4 = new ImageIcon(ClassLoader.getSystemResource("icons/driver.png"));
        Image l111 = imageIcon4.getImage().getScaledInstance(120,120, Image.SCALE_DEFAULT);
        ImageIcon imageIcon5 = new ImageIcon(l111);
        JLabel label2 = new JLabel(imageIcon5);
        label2.setBounds(70,500,120,120);
        add(label2);

        ImageIcon logo = new ImageIcon(ClassLoader.getSystemResource("icons/admin11.gif"));
        Image logo1 = logo.getImage().getScaledInstance(400,400, Image.SCALE_DEFAULT);
        ImageIcon image= new ImageIcon(logo1);
        JLabel label3 = new JLabel(image);
        label3.setBounds(1000,250,400,400);
        add(label3);

        getContentPane().setBackground(new Color(141,229,237));
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add_Employee){
            new AddEmployee();

        } else if(e.getSource() == add_Room){
            new AddRoom();

        } else if(e.getSource() == add_Driver){
            new AddDriver();
        } else if (e.getSource() == logout){
            System.exit(404);
        } else if(e.getSource() == back){
            new Dashboard();
            this.setVisible(false);  //closes current frame
        }

    }

    public static void main(String args[]){
        new Admin();
    }

}
