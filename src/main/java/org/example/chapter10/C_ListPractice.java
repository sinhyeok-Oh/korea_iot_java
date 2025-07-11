package org.example.chapter10;

// === 이벤트 관리 시스템 === //
// : 이벤트 참가자 명단 & 대기열 관리를 위한 시스템
// - 참가자는 사전 등록된 명단을 통해 이벤트 참가
// - 명단이 가득 찰 경우 대기열 추가, 참가자가 떠나면 대기열의 다음 사람이 추가

// 1) 이벤트 참가자 명단 관리: 사전 등록, 당일 추가 참가자 틍록 x
// : ArrayList (목록 추가/삭제 X / 참가자 조회 O)

// 2) 대기열 관리
// : 이벤트의 한정된 좌석, 좌석이 모두 차면 추가 참가자는 대기열 등록
// : LinkedList (목록 추가/삭제O, 참가자 조회 X)

import java.util.ArrayList;
import java.util.LinkedList;

class EvertManagement {
    // == 필드 == //
    ArrayList<String> participantList = new ArrayList<>();
    LinkedList<String> waitingQueue = new LinkedList<>();

    // == 메서드 == //
    void addParticipant(String name) {
        participantList.add(name);
    }

    void addToWaitingQueue(String name) {
        waitingQueue.add(name);
    }

    void leaveParticepant(String name) {
        // 대기열의 인원이 존재해야만 대기열 인원을 참가자 명단에 추가 가능
        // : 대기열 크기(.size()) 가 0이상
        if (waitingQueue.size() > 0) {
            String newParticipant = waitingQueue.remove(0);
            addParticipant(newParticipant);
        }
    }
    boolean checkParticipant(String name) {
        return participantList.contains(name);
    }
}

public class C_ListPractice {
    public static void main(String[] args) {
        EvertManagement evertManagement = new EvertManagement();

        evertManagement.addParticipant("이승아");
        evertManagement.addParticipant("김승아");
        evertManagement.addParticipant("오승아");
        evertManagement.addParticipant("조승아");
        evertManagement.addParticipant("최승아");

        evertManagement.addToWaitingQueue("김소빈");
        evertManagement.addToWaitingQueue("이소빈");
        evertManagement.addToWaitingQueue("최소빈");
        evertManagement.addToWaitingQueue("오소빈");

        System.out.println(evertManagement.participantList);
        System.out.println(evertManagement.waitingQueue);

        evertManagement.addToWaitingQueue("이헤지");
        evertManagement.addToWaitingQueue("김준일");

        evertManagement.leaveParticepant("이스앙");
        evertManagement.leaveParticepant("조승범");
        evertManagement.leaveParticepant("윤대휘");

        System.out.println(evertManagement.participantList);
        // [이승아, 김승아, 오승아, 조승아, 최승아, 김소빈, 이소빈, 최소빈]

        System.out.println(evertManagement.waitingQueue);// [오소빈, 이헤지, 김준일]

        System.out.println(evertManagement.checkParticipant("이소빈"));// true
        System.out.println(evertManagement.checkParticipant("최현우")); // false
    }
}
