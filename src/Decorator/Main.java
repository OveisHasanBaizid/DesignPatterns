package Decorator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            String menu = """
                    ============ Food Menu ============
                             1. Vegetarian Food
                             2. Non-Vegetarian Food
                             3. Chinese Food
                             4. Exit
                           Enter your choice:
                    """;
            System.out.println(menu);
            int item = input.nextInt();
            switch (item) {
                case 1 -> {
                    VegFood vf = new VegFood();
                    System.out.println(vf.prepareFood());
                    System.out.println(vf.foodPrice());
                }
                case 2 -> {
                    Food f1 = new NonVegFood(new VegFood());
                    System.out.println(f1.prepareFood());
                    System.out.println(f1.foodPrice());
                }
                case 3 -> {
                    Food f2 = new ChineseFood(new VegFood());
                    System.out.println(f2.prepareFood());
                    System.out.println(f2.foodPrice());
                }
                case 4 -> System.exit(0);
                default -> System.out.println("Other than these no food available");

            }
        } while (true);
    }
}

