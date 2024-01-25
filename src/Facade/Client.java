package Facade;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        ShopKeeper sk = new ShopKeeper();
        do {
            String menu = """
                    ========= Mobile Shop ============
                              1. IPHONE
                              2. SAMSUNG
                              3. BLACKBERRY
                              4. Exit
                            Enter your choice:
                    """;
            System.out.println(menu);
            int item = scanner.nextInt();

            switch (item) {
                case 1 -> sk.iphoneSale();
                case 2 -> sk.samsungSale();
                case 3 -> sk.blackberrySale();
                case 4 -> System.exit(0);
                default -> System.out.println("Nothing You purchased");
            }
        } while (true);
    }
}  