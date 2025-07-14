package org.example.chapter10.practice01;


import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

// Inventory: 재고 관리
public class InventorySystem {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager(); // 도서 관리 시스템을 인스턴스화
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=== Inventory System ===");
            System.out.println("1.Create 책 추가");
            System.out.println("2.Read  전체 책 조회");
            System.out.println("3.Update 첵 수정 (재고)");
            System.out.println("4.Delete 책 삭제");
            System.out.println("5.Delete 책 삭제");
            System.out.println("6.Delete 책 삭제");
            System.out.println("7.Delete 책 삭제");
            System.out.println("8.Delete 책 삭제");

            try {
                // sc.nextLine(); - 입력값이 문자열로 인식

                // Integer.parseInt(A)
                // :A 값을 분석하여 Integer 형태로 변경
                //- 숫자 형태로 변경할 수 없는 값이 입력되는 경우
                //      NumberFormatException 발생

                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        // 책 추가
                        System.out.println("Enter Book ID: ");
                        String id = sc.nextLine();
                        System.out.println("Enter Book Title: ");
                        String title = sc.nextLine();
                        System.out.println("Enter Book ISBN: ");
                        String isbn= sc.nextLine();
                        System.out.println("Enter Book Author: ");
                        String author= sc.nextLine();
                        System.out.println("Enter Book Publisher: ");
                        String publisher = sc.nextLine();
                        System.out.println("Enter Book Category: ");
                        String category = sc.nextLine();

                        System.out.println("Enter Book Publisher Year: ");
                        int year = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter Book Price: ");
                        int price = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter Book Stock: ");
                        int stock = Integer.parseInt(sc.nextLine());

                        manager.add(new Book(id, title, isbn, author, publisher, year, price, stock, category));
                        break;
                    case 2:
                        manager.listAll();
                        break;
                    case 3:
                        System.out.println("Enter Book ID to update stock: ");
                        String updateId = sc.nextLine();
                        System.out.println("Enter Quantity to add/subtract");
                        int quantity = Integer.parseInt(sc.nextLine());

                        manager.updateStock(updateId, quantity);
                        break;
                    case 4:
                        System.out.println("Enter Book ID to remove: ");
                        String removedId = sc.nextLine();
                        manager.remove(removedId);
                        break;
                    case 5:
                        System.out.println("검색어를 입력하세요");
                        String keyword = sc.nextLine();

                        List<Item> searchResults = manager.search(keyword);

                        if (searchResults.isEmpty()) {
                            System.out.println("No item found in keyword: " + keyword);
                        } else {
                            for (Item item: searchResults ) {
                                item.display();
                            }
                        }
                        break;
                    case 6:
                        System.out.println("카테고리를 입력해주세요.");
                        String searchCategory = sc.nextLine();

                        List<Item> categoryResults = manager.searchByCategory(searchCategory);

                        if (categoryResults.isEmpty()) {
                            System.out.println("No items found in category: " + searchCategory);
                        } else {
                            for (Item item: categoryResults) {
                                item.display();
                            }
                        }
                    case 7:
                        System.out.println("Enter minimum price: ");
                        int minPrice = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter maximum price: ");
                        int maxPrice = Integer.parseInt(sc.nextLine());


                        List<Item> priceResults = manager.searchByPriceRange(minPrice, maxPrice);

                        if (priceResults.isEmpty()) {
                            System.out.println("No items in price range");
                        } else {
                            for (Item item: priceResults) {
                                item.display();
                            }
                        }
                    case 0:
                        System.out.println("종료하시겠습니까? 종료를 원하시면 'y'를 입력해주세요.");
                        if (sc.nextLine().equalsIgnoreCase("y")) {
                            System.out.println("종료합니다 :)");
                            sc.close();
                            return; // 메서드의 종료! (while 무한 루프 탈출)
                        }

                        System.out.println("다시 입력하세요.");
                        break; // switch case의 탈출 (while문 종료 X)
                    default:
                        System.out.println("유효하지 않은 선택입니다. 다시 시도해주세요.");
                }

            } catch (NumberFormatException e) {
                // 숫자 형태의 입력이 아닌 경우 발생
                System.out.println("Please Enter a valid number");
            } catch (NoSuchElementException e) {
                // 컬렉션엣 요소를 가져올 때 해당 요소가 없는 경우 발생하는 예외
                // - 존재하지 않는 것을 가져올 대 발생
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        //        int num = 0;
//
//        switch (num) {
//            case 1: {
//                // 코드 구문
//                int a;
//                break;
//            }
//            case 2:
//                // 코드 구문
//                // int a;
//                break;
//            case 3: {
//                // case 3만의 스코프(영역) 설계
//                // : 각 case가 지역 변수의 범위를 가진 독립 블록 (안전성 확보)
//                int a;
//            }
//        }
    }
}
