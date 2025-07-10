package org.example.chapter01;

public class H_Operator {
    public static void main(String[] args) {
        // === 연산자 (Operation) === //\
        // : 프로그램에서 데이터를 조작하거나 계산

        System.out.println("=== 산술 연산자 === ");
        // 사칙 연산 ( 덧셈, 뺄셈, 곱셈, 나눈셈)
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b); // 나눗셈 (/): 나눈 결과의 몫을 저장
        System.out.println(a % b); // 나눗셈 (%); 나눈 결과의 나머지를 저장
        System.out.println("=== 증감 연산자 ===");
        // : 변수의 값을 1 증가(++) 시키거나 1 감소(--) 시키는 연산자
        int number =10;

        // 1) 전위 증감 연산자
        // : 값이 먼저 변경되고 나서 계신에 적용
        // : ++변수명, --변수명
        System.out.println(++number); // 11 : 10 + 1 (증가) 후 출력
        System.out.println(--number); // 10 : 11 - 1 (감소) 후 출력

        // 2) 후위 증감연산자
        // : 값이 계산된 이후 변경
        // : 변수명++, 변수명--
        System.out.println(number); // 10
        System.out.println(number++); // 출력(10) 후 + 1 증가
        System.out.println(number--); // 출력(11) 후 - 1 감소
        System.out.println(number); // 10

        number++; // 10 (+1)
        number++; // 11 (+1)
        ++number; // 13
        --number; // 12
        number--; // 12 (-1)
        number++; // 11 (+1)
        System.out.println(number); // 12

        System.out.println("=== 대입(할당) 연산자 ===");
        // : 변수에 값을 할당할 때 사용하는 연산자
        // 기본 연산자(=), 시칙연산과 결함됨 연산(+=, -=, *=, /=, %=)
        number = 10; // 대입 연산자

        // 해당 값의 연산 후 다시 변수에 할당
        System.out.println(number += 3); // 넘버의 + 3 의 결과를 넘버에 할당 (number = number + 3)
        System.out.println(number -= 3); // number = number - 3
        System.out.println(number *= 3); // 30
        System.out.println(number /= 3); // 10
        System.out.println(number %= 3); // 1
        System.out.println(number);

        System.out.println("=== 비교 연선자 ===");
        // : 좌항과 우항을 비교한 결과를 논리(boolean) 값으로 반환
        // <, >, <=, >=, ==, !=
        System.out.println(5 > 3);
        System.out.println(5 < 3);
        System.out.println(5 >= 3);
        System.out.println(5 <= 3);
        System.out.println(5 == 3); // false
        System.out.println(5 != 3); // true

        System.out.println("=== 논리 연산자 ===");
        // : 논리값(boolean)을 연산
        // & (엠퍼센트, | (버티컬 바, vertical bar)

        // 1) 논리곲 ( and, &&)
        // : 모든 값이 true 면 true 의결과
        // - 하나의 값이라도 false 면 false의 결과
        System.out.println(true && true && true );
        System.out.println(true && true && true && false && true && true); // false

        // 2) 논리합 ( or,||)
        // : 하나의 값이라도 true면 true의 결과

        System.out.println(true || true);
        System.out.println(true || true || false || true || false || false); // true
        System.out.println(false || false || false); // false

        // 3) 부정 논리(!)
        // : 논리값을 전환
        // : 논리값 앞에 ! 키워드를 사용하여 적성
        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println(!bool1); // false
        System.out.println(!bool2); // true

        System.out.println(3 > 2 && 1 == 1);// true && true >> true
        System.out.println(1 != 1); // false
        System.out.println(3 >= 3 || 10 < 11 && !bool2);


        System.out.println("=== 조건 (삼향) 연산자 ===");
        // : 조건식( 노리의 값이 반환)? 조건식이 참인 경우 반환: 조건식이 거짓인 경우 반환
        int age = 20;
        String drink = age > 19 ? "맥주" : " 오랜지주스";
        System.out.println(drink + "을(를) 마십니다.");

        int x = 10, y = 20; // 변수의 데이터 타입이 같은경우 , 콤마로 구분하여 나열 가능
        System.out.println(x % y == 0 ? "2의 배수입니다." : "2의 배수가 아닙니다.");

        System.out.println("=== 기타 연산자 ===");
        // 문자열 연결 연산자 +
        String result = "홍" + "길동";
        System.out.println(result);

        // cf) 연산자의 우선순위
        // : (기본) 좌측 >> 우측
        //      그러나  대입 연산자의 경우 우항에서 좌항의 대입이 이루어짐
        //      () 괄호 연산자의 경우 우선순위를 가짐
    }
}
