package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class CheckOut extends JFrame {
    CheckOut(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setBackground(new Color(88, 248, 119, 250));
        panel.setLayout(null);
        add(panel);

        JLabel label1 = new JLabel("Checked-Out");
        label1.setBounds(100,20,150,25);
        label1.setFont(new Font("Tahoma", Font.BOLD,22));
        label1.setForeground(new Color(2, 33, 8, 250));
        panel.add(label1);

        JLabel userId = new JLabel("Customer Id: ");
        userId.setBounds(30,80,100,30);
        userId.setFont(new Font("Serif", Font.PLAIN,15));
        userId.setForeground(new Color(2, 33, 8, 250));
        panel.add(userId);
        Choice c1 = new Choice();
        c1.setBounds(200,85,150,20);
        c1.setFont(new Font("serif", Font.BOLD,15));
        c1.setBackground(new Color(88, 248, 119, 250));
        c1.setForeground(new Color(2, 33, 8, 250));
        panel.add(c1);

        JLabel rooomNo = new JLabel("Room number: ");
        rooomNo.setBounds(30,130,100,30);
        rooomNo.setFont(new Font("Serif", Font.PLAIN,15));
        rooomNo.setForeground(new Color(2, 33, 8, 250));
        panel.add(rooomNo);

        JLabel labelrooomNo = new JLabel();
        labelrooomNo.setBounds(200,130,150,30);
        labelrooomNo.setFont(new Font("Serif", Font.PLAIN,15));
        labelrooomNo.setForeground(new Color(2, 33, 8, 250));
        panel.add(labelrooomNo);

        JLabel checkintime = new JLabel("Check-In time: ");
        checkintime.setBounds(30,180,150,30);
        checkintime.setFont(new Font("Serif", Font.PLAIN,15));
        checkintime.setForeground(new Color(2, 33, 8, 250));
        panel.add(checkintime);

        JLabel labelcheckintime = new JLabel();
        labelcheckintime.setBounds(200,180,200,30);
        labelcheckintime.setFont(new Font("Serif", Font.PLAIN,15));
        labelcheckintime.setForeground(new Color(2, 33, 8, 250));
        panel.add(labelcheckintime);

        JLabel  checkouttime = new JLabel("Chek-Out time: ");
        checkouttime.setBounds(30,230,100,30);
        checkouttime.setFont(new Font("Serif", Font.PLAIN,15));
        checkouttime.setForeground(new Color(2, 33, 8, 250));
        panel.add(checkouttime);

        Date date = new Date();
        JLabel  labelcheckouttime = new JLabel(""+date);
        labelcheckouttime.setBounds(200,230,200,30);
        labelcheckouttime.setFont(new Font("Serif", Font.PLAIN,15));
        labelcheckouttime.setForeground(new Color(2, 33, 8, 250));
        panel.add(labelcheckouttime);

        try{
            Room.Con c = new Room.Con();
            ResultSet resultSet = c.statement.executeQuery("select * from customer");
            while (resultSet.next()){
                c1.add(resultSet.getString("number"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        JButton checkout = new JButton("Check-Out");
        checkout.setBounds(30,300,120,30);
        checkout.setBackground(new Color(126, 176, 123, 250));
        checkout.setForeground(new Color(2, 33, 8, 250));
        checkout.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(checkout);
        checkout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Room.Con cv = new Room.Con();
                    cv.statement.executeUpdate("delete from customer where number = '"+c1.getSelectedItem()+"'");
                    cv.statement.executeUpdate("update room set availability ='Available' where roomnumber = '"+labelrooomNo.getText()+"'");
                    JOptionPane.showMessageDialog(null,"Done");
                    setVisible(false);
                }catch (Exception E){
                    E.printStackTrace();

                }            }
        });

        JButton check = new JButton("Check");
        check.setBounds(300,300,120,30);
        check.setBackground(new Color(126, 176, 123, 250));
        check.setForeground(new Color(2, 33, 8, 250));
        check.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Room.Con c = new Room.Con();
                try{
                    ResultSet resultSet = c.statement.executeQuery("select * from customer where number = '"+c1.getSelectedItem()+"'");
                    while (resultSet.next()){
                        labelrooomNo.setText(resultSet.getString("room"));
                        labelcheckintime.setText(resultSet.getString("checkInTime"));
                    }
                }catch (Exception E){
                    E.printStackTrace();
                }

            }
        });

        JButton back = new JButton("Back");
        back.setBounds(170,300,120,30);
        back.setBackground(new Color(126, 176, 123, 250));
        back.setForeground(new Color(2, 33, 8, 250));
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setUndecorated(true);
        setLocation(400,200);
        setLayout(null);
        setSize(900,500);
        setVisible(true);
    }
    public static void main(String args[]){
        new CheckOut();
    }
}
