package org.example.chapter05;

// 음식점 클래스
// : 다양한 방법으로 음식을 주문 받는 메서드
// - 동일한 흐름으로 된 메서드로 주문을 받음
class Restaurant {
    // 메서드 정의 : placeOrder()

    // 메뉴 이름 (String dish)
    // 메뉴 이름 * 수량 제공 (int quantity)
    // 메뉴 이름 * 특별 요청 사항 (String specialRequests)
    // 메뉴 이름 * 수량 제공 * 특별 요청 사항

    void placeOrder(String dish) {
        System.out.println(dish);
    }

    void placeOrder(String dish, int quantity) {
        System.out.println(dish + " * " + quantity);
    }

    void placeOrder(String dish, String specialRequests) {
        System.out.println(dish + " - " + specialRequests);
    }

    void placeOrder(String dish, int quantity, String specialREquests) {
        System.out.println(dish + " * " + quantity + " - " + specialREquests);
    }
}

public class G_Overloading {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        // 자바 컴파일러가 ㅣㄴ자의 형태를확인하고
        //      , 자동으로 해당 타입과 순서의 메서드로 인식
        restaurant.placeOrder("hamburger");
        restaurant.placeOrder("pizza", 2);
        restaurant.placeOrder("pasta", "A lot of sauce");
        restaurant.placeOrder("salad", 3, "Except for peanuts");

    }
}
