
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;

public class Converter {

    public void convert(){

        DecimalFormat df = new DecimalFormat("#.###");
        JFrame frame = new JFrame("Currency Converter");

        JLabel l1,l2;
        JTextField t1, t2;
        JButton b1,b2;

        l1 = new JLabel("Rupee: ");
        l1.setBounds(20,40,60,30);
        t1 = new JTextField(20);
        t1.setBounds(100,40,100,30);

        l2 = new JLabel("Dollar: ");
        l2.setBounds(20,80,60,30);
        t2 = new JTextField(20);
        t2.setBounds(100,80,100,30);

        b1 = new JButton("INR to USD");
        b1.setBounds(20,150,130,30);

        b2 = new JButton("USD to INR");
        b2.setBounds(160,150,130,30);


        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s1 = t1.getText();
                double a = Double.parseDouble(s1);
                double b = a/83.19;
                String s2 = String.valueOf(df.format(b));
                t2.setText(s2);
            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s3 = t2.getText();
                double c = Double.parseDouble(s3);
                double d = c*83.19;
                String s4 = String.valueOf(df.format(d));
                t1.setText(s4);
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        
        frame.add(l1);
        frame.add(l2);
        frame.add(t1);
        frame.add(t2);
        frame.add(b1);
        frame.add(b2);

        frame.setSize(350,250);
        frame.setLayout(null);
        frame.setVisible(true);


    }

}
