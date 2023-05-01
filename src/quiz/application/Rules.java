package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton back, start;
    Rules(String name){
        this.name = name;
        // change window bancground color, discard all jframe buildin layout
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // welcome lable
        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(100, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 114, 254));
        add(heading);
        
        // rules
        JLabel rules = new JLabel();
        rules.setBounds(20, 50, 700, 400);
        rules.setFont(new Font("Tohoma", Font.PLAIN, 14));
        rules.setText(
            "<html>" +
                    "1. You are trained to be a programmer and not a story teller, answer point to point"
                    + "<br><br>" +
                    "2. Do not unnecessarily smile at the person sitting back to you, they may also not know the answer"
                    + "<br><br>" +
                    "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>"
                    +
                    "4. Crying is allowed but please do so quietly." + "<br><br>" +
                    "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                    "6. Do not get nervous if your friend is answering more questions, may be he/she is throwing darts in the dark"
                    + "<br><br>" +
                    "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                    "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
                    "<html>"
        );
        add(rules);

        // back button
        back = new JButton("Back");
        back.setBounds(300, 400, 120, 25);
        back.setBackground(new Color(30, 114, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        // start button
        start = new JButton("Start");
        start.setBounds(480, 400, 120, 25);
        start.setForeground(Color.WHITE);
        start.setBackground(new Color(30, 114, 254));
        start.addActionListener(this);
        add(start);

        // widndow size, location, visibility
        setSize(900, 500);
        setLocation(225, 100);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == back) {
            setVisible(false);
            new Login();
        }
        else if (e.getSource() == start) {
            setVisible(false);
            new Quiz();
        }
    }

    public static void main(String[] args) {
        new Rules("Atik");
    }

}
