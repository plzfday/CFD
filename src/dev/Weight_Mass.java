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
        if (Calculate() == -1) {
            System.out.println("이 값들은 정확하지 않아요!\n현재 기능으로는 이 값을 처리할 수 없습니다. 죄송합니다!");
        }
    }

    public double Calculate() {
        switch (this.vFrom) {
            case 1:
                if (!kg())
                    return -1;
                break;
            case 2:
                if (!g())
                    return -1;
                break;
            case 3:
                if (!lbs())
                    return -1;
                break;
            case 4:
                if (!mg())
                    return -1;
                break;
            case 5:
                if (!oz())
                    return -1;
                break;
        }
        return 0;
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

    private boolean kg() {
        System.out.println("\n\nINPUT: " + this.vValue + " kg\n");
        // Return False when it's error.
        if ((this.vValue * 2.2046226218 > Double.MAX_VALUE || this.vValue * 2.2046226218 < Double.MIN_VALUE) &&
                (this.vValue * 1000 > Double.MAX_VALUE || this.vValue * 1000 < Double.MIN_VALUE) &&
                (this.vValue * 35.27396195 > Double.MAX_VALUE || this.vValue * 35.27396195 < Double.MIN_VALUE))
            return false;

        System.out.println("pound: " + this.vValue * 2.2046226218 + " lbs");
        System.out.println("gram: " + this.vValue * 1000 + " g");
        System.out.println("ounce: " + this.vValue * 35.27396195 + " oz");

        return true;
    }

    private boolean g() {
        System.out.println("\n\nINPUT: " + this.vValue + " g\n");
        // Return False when it's error.
        if ((this.vValue * 0.0352739619 > Double.MAX_VALUE || this.vValue * 0.0352739619 < Double.MIN_VALUE) &&
                (this.vValue * 0.0022046226 > Double.MAX_VALUE || this.vValue * 0.0022046226 < Double.MIN_VALUE) &&
                (this.vValue * 1000 > Double.MAX_VALUE || this.vValue * 1000 < Double.MIN_VALUE) &&
                (this.vValue * 0.001 > Double.MAX_VALUE || this.vValue * 0.001 < Double.MIN_VALUE))
            return false;

        System.out.println("ounce: " + this.vValue * 2.2046226218 + " oz");
        System.out.println("pound: " + this.vValue * 0.0022046226 + " lbs");
        System.out.println("milligram: " + this.vValue * 1000 + " mg");
        System.out.println("kilogram: " + this.vValue * 0.001 + " kg");

        return true;
    }

    private boolean lbs() {
        System.out.println("\n\nINPUT: " + this.vValue + " lbs\n");
        // Return False when it's error.
        if ((this.vValue * 16 > Double.MAX_VALUE || this.vValue * 16 < Double.MIN_VALUE) &&
                (this.vValue * 453.59237 > Double.MAX_VALUE || this.vValue * 453.59237 < Double.MIN_VALUE) &&
                (this.vValue * 0.45359237 > Double.MAX_VALUE || this.vValue * 0.45359237 < Double.MIN_VALUE))
            return false;

        System.out.println("ounce: " + this.vValue * 16 + " oz");
        System.out.println("gram: " + this.vValue * 453.59237 + " g");
        System.out.println("kilogram: " + this.vValue * 0.45359237 + " kg");

        return true;
    }

    private boolean mg() {
        System.out.println("\n\nINPUT: " + this.vValue + " mg\n");
        // Return False when it's error.
        if ((this.vValue * 0.001 > Double.MAX_VALUE || this.vValue * 0.001 < Double.MIN_VALUE))
            return false;

        System.out.println("gram: " + this.vValue * 0.001 + " g");

        return true;
    }

    private boolean oz() {
        System.out.println("\n\nINPUT: " + this.vValue + " oz\n");
        // Return False when it's error.
        if ((this.vValue * 28.349523125 > Double.MAX_VALUE || this.vValue * 28.349523125 < Double.MIN_VALUE) &&
                (this.vValue * 0.0625 > Double.MAX_VALUE || this.vValue * 0.0625 < Double.MIN_VALUE) &&
                (this.vValue * 0.0283495231 > Double.MAX_VALUE || this.vValue * 0.0283495231 < Double.MIN_VALUE))
            return false;

        System.out.println("gram: " + this.vValue * 28.349523125 + " g");
        System.out.println("pound: " + this.vValue * 0.0625 + " lbs");
        System.out.println("kilogram: " + this.vValue * 0.0283495231 + " kg");

        return true;
    }

}