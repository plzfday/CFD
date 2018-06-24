package dev;

import java.util.Scanner;

public class Weight_Mass extends CalculateA {
    private byte vFrom;
    private double vValue;
    private final String[] UnitName = {"kilogram", "gram", "pound", "milligram", "ounce"};

    Weight_Mass() {
        vFrom = 0;
        vValue = 0;
    }

    public void Commander() {
        showMenu();
        Calculate();
    }

    public void Calculate() {
        switch (this.vFrom) {
            case 1:
                kg();
                break;
            case 2:
                g();
                break;
            case 3:
                lbs();
                break;
            case 4:
                mg();
                break;
            case 5:
                oz();
                break;
        }
        System.out.println("값이 이상하다 싶으시면 확인해보세요. 오버플로우가 난 것일 수도 있습니다.");
    }

    private void showMenu() {
        for (int i = 0; i < UnitName.length; ++i) {
            System.out.println(i + 1 + ". " + UnitName[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter, ex) 2 3.4: ");
        this.vFrom = sc.nextByte();
        this.vValue = sc.nextDouble();
    }

    private void kg() {
        System.out.println("\n\nINPUT: " + this.vValue + " kg\n");

        System.out.println("pound: " + this.vValue * 2.2046226218 + " lbs");
        System.out.println("gram: " + this.vValue * 1000 + " g");
        System.out.println("ounce: " + this.vValue * 35.27396195 + " oz");
    }

    private void g() {
        System.out.println("\n\nINPUT: " + this.vValue + " g\n");

        System.out.println("ounce: " + this.vValue * 2.2046226218 + " oz");
        System.out.println("pound: " + this.vValue * 0.0022046226 + " lbs");
        System.out.println("milligram: " + this.vValue * 1000 + " mg");
        System.out.println("kilogram: " + this.vValue * 0.001 + " kg");
    }

    private void lbs() {
        System.out.println("\n\nINPUT: " + this.vValue + " lbs\n");

        System.out.println("ounce: " + this.vValue * 16 + " oz");
        System.out.println("gram: " + this.vValue * 453.59237 + " g");
        System.out.println("kilogram: " + this.vValue * 0.45359237 + " kg");
    }

    private void mg() {
        System.out.println("\n\nINPUT: " + this.vValue + " mg\n");

        System.out.println("gram: " + this.vValue * 0.001 + " g");
    }

    private void oz() {
        System.out.println("\n\nINPUT: " + this.vValue + " oz\n");

        System.out.println("gram: " + this.vValue * 28.349523125 + " g");
        System.out.println("pound: " + this.vValue * 0.0625 + " lbs");
        System.out.println("kilogram: " + this.vValue * 0.0283495231 + " kg");
    }

}