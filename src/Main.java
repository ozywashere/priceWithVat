import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter price: ");
        double price = input.nextDouble();
        System.out.println("Price: " + price + "$");

        System.out.println("Enter vat rate: ");
        double vatRate = input.nextDouble();
        vatRate /=  100;

        System.out.println("Vat Rate: " + vatRate + "%");

        double vatAmount = price * vatRate;

        System.out.println("Vat Amount: " + vatAmount + "$" );

        double priceWithVat = price + vatAmount;

        System.out.println("Price with Vat: " + priceWithVat + "$");
        }
    }
