package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateRoom extends JFrame {

    UpdateRoom(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setBackground(new Color(88, 248, 119, 250));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);

        JLabel label1 = new JLabel("Update room Status");
        label1.setBounds(124,11,300,22);
        label1.setFont(new Font("Tahoma", Font.BOLD,22));
        label1.setForeground(new Color(2, 33, 8, 250));
        panel.add(label1);

        JLabel ID = new JLabel("ID: ");
        ID.setBounds(25,88,66,15);
        ID.setFont(new Font("Tahoma", Font.BOLD,15));
        ID.setForeground(new Color(2, 33, 8, 250));
        panel.add(ID);

        Choice c1 = new Choice();
        c1.setBounds(248,85,150,20);
        c1.setFont(new Font("serif", Font.BOLD,15));
        c1.setBackground(new Color(88, 248, 119, 250));
        c1.setForeground(new Color(2, 33, 8, 250));
        panel.add(c1);
        try{
            Room.Con c = new Room.Con();
            ResultSet resultSet = c.statement.executeQuery("select * from customer");
            while (resultSet.next()){
                c1.add(resultSet.getString("number"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }


        JLabel roomNo = new JLabel("Room Number: ");
        roomNo.setBounds(25,129,150,15);
        roomNo.setFont(new Font("Tahoma", Font.BOLD,15));
        roomNo.setForeground(new Color(2, 33, 8, 250));
        panel.add(roomNo);
        JTextField roomNoText = new JTextField();
        roomNoText.setBounds(248,129,150,20);
        roomNoText.setBackground(new Color(126, 176, 123, 250));
        roomNoText.setFont(new Font("Tahoma",Font.BOLD,14));
        roomNoText.setForeground(new Color(2, 33, 8, 250));
        roomNoText.setBorder(null);
        panel.add(roomNoText);


        JLabel aval = new JLabel("Availability: ");
        aval.setBounds(25,174,97,15);
        aval.setFont(new Font("Tahoma", Font.BOLD,15));
        aval.setForeground(new Color(2, 33, 8, 250));
        panel.add(aval);
        JTextField avalText = new JTextField();
        avalText.setBounds(248,174,150,20);
        avalText.setBackground(new Color(126, 176, 123, 250));
        avalText.setFont(new Font("Tahoma",Font.BOLD,14));
        avalText.setForeground(new Color(2, 33, 8, 250));
        avalText.setBorder(null);
        panel.add(avalText);

        JLabel cleanSt = new JLabel("Clean Status: ");
        cleanSt.setBounds(25,216,150,15);
        cleanSt.setFont(new Font("Tahoma", Font.BOLD,15));
        cleanSt.setForeground(new Color(2, 33, 8, 250));
        panel.add(cleanSt);
        JTextField cleanStText = new JTextField();
        cleanStText.setBounds(248,216,150,20);
        cleanStText.setBackground(new Color(126, 176, 123, 250));
        cleanStText.setFont(new Font("Tahoma",Font.BOLD,14));
        cleanStText.setForeground(new Color(2, 33, 8, 250));
        cleanStText.setBorder(null);
        panel.add(cleanStText);



        JButton update = new JButton("Update");
        update.setBounds(56,378,89,23);
        update.setBackground(new Color(126, 176, 123, 250));
        update.setForeground(new Color(2, 33, 8, 250));
        update.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(update);
        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Room.Con c = new Room.Con();
                    String status = cleanStText.getText();
                    c.statement.executeUpdate("update Room set cleaning_status ='"+status+"' where roomnumber = "+roomNoText.getText());

                  JOptionPane.showMessageDialog(null, "Updated sucessfully");
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(168,378,89,23);
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
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JButton check = new JButton("Check");
        check.setBounds(281,378,89,23);
        check.setBackground(new Color(126, 176, 123, 250));
        check.setForeground(new Color(2, 33, 8, 250));
        check.setFont(new Font("Tahoma",Font.BOLD,15));
        panel.add(check);
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = c1.getSelectedItem();
                String q = "Select * from customer where '"+id+"'";
                try{
                    Room.Con c = new Room.Con();
                    ResultSet resultSet = c.statement.executeQuery(q);
                    while(resultSet.next()){
                        roomNoText.setText(resultSet.getString("room"));
                        avalText.setText(resultSet.getString("name"));
                        cleanStText.setText(resultSet.getString("Checkintime"));
                    }

                    ResultSet resultSet1 = c.statement.executeQuery("Select * from Room where roomnumber = '"+ roomNoText.getText()+"'");

                    while (resultSet1.next()){
                        avalText.setText(resultSet1.getString("availability"));
                        cleanStText.setText(resultSet1.getString("cleaning_status"));

                    }
                }catch (Exception E){
                    E.printStackTrace();

                }
            }
        });

        setUndecorated(true);
        setLocation(400,200);
        setLayout(null);
        setSize(900,450);
        setVisible(true);
    }
    public static void main(String args[]){new UpdateRoom();}
}
