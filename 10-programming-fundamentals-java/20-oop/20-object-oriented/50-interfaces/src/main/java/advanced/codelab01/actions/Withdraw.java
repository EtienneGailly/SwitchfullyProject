package advanced.codelab01.actions;

import advanced.codelab01.banking.BankingFacade;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Withdraw implements ActionListener {

    private BankingFacade bankFacade;
    private TextField getValueField;
    private Label setValueLabel;

    public Withdraw(BankingFacade bankFacade, TextField getValueField, Label setValueLabel) {
        this.bankFacade = bankFacade;
        this.getValueField = getValueField;
        this.setValueLabel = setValueLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            setValueLabel.setText(
                    String.format("Your total balance: %s",
                            bankFacade.withdraw(getValueField.getText())));
        } catch (IllegalArgumentException illegalArgumentException) {
            JOptionPane.showMessageDialog(null, "Illegal amount", illegalArgumentException.getMessage(), JOptionPane.WARNING_MESSAGE);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(null, "Oh ow...", "Something went wrong. Please contact the developer :)", JOptionPane.ERROR_MESSAGE);
        }
    }
}
