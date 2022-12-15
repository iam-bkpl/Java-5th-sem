import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PaymentMethod {
    PaymentMethod() {
        JFrame frame = new JFrame("Food Ordering System - Payment");
        JLabel lblTitle = new JLabel("Choose Your payment Method");
        JLabel lblResult = new JLabel("");
        JLabel lblBlank = new JLabel("");

        ButtonGroup bgPayment = new ButtonGroup();
        JRadioButton rbCreditCard = new JRadioButton("Credit Card");
        JRadioButton rbWallet = new JRadioButton("Wallet");
        JRadioButton rbBankTransfer = new JRadioButton("Bank Transer");
        JRadioButton rbCashOnDelivery = new JRadioButton("Casn On Delivery");

        bgPayment.add(rbCreditCard);
        bgPayment.add(rbWallet);
        bgPayment.add(rbBankTransfer);
        bgPayment.add(rbCashOnDelivery);
        JButton btnOK = new JButton("OK");

        JPanel pnlMain = new JPanel();
        JPanel pnlTitle = new JPanel();
        JPanel pnlResult = new JPanel();

        pnlTitle.add(lblTitle);
        pnlMain.add(rbCreditCard);
        pnlMain.add(rbWallet);
        pnlMain.add(rbBankTransfer);
        pnlMain.add(rbCashOnDelivery);
        pnlMain.add(btnOK);
        pnlMain.add(lblBlank);

        pnlResult.add(lblResult);

        pnlTitle.setLayout(new FlowLayout());
        pnlMain.setLayout(new GridLayout(3, 2));
        pnlResult.setLayout(new FlowLayout());

        frame.add(pnlTitle);
        frame.add(pnlMain);
        frame.add(pnlResult);
        frame.setSize(400, 350);
        frame.setLayout(new GridLayout(3, 1));
        frame.setVisible(true);

        btnOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (rbCreditCard.isSelected()) {
                    lblResult.setText("You have selected Credit Card");
                }
                if (rbBankTransfer.isSelected()) {
                    lblResult.setText("You have selected Bank Transfer");
                }
                if (rbWallet.isSelected()) {
                    lblResult.setText("You have selected Wallet");
                }
                if (rbCashOnDelivery.isSelected()) {
                    lblResult.setText("You have selected Cash on Delivery");
                }

            }
        });
    }

    public static void main(String[] args) {
        new PaymentMethod();
    }
}
