package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddEmployee extends JFrame implements ActionListener {
    JTextField nametext, ageText, salaryText,phoneText, adhaarText,emailText;

    JRadioButton radioButtonM, radioButtonF;

    JComboBox comboBox;

    JButton add,back;
    public AddEmployee(){


        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,520);
        panel.setLayout(null);
        panel.setBackground(new Color(88, 248, 119, 250));
        add(panel);


        JLabel label = new JLabel("ADD EMPLOYEE DETAILS");
        label.setBounds(480,24,445,35);
        label.setFont(new Font("Tahoma", Font.BOLD,28));
        label.setForeground(new Color(2, 33, 8, 250));
        panel.add(label);

        JLabel name = new JLabel("NAME");
        name.setBounds(60,30,150,27);
        name.setFont(new Font("serif", Font.BOLD,17));
        name.setForeground(new Color(2, 33, 8, 250));
        panel.add(name);

        nametext = new JTextField();
        nametext.setBounds(200,30,150,27);
        nametext.setBackground(new Color(126, 176, 123, 250));
        nametext.setFont(new Font("Tahoma",Font.BOLD,14));
        nametext.setForeground(new Color(2, 33, 8, 250));
        panel.add(nametext);



        JLabel age = new JLabel("AGE");
        age.setBounds(60,80,150,27);
        age.setFont(new Font("serif", Font.BOLD,17));
        age.setForeground(new Color(2, 33, 8, 250));
        panel.add(age);

        ageText = new JTextField();
        ageText.setBounds(200,80,150,27);
        ageText.setBackground(new Color(126, 176, 123, 250));
        ageText.setFont(new Font("Tahoma",Font.BOLD,14));
        ageText.setForeground(new Color(2, 33, 8, 250));
        panel.add(ageText);


        JLabel gender = new JLabel("Gender");
        gender.setBounds(60,120,150,27);
        gender.setFont(new Font("serif", Font.BOLD,17));
        gender.setForeground(new Color(2, 33, 8, 250));
        panel.add(gender);

        radioButtonM = new JRadioButton("Male");
        radioButtonM.setBounds(200,120,70,27);
        radioButtonM.setBackground(new Color(88, 248, 119, 250));
        radioButtonM.setFont(new Font("Tahoma",Font.BOLD,14));
        radioButtonM.setForeground(new Color(2, 33, 8, 250));
        panel.add(radioButtonM);

        radioButtonF = new JRadioButton("Female");
        radioButtonF.setBounds(280,120,100,27);
        radioButtonF.setBackground(new Color(88, 248, 119, 250));
        radioButtonF.setFont(new Font("Tahoma",Font.BOLD,14));
        radioButtonF.setForeground(new Color(2, 33, 8, 250));
        panel.add(radioButtonF);

        JLabel job = new JLabel("Job");
        job.setBounds(60,170,150,27);
        job.setFont(new Font("serif", Font.BOLD,17));
        job.setForeground(new Color(2, 33, 8, 250));
        panel.add(job);

        comboBox = new JComboBox(new String[]{"Front Desk", "House", "Kitchen Staff", "Room Service", "Manager", "Accountant", "Chef"});
        comboBox.setBounds(200,170,150,30);
        comboBox.setBackground(new Color(126, 176, 123, 250));
        comboBox.setFont(new Font("Tahoma",Font.BOLD,14));
        comboBox.setForeground(new Color(2, 33, 8, 250));
        panel.add(comboBox);


        JLabel salary = new JLabel("Salary");
        salary.setBounds(60,220,150,27);
        salary.setFont(new Font("serif", Font.BOLD,17));
        salary.setForeground(new Color(2, 33, 8, 250));
        panel.add(salary);

        salaryText = new JTextField();
        salaryText.setBounds(200,220,150,27);
        salaryText.setBackground(new Color(126, 176, 123, 250));
        salaryText.setFont(new Font("Tahoma",Font.BOLD,14));
        salaryText.setForeground(new Color(2, 33, 8, 250));
        panel.add(salaryText);


        JLabel phone = new JLabel("Phone");
        phone.setBounds(60,270,150,27);
        phone.setFont(new Font("serif", Font.BOLD,17));
        phone.setForeground(new Color(2, 33, 8, 250));
        panel.add(phone);

        phoneText = new JTextField();
        phoneText.setBounds(200,270,150,27);
        phoneText.setBackground(new Color(126, 176, 123, 250));
        phoneText.setFont(new Font("Tahoma",Font.BOLD,14));
        phoneText.setForeground(new Color(2, 33, 8, 250));
        panel.add(phoneText);


        JLabel adhaar = new JLabel("Adhaar");
        adhaar.setBounds(60,320,150,27);
        adhaar.setFont(new Font("serif", Font.BOLD,17));
        adhaar.setForeground(new Color(2, 33, 8, 250));
        panel.add(adhaar);

        adhaarText = new JTextField();
        adhaarText.setBounds(200,320,150,27);
        adhaarText.setBackground(new Color(126, 176, 123, 250));
        adhaarText.setFont(new Font("Tahoma",Font.BOLD,14));
        adhaarText.setForeground(new Color(2, 33, 8, 250));
        panel.add(adhaarText);

        JLabel email = new JLabel("E-mail");
        email.setBounds(60,370,150,27);
        email.setFont(new Font("serif", Font.BOLD,17));
        email.setForeground(new Color(2, 33, 8, 250));
        panel.add(email);

        emailText = new JTextField();
        emailText.setBounds(200,370,150,27);
        emailText.setBackground(new Color(126, 176, 123, 250));
        emailText.setFont(new Font("Tahoma",Font.BOLD,14));
        emailText.setForeground(new Color(2, 33, 8, 250));
        panel.add(emailText);

        add = new JButton("ADD");
        add.setBounds(80,420,100,30);
        add.setBackground(new Color(126, 176, 123, 250));
        add.setForeground(new Color(2, 33, 8, 250));
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("Back");
        back.setBounds(200,420,100,30);
        back.setBackground(new Color(126, 176, 123, 250));
        back.setForeground(new Color(2, 33, 8, 250));
        back.addActionListener(this);
        panel.add(back);



        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/addemp.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(500,100,300,300);
        panel.add(label1);


        setUndecorated(true);
        setLocation(60,160);
        setLayout(null);
        setSize(900,530);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add){
            String name = nametext.getText();
            String age = ageText.getText();
            String salary = salaryText.getText();
            String phone = phoneText.getText();
            String email = emailText.getText();
            String adhaar = adhaarText.getText();
            String job = (String) comboBox.getSelectedItem();
            String gender = null;
            if(radioButtonM.isSelected()){
                gender = "Male";
            } else if(radioButtonF.isSelected()){
                gender = "Female";
            }
            try{
                Room.Con c = new Room.Con();
                String q = "insert into Employee values('"+name+"', '"+age+"', '"+gender+"', '"+job+"', '"+salary+"','"+phone+"','"+email+"','"+adhaar+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Employee Added");
                setVisible(false);
            }catch (Exception E){
                E.printStackTrace();
            }

        } else {
            setVisible(false);
        }
    }

    public static void main(String args[]){
        new AddEmployee();
    }

}
