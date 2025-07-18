package org.example.test;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Hello {
    public void Hi() {
        System.out.println("안녕하세요.");
    }
}
class Boring {
    public static void boring () {
        System.out.println("노잼");
    }
}
 class Person {
    String name;
    public void introduce() {
        System.out.println("안녕하세요, 저는: " + name + "입니다.");
     }

 }
 class Create {
     public static void createPerson(String name) {
         Person p = new Person();
         p.name = name;
         p.introduce();
     }

     public static void main(String[] args) {
         createPerson("홍길동");
         createPerson("김길동");
         createPerson("이길동");
     }
 }
public class Test {
    public static void main(String[] args) {

     // >> Wrapper 클래스 : 기본 자료형을 객체로 감싸기 위해 제공되는 클래스
     // 기본 자료형을 참조 자료형처럼 사용

//        byte a = 32;
//        short b = a;
//        int c = b;
//        long d = c;
//
//        float e = d; // 4byte float 에 8byte long 데이털 삽입이 가능

        // char f = e; - 묵시적 형 변환 불가 (char 는 2byte)

        long aa  = 32L; // long 타입은 데이터 뒤에 알파벳 L.l 핃수
        int bb =(int) aa;
        short cc = (short) bb;
        byte dd = (byte) cc;

        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
        System.out.println(dd);

        char c1 = 'a';
        int num1 = c1;
        System.out.println(num1);
        int num = 99;
        System.out.println((char) num);
        int num3 = 99;
        // char c2 = num3; - int > char
        char c2 = (char) num3;
        System.out.println(c2);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("주소를 입력하세요: ");
//        String address = sc.nextLine();
//        System.out.println(address);
//
//        sc.close();

        Hello h = new Hello();
        h.Hi();
        Boring.boring();


    }
}
