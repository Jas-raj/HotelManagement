package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ManagerInfo extends JFrame {

    ManagerInfo(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setBackground(new Color(88, 248, 119, 250));
        panel.setLayout(null);
        add(panel);


        JTable table = new JTable();
        table.setBounds(10,34,980,450);
        table.setForeground(new Color(2, 33, 8, 250));
        table.setBackground(new Color(88, 248, 119, 250));
        panel.add(table);

        try {
            Room.Con c = new Room.Con();
            String manager = "select * from employee where job = 'Manager'";
            ResultSet resultSet = c.statement.executeQuery(manager);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JButton back = new JButton("Back");
        back.setBackground(new Color(126, 176, 123, 250));
        back.setBounds(350,500,120,30);
        back.setFont(new Font("serif", Font.BOLD,20));
        back.setForeground(new Color(2, 33, 8, 250));
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        JLabel name = new JLabel("Name");
        name.setBounds(41,11,70,19);
        name.setFont(new Font("serif", Font.BOLD,15));
        name.setBackground(new Color(88, 248, 119, 250));
        name.setForeground(new Color(2, 33, 8, 250));
        panel.add(name);

        JLabel age = new JLabel("Age");
        age.setBounds(159,11,70,19);
        age.setFont(new Font("serif", Font.BOLD,15));
        age.setBackground(new Color(88, 248, 119, 250));
        age.setForeground(new Color(2, 33, 8, 250));
        panel.add(age);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(273,11,70,19);
        gender.setFont(new Font("serif", Font.BOLD,15));
        gender.setBackground(new Color(88, 248, 119, 250));
        gender.setForeground(new Color(2, 33, 8, 250));
        panel.add(gender);


        JLabel job = new JLabel("Job");
        job.setBounds(416,11,70,19);
        job.setFont(new Font("serif", Font.BOLD,15));
        job.setBackground(new Color(88, 248, 119, 250));
        job.setForeground(new Color(2, 33, 8, 250));
        panel.add(job);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(536,11,70,19);
        salary.setFont(new Font("serif", Font.BOLD,15));
        salary.setBackground(new Color(88, 248, 119, 250));
        salary.setForeground(new Color(2, 33, 8, 250));
        panel.add(salary);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(656,11,70,19);
        phone.setFont(new Font("serif", Font.BOLD,15));
        phone.setBackground(new Color(88, 248, 119, 250));
        phone.setForeground(new Color(2, 33, 8, 250));
        panel.add(phone);

        JLabel gmail = new JLabel("Gmail");
        gmail.setBounds(786,11,70,19);
        gmail.setFont(new Font("serif", Font.BOLD,15));
        gmail.setBackground(new Color(88, 248, 119, 250));
        gmail.setForeground(new Color(2, 33, 8, 250));
        panel.add(gmail);

        JLabel adhaar = new JLabel("Adhaar No.");
        adhaar.setBounds(890,11,90,19);
        adhaar.setFont(new Font("serif", Font.BOLD,15));
        adhaar.setBackground(new Color(88, 248, 119, 250));
        adhaar.setForeground(new Color(2, 33, 8, 250));
        panel.add(adhaar);


        setUndecorated(true);
        setSize(1000,600);
        setLocation(500,100);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[]){
        new ManagerInfo();
    }
}
