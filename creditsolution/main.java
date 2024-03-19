package creditsolution;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        client client = new client();

        System.out.print("Enter ID Number: ");
        client.setIdNumber(scanner.nextInt());

        card card = new card();

        card.setStatus(true);
        card.setCardNumber(45678);

        client.setCard(card);

        client.display();
    }
}

