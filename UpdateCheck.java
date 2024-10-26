package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class UpdateCheck extends JFrame {

    UpdateCheck(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,940,490);
        panel.setBackground(new Color(88, 248, 119, 250));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/updated.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);

        JLabel label1 = new JLabel("Checked-In Details");
        label1.setBounds(124,11,222,22);
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


        JLabel name = new JLabel("Name: ");
        name.setBounds(25,174,97,15);
        name.setFont(new Font("Tahoma", Font.BOLD,15));
        name.setForeground(new Color(2, 33, 8, 250));
        panel.add(name);
        JTextField nameText = new JTextField();
        nameText.setBounds(248,174,150,20);
        nameText.setBackground(new Color(126, 176, 123, 250));
        nameText.setFont(new Font("Tahoma",Font.BOLD,14));
        nameText.setForeground(new Color(2, 33, 8, 250));
        nameText.setBorder(null);
        panel.add(nameText);

        JLabel checkIn = new JLabel("Checked-In: ");
        checkIn.setBounds(25,216,150,15);
        checkIn.setFont(new Font("Tahoma", Font.BOLD,15));
        checkIn.setForeground(new Color(2, 33, 8, 250));
        panel.add(checkIn);
        JTextField checkInText = new JTextField();
        checkInText.setBounds(248,216,150,20);
        checkInText.setBackground(new Color(126, 176, 123, 250));
        checkInText.setFont(new Font("Tahoma",Font.BOLD,14));
        checkInText.setForeground(new Color(2, 33, 8, 250));
        checkInText.setBorder(null);
        panel.add(checkInText);

        JLabel amtpaid = new JLabel("Amount Paid (Rs): ");
        amtpaid.setBounds(25,261,150,15);
        amtpaid.setFont(new Font("Tahoma", Font.BOLD,15));
        amtpaid.setForeground(new Color(2, 33, 8, 250));
        panel.add(amtpaid);
        JTextField amtpaidText = new JTextField();
        amtpaidText.setBounds(248,261,150,20);
        amtpaidText.setBackground(new Color(126, 176, 123, 250));
        amtpaidText.setFont(new Font("Tahoma",Font.BOLD,14));
        amtpaidText.setForeground(new Color(2, 33, 8, 250));
        amtpaidText.setBorder(null);
        panel.add(amtpaidText);

        JLabel amtPending = new JLabel("Amount Pending : ");
        amtPending.setBounds(25,302,150,20);
        amtPending.setFont(new Font("Tahoma", Font.BOLD,15));
        amtPending.setForeground(new Color(2, 33, 8, 250));
        panel.add(amtPending);
        JTextField amtPendingText = new JTextField();
        amtPendingText.setBounds(248,302,150,20);
        amtPendingText.setBackground(new Color(126, 176, 123, 250));
        amtPendingText.setFont(new Font("Tahoma",Font.BOLD,14));
        amtPendingText.setForeground(new Color(2, 33, 8, 250));
        amtPendingText.setBorder(null);
        panel.add(amtPendingText);

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
                    String q = c1.getSelectedItem();
                    String room = roomNoText.getText();
                    String name = nameText.getText();
                    String check = checkInText.getText();
                    String amt = amtpaidText.getText();

                    c.statement.executeUpdate("update customer set room = '"+room+"', name = '"+name+"', checkInTime = '"+check+"', deposit = '"+amt+"' where number ='"+q+"'");
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
                        nameText.setText(resultSet.getString("name"));
                        checkInText.setText(resultSet.getString("Checkintime"));
                        amtpaidText.setText(resultSet.getString("deposit"));
                    }

                    ResultSet resultSet1 = c.statement.executeQuery("Select * from Room where roomnumber = '"+ roomNoText.getText()+"'");

                    while (resultSet1.next()){
                        String price = resultSet1.getString("price");

                        int amtpaid = Integer.parseInt(price) - Integer.parseInt(amtpaidText.getText());
                        amtPendingText.setText(""+amtpaid);
                    }
                }catch (Exception E){
                    E.printStackTrace();

                }
            }
        });




        setUndecorated(true);
        setLayout(null);
        setSize(950,500);
        setLocation(400,200);
        setVisible(true);

    }
    public static void main(String args[]){new UpdateCheck();}
}
