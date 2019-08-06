import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int clients = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0.0;

        for (int i = 0; i < clients; i++)
        {
            String command = scanner.nextLine();
            double price = 0.0;
            int productCount = 0;
            while (!command.equals("Finish"))
            {
                productCount++;
                switch (command)
                {
                    case "basket":
                        price += 1.50;
                        break;
                    case "wreath":
                        price += 3.80;
                        break;
                    case "chocolate bunny":
                        price += 7;
                        break;
                }
                command = scanner.nextLine();
            }
            if (productCount % 2 == 0)
            {
                double discount = price * 0.2;
                price -= discount;
            }
            System.out.printf("You purchased %d items for %.2f leva.%n", productCount, price);
            totalPrice += price;
        }
        System.out.printf("Average bill per client is: %.2f leva.", totalPrice / clients);
    }

    }

