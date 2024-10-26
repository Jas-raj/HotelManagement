package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class SearchRoom extends JFrame implements ActionListener {
    Choice choice;
    JCheckBox checkbox;

    JButton add,back;
    JTable table;
    SearchRoom(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,690,490);
        panel.setLayout(null);
        panel.setBackground(new Color(88, 248, 119, 250));
        add(panel);

        JLabel label = new JLabel("Search For Rooms");
        label.setBounds(250,11,186,31);
        label.setFont(new Font("Tahoma", Font.BOLD,20));
        label.setForeground(new Color(2, 33, 8, 250));
        panel.add(label);


        checkbox = new JCheckBox("Only display avaliable");
        checkbox.setBounds(400,69,205,31);
        checkbox.setBackground(new Color(88, 248, 119, 250));
        checkbox.setFont(new Font("Tahoma",Font.BOLD,14));
        checkbox.setForeground(new Color(2, 33, 8, 250));
        panel.add(checkbox);

        choice = new Choice();
        choice.add("Single Bed");
        choice.add("Double Bed");
        choice.setBounds(170,70,120,20);
        choice.setBackground(new Color(88, 248, 119, 250));
        choice.setFont(new Font("Tahoma",Font.BOLD,14));
        choice.setForeground(new Color(2, 33, 8, 250));
        panel.add(choice);

        table = new JTable();
        table.setBounds(0,187,700,200);
        table.setBackground(new Color(88, 248, 119, 250));
        table.setForeground(new Color(2, 33, 8, 250));
        panel.add(table);

        try {
            Room.Con c = new Room.Con();
            String q = "Select * from room";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JLabel rbt = new JLabel("Room bed Type");
        rbt.setBounds(50,73,120,25);
        rbt.setFont(new Font("Serif", Font.BOLD,15));
        rbt.setForeground(new Color(2, 33, 8, 250));
        panel.add(rbt);


        JLabel room = new JLabel("Room no.");
        room.setBounds(25,162,80,20);
        room.setFont(new Font("serif", Font.BOLD,14));
        room.setBackground(new Color(88, 248, 119, 250));
        room.setForeground(new Color(2, 33, 8, 250));
        panel.add(room);

        JLabel avaliability = new JLabel("Avaliability");
        avaliability.setBounds(175,162,80,20);
        avaliability.setFont(new Font("serif", Font.BOLD,14));
        avaliability.setBackground(new Color(88, 248, 119, 250));
        avaliability.setForeground(new Color(2, 33, 8, 250));
        panel.add(avaliability);

        JLabel clean = new JLabel("Cleaning Status");
        clean.setBounds(305,162,100,20);
        clean.setFont(new Font("serif", Font.BOLD,14));
        clean.setBackground(new Color(88, 248, 119, 250));
        clean.setForeground(new Color(2, 33, 8, 250));
        panel.add(clean);

        JLabel price = new JLabel("Price");
        price.setBounds(458,162,80,20);
        price.setFont(new Font("serif", Font.BOLD,14));
        price.setBackground(new Color(88, 248, 119, 250));
        price.setForeground(new Color(2, 33, 8, 250));
        panel.add(price);

        JLabel bed = new JLabel("Bed Type");
        bed.setBounds(580,162,80,20);
        bed.setFont(new Font("serif", Font.BOLD,14));
        bed.setBackground(new Color(88, 248, 119, 250));
        bed.setForeground(new Color(2, 33, 8, 250));
        panel.add(bed);


        add = new JButton("SEARCH");
        add.setBounds(200,430,120,28);
        add.setBackground(new Color(126, 176, 123, 250));
        add.setForeground(new Color(2, 33, 8, 250));
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(380,430,120,28);
        back.setBackground(new Color(126, 176, 123, 250));
        back.setForeground(new Color(2, 33, 8, 250));
        back.addActionListener(this);
        panel.add(back);


        setUndecorated(true);
        setLayout(null);
        setLocation(500,200);
        setSize(700,500);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add){
            String Q = "select * from Room where bed_type='"+choice.getSelectedItem()+"'";
            String Q1 = "select * from Room where availability= 'Avaliable' and bed_type = '"+choice.getSelectedItem()+"'";
            try{
                Room.Con c = new Room.Con();
                ResultSet resultSet = c.statement.executeQuery(Q);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));

                if(checkbox.isSelected()){
                    ResultSet resultSet1 = c.statement.executeQuery(Q1);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet1));

                }
            }catch (Exception E){
                E.printStackTrace();
            }

        } else {
            this.setVisible(false);
        }

    }

    public static void main(String args[]){new SearchRoom();}
}
