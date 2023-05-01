package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{

    JButton next, cancel;
    JTextField tfName;

    Login() {
        // change window bancground color, discard all jframe buildin layout
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // big quiz image left of the window
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 400, 500);
        add(image);

        // Simple mind lable
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(500, 60, 300, 55);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 114, 254));
        add(heading);

        // name lable
        JLabel name = new JLabel("Enter Your Name:");
        name.setBounds(500, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 114, 254)); 
        add(name);

        // name text field
        tfName = new JTextField();
        tfName.setBounds(500, 180, 300, 25);
        tfName.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        add(tfName);

        // next button
        next = new JButton("Next");
        next.setBounds(500, 250, 120, 25);
        next.setBackground(new Color(30, 114, 254));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        // cancle button
        cancel = new JButton("Cancel");
        cancel.setBounds(680, 250, 120, 25);
        cancel.setForeground(Color.WHITE);
        cancel.setBackground(new Color(30, 114, 254));
        cancel.addActionListener(this);
        add(cancel);

        // widndow size, location, visibility
        setSize(900, 500);
        setLocation(225, 100);
        setVisible(true);
    }
    
    // perform action while button clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) {
            String name = tfName.getText();
            setVisible(false);
            new Rules(name);
        } 
        else if (e.getSource() == cancel) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }

}