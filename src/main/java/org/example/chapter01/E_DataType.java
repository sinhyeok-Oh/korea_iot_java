package org.example.chapter01;

import java.math.BigDecimal;
import java.math.BigInteger;

public class E_DataType {
    public static void main(String[] args) {
        /*
           === 데이터 타입(자료형, DataType) ===
           : 자바 '강' 타입 언어
              >> 모든 변수 선언 시 반드시 데이터 타입 명시

              1. 데이터 타입 종류
              1) 기본 타입
                    - 변수 선언 시 해당되는 자료형 크기 만큼의 메모리가 할당
                    - 실제 데이터가 저장

              2) 참조 타입
                    - 객체의 참조(메모리 주소) 를 저장하는 변수 타입
                    - 객체, 배열과 같이 메모리의 Heap 영역에 저장된 데이터의 주소를 참조

              cf) Stack(스택): 기본타입의 데이터가 실제 저장 / 참조타입의 주소값이 저장
                    Heap(힙): 참조타입의 실제 데이터가 저장

         */
        // 1. 기본 타입(자료형 - 8개)
        // byte(1), short(2), long(8), float(4)
        //* int(4), double(8), char(2), boolean(1)

        // cf) 자료형 크기 단위
        // 1byte 체계 == 8bit
        // : 1bit는 메모리 한칸

        // 1-1) 정수형 byte(1) < short(2) < int(4) < long(8)
        // byte : -128 ~ 127
        // short : -32,768 ~ 32,767
        // int : -2.1억 ~ 약 2.1억
        // long : 약 -2의 63제곱 ~ 약2의 63제곱

        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 287239874;
        long longValue = 123123123123L; //  long 타입은 숫자 뒤에 알파벳 L, l을 써서 표기 (대문자 권장)

        // 1-2) 문자형: char (Character)
        // : 2바이트, 단일 문자 저장만 가능
        // : 홈따움표(작은따움표)로 표기
        char grade = 'A';
        // char lastName = "이";  - 쌍따움표 사용 금지
        char lastName = '이';
        // char gender = '남자'; - 단일 문자 저장만 가능
        char gender = '남';

        // 1-3) 실수형: float(4) < double(8)
        // : 부동 소수점이 있는 수
        float dollar1 = 32.123F; // 데이터값 뒤에 알파벳 f, F 사용
        double dollar2 = 32.123;

        // cf) 실수형의 정밀도(유효 소수 자릿수)
        // 1) float : 약 7 자리 정도까지 정확하게 표현
        float f1 = 123.456789F;
        System.out.println(f1); // 123.45679 - 소수점 자리가 반올림 처리

        // 2) double : 약 15 ~ 16 자리 정도까지 정확하게 표현
        double d1 = 123.4567890123456789;
        System.out.println(d1);// 123.45678901234568

        // cf) 금용계산, 정밀한 수치 연산에서는 BigDecimal 을 사용 권장
        // : 문자열 형식으로 변환해야 정밀도 보장
        BigDecimal bigDecimal = new BigDecimal("1234567890.12345678901234567890");
        System.out.println(bigDecimal);

        // 1-4) 논리형: boolean
        //: 데이터 값으로 true, false 만 가장
        // : 1byte 타입, 데이터 지정 시 소문자 값 사용을 권장
        // >> 변수명 지정 시 의문문 사용

        boolean isMarryed = true;
        boolean isActived = true;
        boolean hasSnack = false;

        boolean isLogin = true;
        boolean isLightOn = false;

        // == 데이터 타입 정리 == //
        /*
               정수 : byte < short < int < long
               실수 : float < double
               문자 : char(Character)
               논리 : boolean

               >> Wrapper 클래스 : 기본 자료형을 객체로 감싸기 위해 제공되는 클래스
                        기본 자료형을 참조 자료형처럼 사용

               cf ) 참조 자료형 : 문자열(String), 배열, 객체 등
         */

        // << 실습 >> //
        // : 학생 이름, 학생 나이, 학생 키, 학생 성별('M','F' - 단일 문자), 학생여부
        //          변수 선언과 본인의 데이터로 초기화

        String studentName = "오신혁";
        int studentAge = 30;
        char studentGender = 'F';
        boolean isStudent = false;

        // 2) 참조자료형
        // : 기본 자료형을 기초로 만들어진 자료형
        // : 실제 데이터 값 x, 데이터가 저장된 주소값을 가지는 자료형

        // 2-1) 문자열(String)
        // : 문자열(문자 여러 개)을 저장하는 데 사용
        // : 반드시 쌍따움표(큰따옴표)를 사용하여 문자열 작성

        String welcomeMassage = "만나서 반갑습니다:)";
        System.out.println(welcomeMassage);

        // String studentName = "오신혁";
        // 하나의 스코프(영역) 내에서는 동일한 변수명 사용 불가
        // : 스코프는 {}로 구분
    }
    // 스코프가 다르면 동일한 변수명 사용 가능
    String studentName = "오신혁";
}

