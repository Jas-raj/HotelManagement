package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Room extends JFrame {
    JTable table;
    JButton back;
    Room(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(88, 248, 119, 250));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/roomm.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(600,200,200,200);
        panel.add(label);

        table = new JTable();
        table.setBounds(10,40,500,400);
        table.setBackground(new Color(88, 248, 119, 250));
        table.setForeground(new Color(2, 33, 8, 250));
        panel.add(table);

        try{
            Con c = new Con();
            String RoomInfo = "Select * from Room";
            ResultSet resultSet = c.statement.executeQuery(RoomInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }


        JLabel room = new JLabel("Room no.");
        room.setBounds(12,15,80,19);
        room.setFont(new Font("serif", Font.BOLD,14));
        room.setBackground(new Color(88, 248, 119, 250));
        room.setForeground(new Color(2, 33, 8, 250));
        panel.add(room);

        JLabel avaliability = new JLabel("Avaliability");
        avaliability.setBounds(119,15,80,19);
        avaliability.setFont(new Font("serif", Font.BOLD,14));
        avaliability.setBackground(new Color(88, 248, 119, 250));
        avaliability.setForeground(new Color(2, 33, 8, 250));
        panel.add(avaliability);

        JLabel clean = new JLabel("Cleaning Status");
        clean.setBounds(210,15,1500,19);
        clean.setFont(new Font("serif", Font.BOLD,14));
        clean.setBackground(new Color(88, 248, 119, 250));
        clean.setForeground(new Color(2, 33, 8, 250));
        panel.add(clean);

        JLabel price = new JLabel("Price");
        price.setBounds(330,15,80,19);
        price.setFont(new Font("serif", Font.BOLD,14));
        price.setBackground(new Color(88, 248, 119, 250));
        price.setForeground(new Color(2, 33, 8, 250));
        panel.add(price);

        JLabel bed = new JLabel("Bed Type");
        bed.setBounds(417,15,80,19);
        bed.setFont(new Font("serif", Font.BOLD,14));
        bed.setBackground(new Color(88, 248, 119, 250));
        bed.setForeground(new Color(2, 33, 8, 250));
        panel.add(bed);


        back = new JButton("Back");
        back.setBackground(new Color(126, 176, 123, 250));
        back.setBounds(200,500,120,30);
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
        new Room();
    }

    public static class Con {
        Connection connection;
        Statement statement;

        public Con() {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelMS", "root", "Jasraj@123");
                statement = connection.createStatement();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
