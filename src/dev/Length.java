package dev;

import java.util.Scanner;

public class Length extends CalculateA {
    private byte vFrom;
    private double vValue;
    private final String[] UnitName = {"millimeter [mm]", "centimeter [cm]", "meter [m]", "kilometer [km]", "feet", "yards", "inches", "meters", "miles"};

    Length() {
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
                millimeter();
                break;
            case 2:
                centimeter();
                break;
            case 3:
                meter();
                break;
            case 4:
                kilometer();
                break;
            case 5:
                feet();
                break;
            case 6:
                yards();
                break;
            case 7:
                inches();
                break;
            case 8:
                meter();
                break;
            case 9:
                miles();
                break;
        }
        System.out.println("값이 이상하다 싶으시면 확인해보세요. 오버플로우가 난 것일 수도 있습니다.");
    }

    private void showMenu() {
        for (int i = 0; i < UnitName.length; ++i) {
            System.out.println(i + 1 + ". " + UnitName[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter, ex) 2 32: ");
        this.vFrom = sc.nextByte();
        this.vValue = sc.nextDouble();
    }

    /* 가장 심각한 문제점. 코드의 중복-> 백터로 값을 final로 설정해서 중복을 줄인다. 그럴려면 자바의 벡터 사용법을 알아야 한다... C++이랑 다르다.
    *
    *  Double형까지 밖에 표현하지 못한다는 문제 -> 배열로 값을 표현해야 하는데 이것은 시간이 해결할 일. 딱히 어렵진 않음.*/


    private void millimeter() {
        System.out.println("\n\nINPUT: " + this.vValue + " mm\n");

        System.out.println("centimeter: " + this.vValue * 0.1 + " cm");
        System.out.println("meter: " + this.vValue * 0.001 + " m");
        System.out.println("feet: " + this.vValue * 0.0032808399 + " ft");
        System.out.println("inches: " + this.vValue * 0.0393700787 + " in");
    }

    private void centimeter() {
        System.out.println("\n\nINPUT: " + this.vValue + " cm\n");

        System.out.println("inches: " + this.vValue * 0.3937007874 + " in");
        System.out.println("feet: " + this.vValue * 0.032808399 + " ft");
        System.out.println("meter: " + this.vValue * 0.01 + " m");
        System.out.println("kilometer: " + this.vValue * 0.00001 + " km");
        System.out.println("millimeter: " + this.vValue * 10 + " mm");
    }

    private void kilometer() {
        System.out.println("\n\nINPUT: " + this.vValue + " km\n");

        System.out.println("miles: " + this.vValue * 0.6213711922 + " mi");
        System.out.println("meter: " + this.vValue * 1000 + " m");
        System.out.println("centimeter: " + this.vValue * 100000 + " cm");
    }

    private void feet() {
        System.out.println("\n\nINPUT: " + this.vValue + " ft\n");

        System.out.println("miles: " + this.vValue * 0.0001893939 + " mi");
        System.out.println("meter: " + this.vValue * 0.3048 + " m");
        System.out.println("centimeter: " + this.vValue * 30.48 + " cm");
        System.out.println("inches: " + this.vValue * 12 + " in");
        System.out.println("millimeter: " + this.vValue * 304.8 + " mm");
        System.out.println("yards: " + this.vValue * 0.3333333333 + " yds");
    }

    private void yards() {
        System.out.println("\n\nINPUT: " + this.vValue + " yds\n");

        System.out.println("feet: " + this.vValue * 3 + " ft");
        System.out.println("miles: " + this.vValue * 0.0005681818 + " mi");
        System.out.println("meter: " + this.vValue * 0.9144 + " m");
        System.out.println("inches: " + this.vValue * 36 + " in");
    }

    private void inches() {
        System.out.println("\n\nINPUT: " + this.vValue + " in\n");

        System.out.println("feet: " + this.vValue * 0.0833333333 + " ft");
        System.out.println("meter: " + this.vValue * 0.0254 + " m");
        System.out.println("yards: " + this.vValue * 0.0277777778 + " yds");
        System.out.println("centimeter: " + this.vValue * 2.54 + " cm");
        System.out.println("millimeter: " + this.vValue * 25.4 + " mm");
    }

    private void meter() {
        System.out.println("\n\nINPUT: " + this.vValue + " m\n");

        System.out.println("feet: " + this.vValue * 3.280839895 + " ft");
        System.out.println("yards: " + this.vValue * 1.0936132983 + " yds");
        System.out.println("miles: " + this.vValue * 0.0006213712 + " mi");
        System.out.println("centimeter: " + this.vValue * 100 + " cm");
        System.out.println("inches: " + this.vValue * 39.37007874 + " in");
        System.out.println("millimeter: " + this.vValue * 1000 + " mm");
        System.out.println("kilometer: " + this.vValue * 0.001 + " km");
    }

    private void miles() {
        System.out.println("\n\nINPUT: " + this.vValue + " mi\n");

        System.out.println("kilometer: " + this.vValue * 1.609344 + " km");
        System.out.println("meter: " + this.vValue * 1609.344 + " mm");
        System.out.println("feet: " + this.vValue * 5280 + " ft");
        System.out.println("yards: " + this.vValue * 1760 + " yds");
    }
}
