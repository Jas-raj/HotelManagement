package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame implements ActionListener{
    JButton back;
    Reception(){
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(288,5,2000,820);
        panel.setBackground(new Color(247,247,247));
        add(panel);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,278,820);
        panel1.setBackground(new Color(114,136,150));
        add(panel1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/200.gif"));
        Image i2 = i1.getImage().getScaledInstance(600,600,Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(i2);
        JLabel label = new JLabel(imageIcon);
        label.setBounds(300,100,600,600);
        panel.add(label);

//        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icons/login.gif"));
//        Image i4 = i3.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
//        ImageIcon imageIcon1 = new ImageIcon(i4);
//        JLabel label101 = new JLabel(imageIcon1);
//        label101.setBounds(500,430,250,250);
//        panel1.add(label101);


        JButton btnNCF = new JButton("New Customer Form");
        btnNCF.setBounds(30,30,200,30);
        btnNCF.setForeground(new Color(195, 227, 223, 255));
        btnNCF.setBackground(new Color(62,84,99));
        panel1.add(btnNCF);
        btnNCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    new NewCustomer();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnRoom = new JButton("Room");
        btnRoom.setBounds(30,70,200,30);
        btnRoom.setForeground(new Color(195, 227, 223, 255));
        btnRoom.setBackground(new Color(62,84,99));
        panel1.add(btnRoom);
        btnRoom.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Room();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnDepartment = new JButton("Department");
        btnDepartment.setBounds(30,110,200,30);
        btnDepartment.setForeground(new Color(195, 227, 223, 255));
        btnDepartment.setBackground(new Color(62,84,99));
        panel1.add(btnDepartment);
        btnDepartment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Department();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnAEI = new JButton("All Employee Info");
        btnAEI.setBounds(30,150,200,30);
        btnAEI.setForeground(new Color(195, 227, 223, 255));
        btnAEI.setBackground(new Color(62,84,99));
        panel1.add(btnAEI);
        btnAEI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new Employee();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnCI = new JButton("Customer Info");
        btnCI.setBounds(30,190,200,30);
        btnCI.setForeground(new Color(195, 227, 223, 255));
        btnCI.setBackground(new Color(62,84,99));
        panel1.add(btnCI);
        btnCI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{

                    new CustomerInfo();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        JButton btnMI = new JButton("Manager Info");
        btnMI.setBounds(30,230,200,30);
        btnMI.setForeground(new Color(195, 227, 223, 255));
        btnMI.setBackground(new Color(62,84,99));
        panel1.add(btnMI);
        btnMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new ManagerInfo();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnCO = new JButton("Check Out");
        btnCO.setBounds(30,270,200,30);
        btnCO.setForeground(new Color(195, 227, 223, 255));
        btnCO.setBackground(new Color(62,84,99));
        panel1.add(btnCO);
        btnCO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new CheckOut();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnUC = new JButton("Update Check-In Details");
        btnUC.setBounds(30,310,200,30);
        btnUC.setForeground(new Color(195, 227, 223, 255));
        btnUC.setBackground(new Color(62,84,99));
        panel1.add(btnUC);
        btnUC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new UpdateCheck();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnURS = new JButton("Update Room Status");
        btnURS.setBounds(30,350,200,30);
        btnURS.setForeground(new Color(195, 227, 223, 255));
        btnURS.setBackground(new Color(62,84,99));
        panel1.add(btnURS);
        btnURS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new UpdateRoom();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnPUS = new JButton("Pick Up Service");
        btnPUS.setBounds(30,390,200,30);
        btnPUS.setForeground(new Color(195, 227, 223, 255));
        btnPUS.setBackground(new Color(62,84,99));
        panel1.add(btnPUS);
        btnPUS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try{
                    new Pickup();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton btnSR = new JButton("Search Room");
        btnSR.setBounds(30,430,200,30);
        btnSR.setForeground(new Color(195, 227, 223, 255));
        btnSR.setBackground(new Color(62,84,99));
        panel1.add(btnSR);
        btnSR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    new SearchRoom();

                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        back = new JButton("Back");
        back.setBounds(40,700,111,33);
        back.setBackground(new Color(62,84,99));
        back.setForeground(new Color(16, 1, 24, 229));
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.addActionListener(this);
        panel1.add(back);

        getContentPane().setBackground(Color.white);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == back){
            new Dashboard();
            this.setVisible(false);
        }
    }

    public static void main(String args[]){
        new Reception();
    }

}
