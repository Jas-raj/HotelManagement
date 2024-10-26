package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CustomerInfo extends JFrame {
    CustomerInfo(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(88, 248, 119, 250));
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(10,40,900,450);
        table.setBackground(new Color(88, 248, 119, 250));
        table.setForeground(new Color(2, 33, 8, 250));
        panel.add(table);

        try {

            Room.Con c = new Room.Con();
            String q = "select * from Customer";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e ){
            e.printStackTrace();
        }

        JLabel id = new JLabel("ID");
        id.setBounds(31,11,100,14);
        id.setBackground(new Color(88, 248, 119, 250));
        id.setForeground(new Color(2, 33, 8, 250));
        id.setFont(new Font("serif", Font.BOLD,15));
        panel.add(id);

        JLabel number = new JLabel("Number");
        number.setBounds(150,11,100,14);
        number.setBackground(new Color(88, 248, 119, 250));
        number.setForeground(new Color(2, 33, 8, 250));
        number.setFont(new Font("serif", Font.BOLD,15));
        panel.add(number);

        JLabel name = new JLabel("Name");
        name.setBounds(270,11,100,14);
        name.setFont(new Font("serif", Font.BOLD,15));
        name.setBackground(new Color(88, 248, 119, 250));
        name.setForeground(new Color(2, 33, 8, 250));
        panel.add(name);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(360,11,100,14);
        gender.setFont(new Font("serif", Font.BOLD,15));
        gender.setBackground(new Color(88, 248, 119, 250));
        gender.setForeground(new Color(2, 33, 8, 250));
        panel.add(gender);

        JLabel country = new JLabel("Country");
        country.setBounds(480,11,100,15);
        country.setFont(new Font("serif", Font.BOLD,15));
        country.setBackground(new Color(88, 248, 119, 250));
        country.setForeground(new Color(2, 33, 8, 250));
        panel.add(country);

        JLabel room = new JLabel("Room");
        room.setBounds(600,11,100,14);
        room.setFont(new Font("serif", Font.BOLD,15));
        room.setBackground(new Color(88, 248, 119, 250));
        room.setForeground(new Color(2, 33, 8, 250));
        panel.add(room);

        JLabel Time = new JLabel("CI Time");
        Time.setBounds(680,11,100,14);
        Time.setFont(new Font("serif", Font.BOLD,15));
        Time.setBackground(new Color(88, 248, 119, 250));
        Time.setForeground(new Color(2, 33, 8, 250));
        panel.add(Time);

        JLabel Deposit = new JLabel("Deposit");
        Deposit.setBounds(800,11,100,15);
        Deposit.setFont(new Font("serif", Font.BOLD,15));
        Deposit.setBackground(new Color(88, 248, 119, 250));
        Deposit.setForeground(new Color(2, 33, 8, 250));
        panel.add(Deposit);

        JButton back = new JButton("Back");
        back.setBounds(450,510,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setUndecorated(true);
        setLayout(null);
        setSize(900,600);
        setLocation(500,100);
        setVisible(true);
    }
    public static void main(String[] args) {
        new CustomerInfo();
    }
}