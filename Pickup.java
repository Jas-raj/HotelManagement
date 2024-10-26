package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Pickup extends JFrame {
    Pickup(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,790,590);
        panel.setBackground(new Color(88, 248, 119, 250));
        panel.setLayout(null);
        add(panel);

        JLabel pus = new JLabel("Pick up Service");
        pus.setBounds(90,11,200,25);
        pus.setFont(new Font("Tahoma", Font.BOLD,20));
        pus.setForeground(new Color(2, 33, 8, 250));
        panel.add(pus);

        JLabel toc = new JLabel("Type Of Car: ");
        toc.setBounds(32,97,89,20);
        toc.setFont(new Font("Serif", Font.PLAIN,15));
        toc.setForeground(new Color(2, 33, 8, 250));
        panel.add(toc);

        Choice c1 = new Choice();
        c1.setBounds(128,97,160,20);
        c1.setFont(new Font("serif", Font.BOLD,15));
        c1.setBackground(new Color(88, 248, 119, 250));
        c1.setForeground(new Color(2, 33, 8, 250));
        panel.add(c1);
        try{
            Room.Con c = new Room.Con();
            ResultSet resultSet = c.statement.executeQuery("Select * from driver");
            while (resultSet.next()){
                c1.add(resultSet.getString("carname"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        JTable table = new JTable();
        table.setBounds(10,233,800,250);
        table.setBackground(new Color(88, 248, 119, 250));
        table.setForeground(new Color(2, 33, 8, 250));
        panel.add(table);
        try{
            Room.Con c = new Room.Con();
            String q = "Select * from driver";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel name = new JLabel("Name");
        name.setBounds(24,200,46,14);
        name.setFont(new Font("Serif", Font.BOLD,15));
        name.setForeground(new Color(2, 33, 8, 250));
        panel.add(name);

        JLabel age = new JLabel("Age");
        age.setBounds(165,200,46,14);
        age.setFont(new Font("Serif", Font.BOLD,15));
        age.setForeground(new Color(2, 33, 8, 250));
        panel.add(age);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(264,200,100,15);
        gender.setFont(new Font("Serif", Font.BOLD,15));
        gender.setForeground(new Color(2, 33, 8, 250));
        panel.add(name);

        JLabel comapny = new JLabel("Company");
        comapny.setBounds(366,200,100,15);
        comapny.setFont(new Font("Serif", Font.BOLD,15));
        comapny.setForeground(new Color(2, 33, 8, 250));
        panel.add(comapny);

        JLabel carname = new JLabel("Car Name");
        carname.setBounds(484,200,120,14);
        carname.setFont(new Font("Serif", Font.BOLD,15));
        carname.setForeground(new Color(2, 33, 8, 250));
        panel.add(carname);

        JLabel available = new JLabel("Available");
        available.setBounds(600,200,100,14);
        available.setFont(new Font("Serif", Font.BOLD,15));
        available.setForeground(new Color(2, 33, 8, 250));
        panel.add(available);

        JLabel location = new JLabel("Location");
        location.setBounds(700,200,100,14);
        location.setFont(new Font("Serif", Font.BOLD,15));
        location.setForeground(new Color(2, 33, 8, 250));
        panel.add(location);


        JButton display = new JButton("Display");
        display.setBounds(200,500,120,30);
        display.setBackground(new Color(126, 176, 123, 250));
        display.setForeground(new Color(2, 33, 8, 250));
        panel.add(display);
        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String q = "Select * from driver where carname = '"+c1.getSelectedItem()+"'";
                try{
                    Room.Con c = new Room.Con();
                    ResultSet resultSet = c.statement.executeQuery(q);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet));
                }catch (Exception E){
                    E.printStackTrace();
                }

            }
        });

        JButton back = new JButton("Back");
        back.setBounds(420,500,120,30);
        back.setBackground(new Color(126, 176, 123, 250));
        back.setForeground(new Color(2, 33, 8, 250));
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        setUndecorated(true);
        setLocation(500,100);
        setLayout(null);
        setSize(800,600);
        setVisible(true);


    }
    public static void main(String args[]){ new Pickup();}
}
