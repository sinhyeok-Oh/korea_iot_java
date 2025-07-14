package org.example.chapter12;

/*
* === 도서 관리 시스템 ===
*
* 1. 요구 사항 부석
*   - 새로운 도서 추가 : addBook
*   - 모든 도서 정보 출력 : getAllBooks
*   - 도서 검색 (도서 제목으로 검색): searchBookByTitle
*
* 2. 프로그램 구조
*
* Model(도서 정보 담당)
*    Book 클래시: 도서 정보 저장( 제목, 저자, 출판사 등)
*
* View(사용자 인터페이스 UI 를 담당)
*   - BookView 클래스: 사용자의 입력을 받아 Controller 에게 전달 & Controller 에게 받은 정보를 출력
*
* Controller (사용자의 입력을 처리 - Model 과 View 사이를 중재)
*   - BookController 클래스: 사용자의 입력에 따라 적절한 Model 메서드를 호출
* */

import org.example.chapter12.controller.BookController;
import org.example.chapter12.view.BookView;

import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {

        BookController controller = new BookController();
        Scanner sc = new Scanner(System.in);

        BookView bookView = new BookView(controller, sc);
        bookView.showMenu();
    }
}
