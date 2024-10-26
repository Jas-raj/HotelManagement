package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class NewCustomer extends JFrame implements ActionListener {

    JComboBox comboBox;
    JTextField numText, nameText, countryText, depositText;
    JRadioButton r1,r2;
    Choice c1;
    JLabel date;
    JButton add, back;

    NewCustomer(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,840,540);
        panel.setBackground(new Color(88, 248, 119, 250));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/customer.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel imgLabel = new JLabel(imageIcon1);
        imgLabel.setBounds(550,150,200,200);
        panel.add(imgLabel);


        JLabel labelName = new JLabel("New CUSTOMER FORM");
        labelName.setBounds(118,11,260,53);
        labelName.setFont(new Font("Tahoma", Font.BOLD,20));
        labelName.setForeground(new Color(2, 33, 8, 250));
        panel.add(labelName);

        JLabel labelId = new JLabel("ID: ");
        labelId.setBounds(35,76,200,14);
        labelId.setFont(new Font("serif", Font.BOLD,15));
        labelId.setBackground(new Color(88, 248, 119, 250));
        labelId.setForeground(new Color(2, 33, 8, 250));
        panel.add(labelId);

        comboBox = new JComboBox(new String[] {"Passport", "Adhaar Card", "Voter Id", "Driving license"});
        comboBox.setBounds(271,73,150,20);
        comboBox.setBackground(new Color(126, 176, 123, 250));
        comboBox.setFont(new Font("Tahoma",Font.PLAIN,14));
        comboBox.setForeground(new Color(2, 33, 8, 250));
        panel.add(comboBox);


        JLabel labelNo = new JLabel("NUMBER: ");
        labelNo.setBounds(35,111,200,14);
        labelNo.setFont(new Font("serif", Font.BOLD,15));
        labelNo.setBackground(new Color(88, 248, 119, 250));
        labelNo.setForeground(new Color(2, 33, 8, 250));
        panel.add(labelNo);
        numText = new JTextField();
        numText.setBounds(271,111,150,20);
        numText.setBackground(new Color(126, 176, 123, 250));
        numText.setFont(new Font("Tahoma",Font.PLAIN,14));
        numText.setForeground(new Color(2, 33, 8, 250));
        panel.add(numText);


        JLabel labelname = new JLabel("NAME: ");
        labelname.setBounds(35,151,200,14);
        labelname.setFont(new Font("serif", Font.BOLD,15));
        labelname.setBackground(new Color(88, 248, 119, 250));
        labelname.setForeground(new Color(2, 33, 8, 250));
        panel.add(labelname);
        nameText = new JTextField();
        nameText.setBounds(271,151,150,20);
        nameText.setBackground(new Color(126, 176, 123, 250));
        nameText.setFont(new Font("Tahoma",Font.PLAIN,14));
        nameText.setForeground(new Color(2, 33, 8, 250));
        panel.add(nameText);


        JLabel gender = new JLabel("GENDER: ");
        gender.setBounds(35,191,200,14);
        gender.setFont(new Font("serif", Font.BOLD,15));
        gender.setBackground(new Color(88, 248, 119, 250));
        gender.setForeground(new Color(2, 33, 8, 250));
        panel.add(gender);
        r1 = new JRadioButton("Male");
        r1.setBounds(271,191,80,12);
        r1.setBackground(new Color(88, 248, 119, 250));
        r1.setFont(new Font("Tahoma",Font.BOLD,14));
        r1.setForeground(new Color(2, 33, 8, 250));
        panel.add(r1);
        r2 = new JRadioButton("Female");
        r2.setBounds(350,191,80,12);
        r2.setBackground(new Color(88, 248, 119, 250));
        r2.setFont(new Font("Tahoma",Font.BOLD,14));
        r2.setForeground(new Color(2, 33, 8, 250));
        panel.add(r2);



        JLabel labelContry = new JLabel("COUNTRY: ");
        labelContry.setBounds(35,231,200,14);
        labelContry.setFont(new Font("serif", Font.BOLD,15));
        labelContry.setBackground(new Color(88, 248, 119, 250));
        labelContry.setForeground(new Color(2, 33, 8, 250));
        panel.add(labelContry);
        countryText = new JTextField();
        countryText.setBounds(271,231,150,20);
        countryText.setBackground(new Color(126, 176, 123, 250));
        countryText.setFont(new Font("Tahoma",Font.PLAIN,14));
        countryText.setForeground(new Color(2, 33, 8, 250));
        panel.add(countryText);



        JLabel labelRoom = new JLabel("ALLOCATED ROOM NO.: ");
        labelRoom.setBounds(35,274,200,14);
        labelRoom.setFont(new Font("serif", Font.BOLD,15));
        labelRoom.setBackground(new Color(88, 248, 119, 250));
        labelRoom.setForeground(new Color(2, 33, 8, 250));
        panel.add(labelRoom);
        c1= new Choice();
        try{
            Room.Con c = new Room.Con();
            ResultSet resultSet = c.statement.executeQuery("Select * from room");
            while(resultSet.next()){
                c1.add(resultSet.getString("roomnumber"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        c1.setBounds(271,274,150,20);
        c1.setFont(new Font("serif", Font.BOLD,15));
        c1.setBackground(new Color(88, 248, 119, 250));
        c1.setForeground(new Color(2, 33, 8, 250));
        panel.add(c1);


        JLabel labelCIS = new JLabel("CHECKED_IN: ");
        labelCIS.setBounds(35,316,200,14);
        labelCIS.setFont(new Font("serif", Font.BOLD,15));
        labelCIS.setBackground(new Color(88, 248, 119, 250));
        labelCIS.setForeground(new Color(2, 33, 8, 250));
        panel.add(labelCIS);

        Date date1 = new Date();
        date = new JLabel(""+date1);
        date.setBounds(271,316,250,16);
        date.setFont(new Font("serif", Font.BOLD,15));
        date.setBackground(new Color(88, 248, 119, 250));
        date.setForeground(new Color(2, 33, 8, 250));
        panel.add(date);


        JLabel labelDeposit = new JLabel("Deposit: ");
        labelDeposit.setBounds(35,359,200,14);
        labelDeposit.setFont(new Font("serif", Font.BOLD,15));
        labelDeposit.setBackground(new Color(88, 248, 119, 250));
        labelDeposit.setForeground(new Color(2, 33, 8, 250));
        panel.add(labelDeposit);
        depositText = new JTextField();
        depositText.setBounds(271,359,150,20);
        depositText.setBackground(new Color(126, 176, 123, 250));
        depositText.setFont(new Font("Tahoma",Font.PLAIN,14));
        depositText.setForeground(new Color(2, 33, 8, 250));
        panel.add(depositText);



        add = new JButton("ADD");
        add.setBounds(100,430,120,30);
        add.setBackground(new Color(126, 176, 123, 250));
        add.setForeground(new Color(2, 33, 8, 250));
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("Back");
        back.setBounds(260,430,120,30);
        back.setBackground(new Color(126, 176, 123, 250));
        back.setForeground(new Color(2, 33, 8, 250));
        back.addActionListener(this);
        panel.add(back);


        setUndecorated(true );
        setLocation(500,150);
        setSize(850,550);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add){
            Room.Con c = new Room.Con();
                String radioBtn = null;
                if(r1.isSelected()){
                    radioBtn = "Male";
                } else if(r2.isSelected()){
                    radioBtn = "Female";
                }
                String s1 = (String) comboBox.getSelectedItem();
                String s2 = numText.getText();
                String s3 = nameText.getText();
                String s4 = radioBtn;
                String s5 = countryText.getText();
                String s6 = c1.getSelectedItem();
                String s7 = date.getText();
                String s8 = depositText.getText();

                try {
                    String q = "insert into customer values ('"+s1+"','"+s2+"', '"+s3+"', '"+s4+"', '"+s5+"', '"+s6+"', '"+s7+"', '"+s8+"' )";
                    String q1 = "update Room set availability = 'Occupied' where roomnumber = "+s6;

                    c.statement.executeUpdate(q);
                    c.statement.executeUpdate(q1);
                    JOptionPane.showMessageDialog(null, "Added successfully");
                }catch (Exception E){
                    E.printStackTrace();
                }

        } else {
            this.setVisible(false);
        }

    }

    public static void main(String ags []){ new NewCustomer(); }

}
