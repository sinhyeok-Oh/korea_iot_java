package org.example.chapter01;

import javax.swing.*;
import java.util.Scanner;

public class Z_Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요 >> ");
        String name = sc.nextLine();
        System.out.println("국어 점수를 입력하세요 >> ");
        int lg = sc.nextInt();
        System.out.println("수학 점수를 입력하세요 >> ");
        int math = sc.nextInt();
        System.out.println("영어 점수를 입력하세요 >> ");
        int eng = sc.nextInt();

        int total = lg + math + eng;

        System.out.println("[이름 : " + name + "]");
        System.out.println("총점 : " + total + "점");
        System.out.println("평균 : " + (total / 3));
        if (lg >= 60 && math >= 60 && eng >= 60) {
            System.out.println("합격입니다");
    } else {
            System.out.println("불합벽입니다");
        }
    }
}
