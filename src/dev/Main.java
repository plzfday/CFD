package dev;

import java.util.Scanner;

public class Main {
/* THINGS THAT MUST SEARCH FOR

    자릿수 1E+10같은 표현 어떻게 구현하고 DOUBLE 타입 이상의 숫자를 어떻게 처리해야 할지 생각할 것.
 */
    public static void Menu() {
        System.out.println("===============\n   Calculator\n===============");
        System.out.println("1: Standard");
        System.out.println("2: Data");
        System.out.println("* Converter");
        System.out.println("3: Length");
        System.out.println("4: Weight and mass");
        System.out.println("5: Temperature");
        System.out.println("6: Data");
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        boolean exit = false;
        while(true) {
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
                    break;
                case 3:
                    Length l = new Length();
                    l.Commander();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case -1:
                    exit = true;
                    break;
                default:
                    System.out.println("죄송합니다. 아직 구현 중 입니다 ㅠㅠ");
            }
            if(exit) break;
        }
        reader.close();
    }
}
