package creditsolution;

public class card {
    private int cardNumber;
    private double balance;
    private int pin;
    private boolean status;

    public card() {
    }

    public card(int cardNumber, double balance, int pin, boolean status) {
        this.cardNumber = cardNumber;
        this.balance = balance;
        this.pin = pin;
        this.status = status;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void display() {
        System.out.println("card Information:");
        System.out.println("card Number: " + cardNumber);
        System.out.println("Balance: " + balance);
        System.out.println("PIN: " + pin);
        System.out.println("Status: " + status);
    }
}
