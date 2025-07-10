package org.example.chapter02;

import java.util.Scanner;

public class E_Practice {
    public static void main(String[] args) {
            /*
			    1. 점수에 따른 학점 출력 (if, else if, else 사용)

	            사용자로부터 점수를 입력받아 아래 기준에 따라 학점을 출력하세요.
	            0 미만 또는 100 초과인 경우: 유효하지 않은 점수입니다.
	            90 이상: A
	            80 이상: B
	            70 이상: C
	            60 이상: D
	            그 외: F

			    2. 삼각형 모양의 별(*) 출력 (중첩 for 사용 - 2번)
	            (1)
	            *
	            **
	            ***
	            ****
	            *****

	            >> 행이 5번 반복 (줄 수 1 ~ 5까지 반복)
	            >> 각 행 마다 * 별의 개수가 1씩 증가 (1에서 5로 증가)
	        	: 각 줄의 별 개수는 각 줄의 수 보다 "이하"의 값
		*/
        Scanner sc = new Scanner(System.in);
        System.out.println("점수 입력 : ");
        int num = sc.nextInt();

        if (num < 0 || num > 100) {
            System.out.println("유효하지 않은 점수입니다.");
        } else if (num >= 90) {
            System.out.println('A');
        } else if (num >= 80) {
            System.out.println('B');
        } else if (num >= 70) {
            System.out.println('C');
        } else if (num >= 60) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }


        System.out.println();
        for(int i = 1; i <= 5; i++) {
            // i : 행의 수 (1 ~ 5)
            for(int j = 1; j <= i; j++) {
                // 1행은 별을 1번 반복
                // 2행은 별을 2번 반복
                //...
                // 5행은 ......
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈 처리를 담당
        }

        /*
                    *
                   **
                  ***
                 ****
                *****
                행은 1부터 5까지 반복: i < rows; (조건)

                +) 공백은 4무터 0까지 -1씩 감소: rows - i (조건)
                +) 별은 1부터 5까지 +1씩 증가: 행을 초과하지 않도록 반복
         */
        int rows= 5; // 출력할 줄 수

        for (int i = 1; i <=rows; i++) {
            // 각 행의 반복
            // i : 1부터 5까지 반복
            for (int j = 1; j <= rows - i; j++) {
                // 공백 반복
                // j: 4부터 0까지의 수
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                // 별의 반복
                // k : 1부터 5까지 수
                System.out.print("*");
            }
            System.out.println();
        }
        // 1행: i = (1) / j(1~4) / k(1)
        // 2행: i = (2) / j(1~3) / k (1~2)
        // ...
        // 5행: i = (5) / j(0) / k(1~5)
    }

}
