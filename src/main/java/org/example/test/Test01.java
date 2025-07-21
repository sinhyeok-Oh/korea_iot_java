package org.example.test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        int score = 3;

        switch(score) {
            case 1:
                System.out.println("1번");
                break;
            case 2:
                System.out.println("2번");
                break;
            case 3:
                System.out.println("3번");
                break;
            default:
                System.out.println("나머지");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자입력 ");
        int num = sc.nextInt();

        switch (num){
            case 1:
                System.out.println("1번입니다.");
                break;
            case 2:
                System.out.println("2번입니다.");
                break;
            case 3:
                System.out.println("3번입니다.");
                break;
            default :
                System.out.println("선택한 번호가 없습니다.");
        }
    }

}
