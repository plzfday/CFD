package dev;

import java.util.Scanner;

public class Main {
    public static void Menu() {
        System.out.println("===============\n   Calculator\n===============");
        System.out.println("1: Standard");
        System.out.println("===============\n   Converter\n===============");
        System.out.println("2: Length");
        System.out.println("3: Weight and mass");
        System.out.println("4: Temperature");
        System.out.println("Enter -1 to Exit");
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean exit = false;
        while(true) {
            Menu();
            int menu = reader.nextInt();
            switch (menu) {
                case 1:
                    StandardCalculator sc = new StandardCalculator();
                    sc.Commander();
                    break;
                case 2:
                    Length l = new Length();
                    l.Commander();
                    break;
                case 3:
                    Weight_Mass wm = new Weight_Mass();
                    wm.Commander();
                    break;
                case 4:
                    Celsius_Fahrenheit cf = new Celsius_Fahrenheit();
                    cf.Commander();
                    break;
                case -1:
                    exit = true;
                    break;
                default:
                    System.out.println("죄송합니다. 아직 구현 중 입니다 ㅠㅠ");
            }
            if(exit) break;
            reader.nextLine();
            reader.nextLine();
        }
        reader.close();
    }
}
