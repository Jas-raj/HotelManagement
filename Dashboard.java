package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/************After login********/
public class Dashboard extends JFrame implements ActionListener {
    JButton add /*admin*/, rec; //reception

    Dashboard(){
        super("Hotel Management System".toUpperCase());


        rec = new JButton("RECEPTION");
        rec.setBounds(452,510,140,30);
        rec.setFont(new Font("Tahoma",Font.BOLD,15));
        rec.setBackground(new Color(10, 231, 73));
        rec.setForeground(new Color(4, 35, 2));
        rec.addActionListener(this);
        add(rec);



        add = new JButton("ADMIN");
        add.setBounds(880,510,140,30);
        add.setFont(new Font("Tahoma",Font.BOLD,15));
        add.setBackground(new Color(10, 231, 73));
        add.setForeground(new Color(4, 35, 2));
        add.addActionListener(this);
        add(add);

        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/boss.png"));
        Image i2 = i11.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(i2);
        JLabel label1 = new JLabel(imageIcon2);
        label1.setBounds(850,300,200,195);
        add(label1);



        ImageIcon i111 = new ImageIcon(ClassLoader.getSystemResource("icons/Reception.png"));
        Image i22 = i111.getImage().getScaledInstance(200,195, Image.SCALE_DEFAULT);
        ImageIcon imageIcon22 = new ImageIcon(i22);
        JLabel label2 = new JLabel(imageIcon22);
        label2.setBounds(400,300,200,195);
        add(label2);


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/Dashboard.gif"));
        Image i1 = imageIcon.getImage().getScaledInstance(1950,1090, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(0,0,1950,1090);
        add(label);


        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == rec){
            new Reception();
            setVisible(false);
        }else{
            new Login2();
            this.setVisible(false);

        }

    }

    public static void main(String args[]){
        new Dashboard();
    }
}
