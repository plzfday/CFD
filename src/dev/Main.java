package dev;

import java.util.Scanner;

public class Main {

    public static void Menu() {
        System.out.println("===============\n   Calculator\n===============");
        System.out.println("1: Standard");
//        System.out.println("---------- Yet Developed ----------");
//        System.out.println("2: Scientific");
//        System.out.println("3: Data");
//        System.out.println("* Converter");
//        System.out.println("4: Length");
//        System.out.println("5: Weight and mass");
//        System.out.println("6: Temperature");
//        System.out.println("7: Data");
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Menu();
        int menu = reader.nextInt();
        switch (menu) {
            case 1:
                String s = reader.nextLine();
                s = reader.nextLine();
                StandardCalculator sc = new StandardCalculator(s);
                sc.Commander();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            default:
                System.out.println("죄송합니다. 아직 구현 중 입니다 ㅠㅠ");
                break;
        }
        reader.close();
    }
}
