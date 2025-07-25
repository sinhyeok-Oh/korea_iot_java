package org.example.test;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);

        int j = 1;
        while (j <= 6) {
            System.out.println(j);
            j++;
        }
//
//        Scanner sc = new Scanner(System.in);
//        String str = "";
//        while (true) {
//            System.out.println("문자열을 입력하세요 (exit 키 입력 시 종료); ");
//            str = sc.nextLine();
//            if (str.equals("exit")) {
//                System.out.println("프로그램 종료");
//                break;
//            }
//            System.out.println("명령어 [" + str + "] 실행중..");
//
//
//            String password;
//            do {
//                System.out.println("비번을 입력하세요 >> ");
//                password = sc.nextLine();
//            } while (!password.equals("18"));
//            System.out.println(" >> ");
//        }

        Scanner sc = new Scanner(System.in);
        String input;

        do {
            System.out.println("문자열을 입력하세요 (exit 입력시 종료): ");
            input = sc.nextLine();
            System.out.println("입력한 값: " + input);
            if (input.equals("exit")) {
                break;
            }
        } while (true);
        System.out.println("프로그램을 종료합니다.");

    }
}
