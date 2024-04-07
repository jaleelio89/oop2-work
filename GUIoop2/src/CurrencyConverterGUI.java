//jaleel forsythe id 2017002533//
//Mikado Meikle id 2017000955//
//Errol Greenland id 2017001595//
// brian Davis id 2017001804//
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConverterGUI extends JFrame {
    private JPanel panel;
    private JComboBox<String> currencyComboBox;
    private JTextField inputField;
    private JTextField resultField;
    private JButton convertButton;
    private JButton clearButton;

    private final double US_RATE = 129.02;
    private final double CAN_RATE = 97.50;
    private final double EURO_RATE = 164.33;

    public CurrencyConverterGUI() {
        setTitle("Currency Converter");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel = new JPanel();
        add(panel);
        placeComponents();

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertCurrency();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });
    }

    private void placeComponents() {
        panel.setLayout(null);

        JLabel currencyLabel = new JLabel("Select Currency:");
        currencyLabel.setBounds(10, 20, 120, 25);
        panel.add(currencyLabel);

        currencyComboBox = new JComboBox<>(new String[]{"US", "Canadian", "Euro"});
        currencyComboBox.setBounds(140, 20, 120, 25);
        panel.add(currencyComboBox);

        JLabel inputLabel = new JLabel("Input $:");
        inputLabel.setBounds(10, 50, 120, 25);
        panel.add(inputLabel);

        inputField = new JTextField(10);
        inputField.setBounds(140, 50, 120, 25);
        panel.add(inputField);

        JLabel resultLabel = new JLabel("JMD Amount $:");
        resultLabel.setBounds(10, 80, 120, 25);
        panel.add(resultLabel);

        resultField = new JTextField(10);
        resultField.setBounds(140, 80, 120, 25);
        resultField.setEditable(false);
        panel.add(resultField);

        convertButton = new JButton("Convert");
        convertButton.setBounds(40, 120, 100, 25);
        panel.add(convertButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(150, 120, 100, 25);
        panel.add(clearButton);
    }

    private void convertCurrency() {
        String currency = (String) currencyComboBox.getSelectedItem();
        String inputText = inputField.getText();

        if (inputText.isEmpty() || !inputText.matches("^\\d*\\.?\\d+$")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid numerical amount", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double amount = Double.parseDouble(inputText);
        double convertedAmount = 0;

        switch (currency) {
            case "US":
                convertedAmount = amount * US_RATE;
                break;
            case "Canadian":
                convertedAmount = amount * CAN_RATE;
                break;
            case "Euro":
                convertedAmount = amount * EURO_RATE;
                break;
        }

        resultField.setText(String.format("%.2f", convertedAmount));
    }

    private void clearFields() {
        inputField.setText("");
        resultField.setText("");
        currencyComboBox.setSelectedIndex(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CurrencyConverterGUI().setVisible(true);
            }
        });
    }
}
