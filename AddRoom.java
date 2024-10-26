package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRoom extends JFrame implements ActionListener{
    JTextField t2,t4;
    JComboBox t3, t5, t6;

    JButton b1,b2;
    AddRoom(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,875,490);
        panel.setBackground(new Color(88, 248, 119, 250));
        panel.setLayout(null);
        add(panel);


        JLabel l1 = new JLabel("Add Room");
        l1.setBounds(194,10,160,22);
        l1.setFont(new Font("Tahome", Font.BOLD,20));
        l1.setForeground(new Color(2, 33, 8, 250));
        panel.add(l1);


        JLabel l2 = new JLabel("Room Number");
        l2.setBounds(64 ,70,152,22);
        l2.setFont(new Font("Tahome", Font.PLAIN,20));
        l2.setForeground(new Color(2, 33, 8, 250));
        panel.add(l2);

        t2 = new JTextField();
        t2.setBounds(230 ,73,156,20);
        t2.setFont(new Font("Tahome", Font.PLAIN,20));
        t2.setForeground(new Color(2, 33, 8, 250));
        t2.setBackground(new Color(126, 176, 123, 250));
        t2.setBorder(null);
        panel.add(t2);



        JLabel l3 = new JLabel("Availability");
        l3.setBounds(64 ,110,152,22);
        l3.setFont(new Font("Tahome", Font.PLAIN,20));
        l3.setForeground(new Color(2, 33, 8, 250));
        panel.add(l3);

        t3 = new JComboBox(new String[] {"Avaliable", "Occupied"});
        t3.setBounds(230 ,110,156,20);
        t3.setFont(new Font("Tahome", Font.PLAIN,15));
        t3.setForeground(new Color(2, 33, 8, 250));
        t3.setBackground(new Color(126, 176, 123, 250));
        t3.setBorder(null);
        panel.add(t3);


        JLabel l4 = new JLabel("Price");
        l4.setBounds(64 ,150,152,22);
        l4.setFont(new Font("Tahome", Font.PLAIN,20));
        l4.setForeground(new Color(2, 33, 8, 250));
        panel.add(l4);

        t4 = new JTextField();
        t4.setBounds(230 ,150,156,20);
        t4.setFont(new Font("Tahome", Font.PLAIN,20));
        t4.setForeground(new Color(2, 33, 8, 250));
        t4.setBackground(new Color(126, 176, 123, 250));
        t4.setBorder(null);
        panel.add(t4);

        JLabel l5 = new JLabel("Cleaning Status");
        l5.setBounds(64 ,190,198,22);
        l5.setFont(new Font("Tahome", Font.PLAIN,20));
        l5.setForeground(new Color(2, 33, 8, 250));
        panel.add(l5);

        t5 = new JComboBox(new String[]{"Clean", "Dirty"});
        t5.setBounds(230 ,190,156,20);
        t5.setFont(new Font("Tahome", Font.PLAIN,15));
        t5.setForeground(new Color(2, 33, 8, 250));
        t5.setBackground(new Color(126, 176, 123, 250));
        t5.setBorder(null);
        panel.add(t5);


        JLabel l6 = new JLabel("Bed Type");
        l6.setBounds(64 ,230,198,22);
        l6.setFont(new Font("Tahome", Font.PLAIN,20));
        l6.setForeground(new Color(2, 33, 8, 250));
        panel.add(l6);

        t6 = new JComboBox(new String[]{"Single Bed", "Double Bed"});
        t6.setBounds(230 ,230,156,20);
        t6.setFont(new Font("Tahome", Font.PLAIN,15));
        t6.setForeground(new Color(2, 33, 8, 250));
        t6.setBackground(new Color(126, 176, 123, 250));
        t6.setBorder(null);
        panel.add(t6);

        b1 = new JButton("Add");
        b1.setBounds(64,320,111,33);
        b1.setBackground(new Color(4, 236, 19, 250));
        b1.setForeground(new Color(2, 33, 8, 250));
        b1.addActionListener(this);
        panel.add(b1);


        b2 = new JButton("Back");
        b2.setBounds(198,320,111,33);
        b2.setBackground(new Color(4, 236, 19, 250));
        b2.setForeground(new Color(2, 33, 8, 250));
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon imageicon = new ImageIcon(ClassLoader.getSystemResource("icons/roomser.png"));
        Image image = imageicon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);





        setUndecorated(true);
        setLocation(20,200);
//        getContentPane().setBackground(new Color(175, 220, 215));
        setLayout(null);
        setSize(885,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            try{
                Room.Con c = new Room.Con();
                String room = t2.getText();  //Room number
                String ava = (String) t3.getSelectedItem();  //Combobox Avaliability
                String price = t4.getText(); //Price of room
                String status = (String) t5.getSelectedItem(); //Cleaning Status
                String type = (String) t6.getSelectedItem(); //Bed  type

                String q = "insert into Room values('"+room+"','"+ava+"', '"+status+"', '"+price+"','"+type+"')";
                c.statement.executeUpdate(q); //for insertion in table

                JOptionPane.showMessageDialog(null,"Room sucessfully Addded");  //For displaying the message when query is runned succesfully
                this.setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }
        } else {
            setVisible(false);
        }

    }

    public static void main(String args[]){
        new AddRoom();
    }

}
