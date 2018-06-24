package dev;

import java.util.Scanner;

public class Celsius_Fahrenheit extends CalculateA {
    private byte vFrom;
    private double vValue;

    Celsius_Fahrenheit() {
        this.vFrom = 0;
        this.vValue = 0;
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
                if(!CelsiusToFahrenheit())
                    return -1;
                break;
            case 2:
                if(!FahrenheitToCelsius())
                    return -1;
                break;
        }
        return 0;
    }

    private void showMenu() {
        System.out.println("=== Temperature Converter === \n\n Enter like this: \n\n3 123.2\n\n");
        System.out.println("1. Celsius -> Fahrenheit");
        System.out.println("2. Fahrenheit -> Celius");

        Scanner sc = new Scanner(System.in);
        this.vFrom = sc.nextByte();
        this.vValue = sc.nextDouble();
    }

    private boolean FahrenheitToCelsius() {
        System.out.println("\n\nINPUT: " + this.vValue + " °F\n");
        // Return False when it's error.

        double CalculatedAns = (this.vValue - 32) / 1.8;

        if ((CalculatedAns > Double.MAX_VALUE || CalculatedAns < Double.MIN_VALUE))
            return false;

        System.out.println("Result: " + CalculatedAns + " °C\n\n");

        return true;
    }

    private boolean CelsiusToFahrenheit() {
        System.out.println("\n\nINPUT: " + this.vValue + " °C\n");

        double CalculatedAns = (this.vValue * 1.8) + 32;

        // Return False when it's error.
        if ((CalculatedAns > Double.MAX_VALUE || CalculatedAns < Double.MIN_VALUE))
            return false;

        System.out.println("Result: " + CalculatedAns + " °F\n\n");

        return true;
    }
}
