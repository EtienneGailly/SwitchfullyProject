package advanced.codelab01;

import advanced.codelab01.actions.Deposit;
import advanced.codelab01.actions.Withdraw;
import advanced.codelab01.banking.BankingFacade;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a (very simple) ATM terminal
 * (You don't have to change anything here)
 */
public class AtmMachine {

    private Frame frame;
    private Panel panel;
    private BankingFacade bankFacade;

    public AtmMachine(BankingFacade bankFacade) {
        this.bankFacade = bankFacade;
        createFrame();
        createPanel();
        createComponents()
                .forEach(component -> panel.add(component));
        launchFrame();
    }

    private void launchFrame() {
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(300,300);
    }

    private void createFrame() {
        frame = new Frame("My ATM");
    }

    private void createPanel() {
        panel = new Panel();
        panel.setLayout(new GridLayout(4,4,25,0));
    }

    private List<Component> createComponents() {
        List<Component> components = new ArrayList<>();
        TextField mainTextField = createTextField("0", Color.lightGray);
        Label mainLabel = new Label("Your current balance: " + getSafeBalance());
        components.add(createButton("Withdraw", Color.yellow, new Withdraw(bankFacade, mainTextField, mainLabel)));
        components.add(createButton("Deposit", Color.green, new Deposit(bankFacade, mainTextField, mainLabel)));
        components.add(mainLabel);
        components.add(mainTextField);
        return components;
    }

    private double getSafeBalance() {
        if(bankFacade != null) {
            return bankFacade.getBalance();
        }
        return -1;
    }

    private TextField createTextField(String text, Color color) {
        TextField txt = new TextField(4);
        txt.setBackground(color);
        txt.setText(text);
        txt.setFont(new Font("Verdana", Font.BOLD, 48));
        txt.setForeground(Color.BLUE);
        return txt;
    }

    private Button createButton(String label, Color color, ActionListener listener) {
        Button withdraw = new Button(label);
        withdraw.setBackground(color);
        withdraw.addActionListener(listener);
        return withdraw;
    }


}
