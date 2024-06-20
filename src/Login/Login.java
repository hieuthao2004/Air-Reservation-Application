package Login;

import javax.swing.*;

import Signup.Signup;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private static JLabel header;
    private static JLabel username;
    private static JTextField enterUsername;
    private static JLabel password;
    private static JTextField enterPassword;
    private static JButton submit;
    private static JLabel error;
    private static JLabel success;
    private static JLabel createAccount;
    private static JButton signup;
    public static void main(String[] args) {        
        JFrame frame = new JFrame("VN Airline");
        frame.setSize(400, 400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Contain username and password
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        header = new JLabel("Login");
        header.setBounds(10, 10, 400, 25);
        header.setHorizontalAlignment(JLabel.CENTER);
        username = new JLabel("Username");
        username.setBounds(10, 50, 250, 25);
        enterUsername = new JTextField();
        enterUsername.setBounds(80, 50, 200, 25);
        password = new JLabel("Password");
        password.setBounds(10, 100, 250, 25);
        enterPassword = new JTextField();
        enterPassword.setBounds(80, 100, 200, 25);
        submit = new JButton("Ok");
        submit.setBounds(10, 130, 50, 25);
        submit.setForeground(Color.RED);
        error = new JLabel();
        error.setBounds(0, 160, 200, 25);
        error.setHorizontalAlignment(JLabel.CENTER);
        success = new JLabel();
        success.setBounds(0, 160, 200, 25);
        success.setHorizontalAlignment(JLabel.CENTER);
        //Contain signup option
        JPanel panel2 = new JPanel();
        panel2.setBorder(BorderFactory.createLineBorder(Color.black));
        createAccount = new JLabel("Don't have an account yet?");
        createAccount.setBounds(10, 180, 100, 25);
        signup = new JButton("Signup");
        signup.setBounds(10, 200, 050, 25);
        frame.setLayout(new GridLayout(0, 1));

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = enterUsername.getText();
                String password = enterPassword.getText();
                if (username.equals("Admin") && password.equals("123")) {
                    success.setText("Login successful");
                } else {
                    error.setText("Wrong password or username");
                }
            }
        });

        signup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                frame.setVisible(false);
                new Signup().setVisible(true);
            }
        });

        panel1.add(header);
        panel1.add(username);
        panel1.add(enterUsername);
        panel1.add(password);
        panel1.add(enterPassword);
        panel1.add(error);
        panel1.add(success);
        panel1.add(submit);
        panel2.add(createAccount);
        panel2.add(signup);
        frame.add(panel1);
        frame.add(panel2);
        frame.setVisible(true);
    }
}