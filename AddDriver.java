package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddDriver extends JFrame implements ActionListener {
    JTextField nameText, ageText, carCText, carNText, locText;

    JComboBox genComboBox,avaCombo;

    JButton add,back;
    AddDriver(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setBackground(new Color(88, 248, 119, 250));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("ADD DRIVERS");
        label.setBounds(194,10,200,22);
        label.setFont(new Font("Tahoma", Font.BOLD,22));
        label.setForeground(new Color(2, 33, 8, 250));
        panel.add(label);



        JLabel name = new JLabel("Name");
        name.setBounds(64,70,102,22);
        name.setFont(new Font("serif", Font.BOLD,20));
        name.setForeground(new Color(2, 33, 8, 250));
        panel.add(name);

        nameText = new JTextField();
        nameText.setBounds(174,70,150,22);
        nameText.setBackground(new Color(126, 176, 123, 250));
        nameText.setFont(new Font("Tahoma",Font.BOLD,14));
        nameText.setForeground(new Color(2, 33, 8, 250));
        nameText.setBorder(null);
        panel.add(nameText);



        JLabel age = new JLabel("AGE");
        age.setBounds(64,110,150,22);
        age.setFont(new Font("serif", Font.BOLD,20));
        age.setForeground(new Color(2, 33, 8, 250));
        panel.add(age);

        ageText = new JTextField();
        ageText.setBounds(174,110,150,27);
        ageText.setBackground(new Color(126, 176, 123, 250));
        ageText.setFont(new Font("serif",Font.BOLD,20));
        ageText.setForeground(new Color(2, 33, 8, 250));
        ageText.setBorder(null);
        panel.add(ageText);



        JLabel gender = new JLabel("Gender");
        gender.setBounds(64,150,150,27);
        gender.setBackground(new Color(126, 176, 123, 250));
        gender.setFont(new Font("serif",Font.BOLD,20));
        gender.setForeground(new Color(2, 33, 8, 250));
        gender.setBorder(null);
        panel.add(gender);

        genComboBox = new JComboBox(new String[]{"Male", "Female"});
        genComboBox.setBounds(176,150,154,20);
        genComboBox.setFont(new Font("serif",Font.BOLD,18));
        genComboBox.setBackground(new Color(126, 176, 123, 250));
        genComboBox.setForeground(new Color(2, 33, 8, 250));
        genComboBox.setBorder(null);
        panel.add(genComboBox);



        JLabel carC = new JLabel("Car Company");
        carC.setBounds(40, 190, 200, 27);
        carC.setFont(new Font("serif", Font.BOLD, 20));
        carC.setBackground(new Color(126, 176, 123, 250));
        carC.setForeground(new Color(2, 33, 8, 250));
        carC.setBorder(null);
        panel.add(carC);

        carCText = new JTextField();
        carCText.setBounds(174,190,150,27);
        carCText.setBackground(new Color(126, 190, 123, 250));
        carCText.setFont(new Font("serif",Font.BOLD,20));
        carCText.setForeground(new Color(2, 33, 8, 250));
        carCText.setBorder(null);
        panel.add(carCText);

        JLabel carN = new JLabel("Car Name");
        carN.setBounds(64, 230, 150, 27);
        carN.setFont(new Font("serif", Font.BOLD, 20));
        carN.setBackground(new Color(126, 176, 123, 250));
        carN.setForeground(new Color(2, 33, 8, 250));
        carN.setBorder(null);
        panel.add(carN);

        carNText = new JTextField();
        carNText.setBounds(174, 230, 150, 27);
        carNText.setBackground(new Color(126, 176, 123, 250));
        carNText.setFont(new Font("serif",Font.BOLD,20));
        carNText.setForeground(new Color(2, 33, 8, 250));
        carNText.setBorder(null);
        panel.add(carNText);


        JLabel avaliable = new JLabel("Avaliable");
        avaliable.setBounds(64,270,150,27);
        avaliable.setBackground(new Color(126, 176, 123, 250));
        avaliable.setFont(new Font("serif",Font.BOLD,20));
        avaliable.setForeground(new Color(2, 33, 8, 250));
        avaliable.setBorder(null);
        panel.add(avaliable);

        avaCombo = new JComboBox(new String[]{"Yes", "No"});
        avaCombo.setBounds(176,270,154,20);
        avaCombo.setFont(new Font("serif",Font.BOLD,18));
        avaCombo.setBackground(new Color(126, 176, 123, 250));
        avaCombo.setForeground(new Color(2, 33, 8, 250));
        avaCombo.setBorder(null);
        panel.add(avaCombo);




        JLabel location = new JLabel("Location");
        location.setBounds(64, 310, 150, 27);
        location.setFont(new Font("serif", Font.BOLD, 20));
        location.setBackground(new Color(126, 176, 123, 250));
        location.setForeground(new Color(2, 33, 8, 250));
        location.setBorder(null);
        panel.add(location);

        locText = new JTextField();
        locText.setBounds(174, 310 , 150, 27);
        locText.setBackground(new Color(126, 176, 123, 250));
        locText.setFont(new Font("serif",Font.BOLD,20));
        locText.setForeground(new Color(2, 33, 8, 250));
        locText.setBorder(null);
        panel.add(locText);



        add = new JButton("Add");
        add.setBounds(64,390,111,33);
        add.setBackground(new Color(126, 176, 123, 250));
        add.setForeground(new Color(2, 33, 8, 250));
        add.setFont(new Font("Tahoma",Font.BOLD,15));
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("Back");
        back.setBounds(198,390,111,33);
        back.setBackground(new Color(126, 176, 123, 250));
        back.setForeground(new Color(2, 33, 8, 250));
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/license.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(500,60,300,300);
        panel.add(label1);



        setUndecorated(true);
        setLocation(20,200);
        setLayout(null);
        setSize(900,500);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add){
            String name = nameText.getText();
            String age = ageText.getText();
            String gender = (String) genComboBox.getSelectedItem();
            String company = carCText.getText();
            String carname = carNText.getText();
            String available = (String) avaCombo.getSelectedItem();
            String location = locText.getText();

            try{
                Room.Con c = new Room.Con();
                String q = "insert into driver values('"+name+"', '"+age+"', '"+gender+"', '"+company+"', '"+carname+"', '"+available+"', '"+location+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Driver Addded");
                this.setVisible(false);
            }catch (Exception E){
                E.printStackTrace();
            }
        }else if(e.getSource() == back){
            new Admin();
            this.setVisible(false);
        }
    }

    public static void main(String args[]){
        new AddDriver();
    }
}
