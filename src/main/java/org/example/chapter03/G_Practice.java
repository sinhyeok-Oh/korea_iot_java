package org.example.chapter03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class G_Practice {
    public static void main(String[] args) {
        /*
            단어 퀴즈 맞추기 게임
            : 동적 배열에 단어 5개를 삽입

            무작위 수를 생성(난수) 하여 단어5개 중에서 1가지를 선택

            사용자로 부터 입력받은 값이 무작위로 선택된 단어와 일치하는 경우 게임종료
            - 정답을 맞출 때가지 무한 반복
            - "종료" 입력시 프로그램 종료
         */
        // 1. 동적 배열 생성
        ArrayList<String> words = new ArrayList<>();

        words.add("텀블러");
        words.add("리모컨");
        words.add("볼펜");
        words.add("핸드폰");
        words.add("키보드");

        // 2. 무작위 난수 새성 (0 ~ 4)
        // cf) Random 클래스 (자바 내부 라이브러리 기능)
        //    >> 난수(무작위 수) 와 관련된기능의 집합
        // 1) Random 생성
        Random random = new Random();

        // 2) random 사용 : random 변수명.nextInt(숫자값);
        //      >> 0부터 해당 숫자 미만의 정수가 생성
        int index = random.nextInt(words.size()); // 0 ~ 5미만까지의 정수 (words 인뎃스 번호)

        // 3) 무작위 아이템 추출
        String selectedWord = words.get(index);

        // 4) 사용자 입력 스캐너 생성
        Scanner sc = new Scanner(System.in);
        String userInput; // 반복문 내에서 스캐너를 통해 값 할당

        // 사용자 입력값과 무작위 아이템 비교
        while (true) {
            System.out.println("단어를 맞춰보세요 :)");
            userInput = sc.nextLine();

            // 문자열 비교 (A문자열.equals(B문자열)
            if (userInput.equals((selectedWord))) {
                System.out.println("정답입니다 : " + selectedWord);
                break;
            } else if (userInput.equals(("종료"))) {
                System.out.println("종료합니다");
                break;
            } else {
                System.out.println("틀렸습니다. 다시 시도해주세요.");
            }

        }
        sc.close();
        System.out.println("프로그램이 종료되었습니다.");

    }
}
