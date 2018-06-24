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
        Calculate();
    }
    public void Calculate() {
        switch (this.vFrom) {
            case 1:
                CelsiusToFahrenheit();
                break;
            case 2:
                FahrenheitToCelsius();
                break;
        }
        System.out.println("값이 이상하다 싶으시면 확인해보세요. 오버플로우가 난 것일 수도 있습니다.");
    }

    private void showMenu() {
        System.out.println("=== Temperature Converter === \n\n Enter like this: \n\n3 123.2\n\n");
        System.out.println("1. Celsius -> Fahrenheit");
        System.out.println("2. Fahrenheit -> Celius");

        Scanner sc = new Scanner(System.in);
        this.vFrom = sc.nextByte();
        this.vValue = sc.nextDouble();
    }

    private void FahrenheitToCelsius() {
        System.out.println("\n\nINPUT: " + this.vValue + " °F\n");
        // Return False when it's error.

        double CalculatedAns = (this.vValue - 32) / 1.8;

        System.out.println("Result: " + CalculatedAns + " °C\n\n");
    }

    private void CelsiusToFahrenheit() {
        System.out.println("\n\nINPUT: " + this.vValue + " °C\n");

        double CalculatedAns = (this.vValue * 1.8) + 32;

        System.out.println("Result: " + CalculatedAns + " °F\n\n");
    }
}
