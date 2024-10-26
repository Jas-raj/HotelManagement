package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Department extends JFrame {
    Department(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(88, 248, 119, 250));
        panel.setLayout(null);
        add(panel);

        JLabel label1 = new JLabel("Department");
        label1.setBounds(145,11,105,14);
        label1.setFont(new Font("serif", Font.BOLD,14));
        label1.setBackground(new Color(88, 248, 119, 250));
        label1.setForeground(new Color(2, 33, 8, 250));
        panel.add(label1);


        JLabel label2 = new JLabel("Budget");
        label2.setBounds(431,11,105,14);
        label2.setFont(new Font("serif", Font.BOLD,14));
        label2.setBackground(new Color(88, 248, 119, 250));
        label2.setForeground(new Color(2, 33, 8, 250));
        panel.add(label2);


        JTable table = new JTable();
        table.setBounds(0,40,700,350);
        table.setBackground(new Color(88, 248, 119, 250));
        table.setForeground(new Color(2, 33, 8, 250));
        panel.add(table);


        try{
            Room.Con c = new Room.Con();
            String departmentInfo = "select * from department";
            ResultSet resultSet = c.statement.executeQuery(departmentInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }

        JButton back = new JButton("Back");
        back.setBackground(new Color(126, 176, 123, 250));
        back.setBounds(400,410,120,30);
        back.setFont(new Font("serif", Font.BOLD,20));
        back.setForeground(new Color(2, 33, 8, 250));
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });



        setUndecorated(true);
        setSize(900,600);
        setLocation(500,100);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]){
        new Department();
    }

}
