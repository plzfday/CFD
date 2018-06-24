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
        if (Calculate() == -1) {
            System.out.println("이 값들은 정확하지 않아요!\n현재 기능으로는 이 값을 처리할 수 없습니다. 죄송합니다!");
        }
    }

    public double Calculate() {
        switch (this.vFrom) {
            case 1:
                if (!millimeter())
                    return -1;
                break;
            case 2:
                if(!centimeter())
                    return -1;
                break;
            case 3:
                if(!meter())
                    return -1;
                break;
            case 4:
                if(!kilometer())
                    return -1;
                break;
            case 5:
                if(!feet())
                    return -1;
                break;
            case 6:
                if(!yards())
                    return -1;
                break;
            case 7:
                if(!inches())
                    return -1;
                break;
            case 8:
                if(!meter())
                    return -1;
                break;
            case 9:
                if(!miles())
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
        System.out.print("Enter, ex) 2 32: ");
        this.vFrom = sc.nextByte();
        this.vValue = sc.nextDouble();
    }

    /* 가장 심각한 문제점. 코드의 중복-> 백터로 값을 final로 설정해서 중복을 줄인다. 그럴려면 자바의 벡터 사용법을 알아야 한다... C++이랑 너무 다르다.
    *
    *  Double형까지 밖에 표현하지 못한다는 문제 -> 배열로 값을 표현해야 하는데 이것은 시간이 해결할 일. 딱히 어렵진 않음.*/


    private boolean millimeter() {
        System.out.println("\n\nINPUT: " + this.vValue + " mm\n");
        // Return False when it's error.
        if ((this.vValue * 0.1 > Double.MAX_VALUE || this.vValue * 0.1 < Double.MIN_VALUE) &&
                (this.vValue * 0.001 > Double.MAX_VALUE || this.vValue * 0.001 < Double.MIN_VALUE) &&
                (this.vValue * 0.0032808399 > Double.MAX_VALUE || this.vValue * 0.0032808399 < Double.MIN_VALUE) &&
                (this.vValue * 0.0393700787 > Double.MAX_VALUE || this.vValue * 0.0393700787 < Double.MIN_VALUE))
            return false;

        System.out.println("centimeter: " + this.vValue * 0.1 + " cm");
        System.out.println("meter: " + this.vValue * 0.001 + " m");
        System.out.println("feet: " + this.vValue * 0.0032808399 + " ft");
        System.out.println("inches: " + this.vValue * 0.0393700787 + " in");

        return true;
    }

    private boolean centimeter() {
        System.out.println("\n\nINPUT: " + this.vValue + " cm\n");
        // Return False when it's error.
        if ((this.vValue * 0.3937007874 > Double.MAX_VALUE || this.vValue * 0.3937007874 < Double.MIN_VALUE) &&
                (this.vValue * 0.032808399 > Double.MAX_VALUE || this.vValue * 0.032808399 < Double.MIN_VALUE) &&
                (this.vValue * 0.01 > Double.MAX_VALUE || this.vValue * 0.01 < Double.MIN_VALUE) &&
                (this.vValue * 0.00001 > Double.MAX_VALUE || this.vValue * 0.00001 < Double.MIN_VALUE) &&
                (this.vValue * 10 > Double.MAX_VALUE || this.vValue * 10 < Double.MIN_VALUE))
            return false;

        System.out.println("inches: " + this.vValue * 0.3937007874 + " in");
        System.out.println("feet: " + this.vValue * 0.032808399 + " ft");
        System.out.println("meter: " + this.vValue * 0.01 + " m");
        System.out.println("kilometer: " + this.vValue * 0.00001 + " km");
        System.out.println("millimeter: " + this.vValue * 10 + " mm");

        return true;
    }

    private boolean kilometer() {
        System.out.println("\n\nINPUT: " + this.vValue + " km\n");
        // Return False when it's error.
        if ((this.vValue * 0.6213711922 > Double.MAX_VALUE || this.vValue * 0.6213711922 < Double.MIN_VALUE) &&
                (this.vValue * 1000 > Double.MAX_VALUE || this.vValue * 1000 < Double.MIN_VALUE) &&
                (this.vValue * 100000 > Double.MAX_VALUE || this.vValue * 100000 < Double.MIN_VALUE))
            return false;

        System.out.println("miles: " + this.vValue * 0.6213711922 + " mi");
        System.out.println("meter: " + this.vValue * 1000 + " m");
        System.out.println("centimeter: " + this.vValue * 100000 + " cm");

        return true;
    }

    private boolean feet() {
        System.out.println("\n\nINPUT: " + this.vValue + " ft\n");
        // Return False when it's error.
        if ((this.vValue * 0.0001893939 > Double.MAX_VALUE || this.vValue * 0.0001893939 < Double.MIN_VALUE) &&
                (this.vValue * 0.3048 > Double.MAX_VALUE || this.vValue * 0.3048 < Double.MIN_VALUE) &&
                (this.vValue * 30.48 > Double.MAX_VALUE || this.vValue * 30.48 < Double.MIN_VALUE) &&
                (this.vValue * 12 > Double.MAX_VALUE || this.vValue * 12 < Double.MIN_VALUE) &&
                (this.vValue * 304.8 > Double.MAX_VALUE || this.vValue * 304.8 < Double.MIN_VALUE) &&
                (this.vValue * 0.3333333333 > Double.MAX_VALUE || this.vValue * 0.3333333333 < Double.MIN_VALUE))
            return false;

        System.out.println("miles: " + this.vValue * 0.0001893939 + " mi");
        System.out.println("meter: " + this.vValue * 0.3048 + " m");
        System.out.println("centimeter: " + this.vValue * 30.48 + " cm");
        System.out.println("inches: " + this.vValue * 12 + " in");
        System.out.println("millimeter: " + this.vValue * 304.8 + " mm");
        System.out.println("yards: " + this.vValue * 0.3333333333 + " yds");

        return true;
    }

    private boolean yards() {
        System.out.println("\n\nINPUT: " + this.vValue + " yds\n");
        // Return False when it's error.
        if ((this.vValue * 3 > Double.MAX_VALUE || this.vValue * 3 < Double.MIN_VALUE) &&
                (this.vValue * 0.0005681818 > Double.MAX_VALUE || this.vValue * 0.0005681818 < Double.MIN_VALUE) &&
                (this.vValue * 0.9144 > Double.MAX_VALUE || this.vValue * 0.9144 < Double.MIN_VALUE) &&
                (this.vValue * 36 > Double.MAX_VALUE || this.vValue * 36 < Double.MIN_VALUE))
            return false;

        System.out.println("feet: " + this.vValue * 3 + " ft");
        System.out.println("miles: " + this.vValue * 0.0005681818 + " mi");
        System.out.println("meter: " + this.vValue * 0.9144 + " m");
        System.out.println("inches: " + this.vValue * 36 + " in");

        return true;
    }

    private boolean inches() {
        System.out.println("\n\nINPUT: " + this.vValue + " in\n");
        // Return False when it's error.
        if ((this.vValue * 0.0833333333 > Double.MAX_VALUE || this.vValue * 0.0833333333 < Double.MIN_VALUE) &&
                (this.vValue * 0.0254 > Double.MAX_VALUE || this.vValue * 0.0254 < Double.MIN_VALUE) &&
                (this.vValue * 0.0277777778 > Double.MAX_VALUE || this.vValue * 0.0277777778 < Double.MIN_VALUE) &&
                (this.vValue * 2.54 > Double.MAX_VALUE || this.vValue * 2.54 < Double.MIN_VALUE) &&
                (this.vValue * 25.4 > Double.MAX_VALUE || this.vValue * 25.4 < Double.MIN_VALUE))
            return false;

        System.out.println("feet: " + this.vValue * 0.0833333333 + " ft");
        System.out.println("meter: " + this.vValue * 0.0254 + " m");
        System.out.println("yards: " + this.vValue * 0.0277777778 + " yds");
        System.out.println("centimeter: " + this.vValue * 2.54 + " cm");
        System.out.println("millimeter: " + this.vValue * 25.4 + " mm");

        return true;
    }

    private boolean meter() {
        System.out.println("\n\nINPUT: " + this.vValue + " m\n");
        // Return False when it's error.
        if ((this.vValue * 3.280839895 > Double.MAX_VALUE || this.vValue * 3.280839895 < Double.MIN_VALUE) &&
                (this.vValue * 1.0936132983 > Double.MAX_VALUE || this.vValue * 1.0936132983 < Double.MIN_VALUE) &&
                (this.vValue * 0.0006213712 > Double.MAX_VALUE || this.vValue * 0.0006213712 < Double.MIN_VALUE) &&
                (this.vValue * 100 > Double.MAX_VALUE || this.vValue * 100 < Double.MIN_VALUE) &&
                (this.vValue * 39.37007874 > Double.MAX_VALUE || this.vValue * 39.37007874 < Double.MIN_VALUE) &&
                (this.vValue * 1000 > Double.MAX_VALUE || this.vValue * 1000 < Double.MIN_VALUE) &&
                (this.vValue * 0.001 > Double.MAX_VALUE || this.vValue * 0.001 < Double.MIN_VALUE))
            return false;

        System.out.println("feet: " + this.vValue * 3.280839895 + " ft");
        System.out.println("yards: " + this.vValue * 1.0936132983 + " yds");
        System.out.println("miles: " + this.vValue * 0.0006213712 + " mi");
        System.out.println("centimeter: " + this.vValue * 100 + " cm");
        System.out.println("inches: " + this.vValue * 39.37007874 + " in");
        System.out.println("millimeter: " + this.vValue * 1000 + " mm");
        System.out.println("kilometer: " + this.vValue * 0.001 + " km");

        return true;
    }

    private boolean miles() {
        System.out.println("\n\nINPUT: " + this.vValue + " mi\n");
        // Return False when it's error.
        if ((this.vValue * 1.609344 > Double.MAX_VALUE || this.vValue * 1.609344 < Double.MIN_VALUE) &&
                (this.vValue * 1609.344 > Double.MAX_VALUE || this.vValue * 1609.344 < Double.MIN_VALUE) &&
                (this.vValue * 5280 > Double.MAX_VALUE || this.vValue * 5280 < Double.MIN_VALUE) &&
                (this.vValue * 1760 > Double.MAX_VALUE || this.vValue * 1760 < Double.MIN_VALUE))
            return false;

        System.out.println("kilometer: " + this.vValue * 1.609344 + " km");
        System.out.println("meter: " + this.vValue * 1609.344 + " mm");
        System.out.println("feet: " + this.vValue * 5280 + " ft");
        System.out.println("yards: " + this.vValue * 1760 + " yds");

        return true;
    }
}
