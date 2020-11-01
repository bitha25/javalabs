package com.company;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        JOptionPane.showMessageDialog(
                frame,
                "Welcome to Carly's Catering"
        );
        CateringService cateringService = new CateringService();

        int nrInvitati = Integer.parseInt(JOptionPane.showInputDialog(
                frame,
                "How many people do you have on the event?",
                "Carly's Catering",
                JOptionPane.INFORMATION_MESSAGE));
        cateringService.setNrInvitati(nrInvitati);

    JOptionPane.showMessageDialog(
            frame,
            "Number of participants:" + cateringService.getNrInvitati(),
            "Carly's Catering",
            JOptionPane.INFORMATION_MESSAGE
    );
    JOptionPane.showMessageDialog(
                frame,
                "Total price:" + cateringService.totalPrice()+"$",
            "Carly's Catering",
            JOptionPane.INFORMATION_MESSAGE
    );
    JOptionPane.showMessageDialog(
                frame,
                "Big event:" + cateringService.bigEvent(),
            "Carly's Catering",
            JOptionPane.INFORMATION_MESSAGE
    );
    }
}
