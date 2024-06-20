package Signup;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Customer.Customer;
import Customer.CustomerFactory;

public class Signup {
    private static JLabel id;
    private static JTextField enterId;
    private static JLabel name;
    private static JTextField enterName;
    private static JLabel dob;
    private static JTextField enterDob;
    private static JButton signUp;
    private static JLabel success;
    private static JLabel fail;

    public static void main(String[] args) {
        new Signup().setVisible(true);
    }
    
    public void setVisible(boolean option) {
        JFrame frame2 = new JFrame("Signup to VN Airline");
        frame2.setSize(400, 400);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(null);
        id = new JLabel("Enter your ID");
        id.setBounds(10, 40, 200, 25);
        enterId = new JTextField();
        enterId.setBounds(130, 40, 200, 25);
        name = new JLabel("Enter your name");
        name.setBounds(10, 70, 200, 25);
        enterName = new JTextField();
        enterName.setBounds(130, 70, 200, 25);
        dob = new JLabel("Enter your DOB");
        dob.setBounds(10, 100, 200, 25);
        enterDob = new JTextField();
        enterDob.setBounds(130, 100, 200, 25);
        signUp = new JButton("Sign Up");
        signUp.setBounds(10, 200, 100, 25);
        success = new JLabel();
        success.setBounds(10, 230, 200, 25);
        fail = new JLabel();
        fail.setBounds(10, 230, 200, 25);
        signUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    CustomerFactory profile = new CustomerFactory();
                    Customer newCustomer = profile.getInstance().createProfile(Long.valueOf(enterId.getText()).longValue(), enterName.getText(), enterDob.getText());
                    if (newCustomer.repOk(Long.valueOf(enterId.getText()).longValue(), enterName.getText(), enterDob.getText())) {
                        success.setText("Successful, please wait!");
                        fail.setText("");
                    } else {
                        success.setText("");
                        fail.setText("Something's wrong");
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                    success.setText("");
                    fail.setText("Something's wrong");
                }
            }
        });
                
        panel.add(id);
        panel.add(enterId);
        panel.add(name);
        panel.add(enterName);
        panel.add(dob);
        panel.add(enterDob);
        panel.add(signUp);
        panel.add(success);
        panel.add(fail);
        frame2.add(panel);
        frame2.setVisible(true);
    }
}     