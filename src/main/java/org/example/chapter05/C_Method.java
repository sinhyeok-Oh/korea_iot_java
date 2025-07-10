package org.example.chapter05;

// === 인자와 매개변수의 관계 === //
// 1. 인자(argument,아규먼트)
// 2. 매개변수(parameter, 파라미너)

// 사칙연산 클래스
// : 두 개의 값으 매개변수로 받아 사칙 연산 수행
class MyMath {
    int add(int a, int b) {
        return a + b;

    }
    int subtract (int a, int b){
        return a - b;
    }

    int multiply (int a, int b) {
        return a * b;
    }

    int divide (int a, int b) {
        // 매서드 내부에서 return 키워드를 만나면 메서드 종료
        // >> 조건에 따라 반환값을 다르게 설정 가능
        // >> 반환타입은 일치하거나 자종 형 변환이 가능할 것

        if(b == 0) {
            System.out.println("정수 0으로 나눌수 없습니다.");
            return b;
        } else {
            return  a / b;
        }

    }
    double doubleDivide(int a, double b) {
        return a / b;
    }

    void noReturn() {
        System.out.println(" 해당 메서드는 반환값이 없습니다.");
        // return
        // : 자바 컴파일러가 반환타입의 void 를 읽는 경우
        //      , 해당 메서드의 마지막에 return; 을 자동 추가
    }

        // 조건부 반환 형식
    int max(int a, int b) {
            // 정수 a와 b를 비교하여 둘 중 더 큰 값을 반환
    //        if (a > b) return a;
    //        else return b;
        int result;

        if (a > b) result = a;
        else result = b;

        return  result;
    }

    int min(int a, int b) {
            // 상향 연산자를 사용하여 조건부 반환
          //  return 조건식 ? 조건이 참인 경우 : 조건이 거짓은 경우;
          // return a > b ? b : a;
          return a < b ? a : b;
    }
}
public class C_Method {
    public static void main(String[] args) {
    //  클레스타입 객체명 = new 클래스 생서자 호출();
    // - 클래스 생성자는 반드시 한개 이상 존대
    // - 가용자 정으 생정자가 없는 경우 빈 생성자(인자x, 반환x) 가 생략
    MyMath myMath = new MyMath();

    System.out.println(myMath.add(10,20)); // 30
    System.out.println(myMath.subtract(10,20)); // -10
    System.out.println(myMath.multiply(10,20)); // 200
    System.out.println(myMath.divide(10,20)); // 0: 자기 자신보다 큰 수로 나누먼 '0' 반환

    System.out.println(myMath.divide(10,0));
    // ArithmeticException: / by zero
    // >> 자바에서는 수를 0으로 나누면 예외가 발생\

    System.out.println(myMath.doubleDivide(10,0.0)); // Infinity(무제한)

    // cf) 인자값과 매개변수의 관계
    // : 자바는 값에 의한 호출 방식을 사용
    // - 에소드 호출 시 인자값이 '매개변수에 복사' 되어 전달

    // cf) 인자는 실질적인 테이터
    //         매개변수는 해당 데이터를 메소드 블록 내에서 저장할 임시 변수 - 메서드 실행 시에만 유효
    }
}