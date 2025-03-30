package study.basic.exception.ex3;

import study.basic.exception.ex3.exception.NetworkSendExceptionV4;

import java.util.Scanner;

public class NetworkMainV4 {
    public static void main(String[] args) {
        NetworkServiceV4 networkService = new NetworkServiceV4();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("network end!");
    }

    private static void exceptionHandler(Exception e) {
        //공통 처리
        System.out.println("오류 발생 ! ! 관리자에게 문의하세요 ! ! !");
        e.printStackTrace(System.out); // 에러내용 출력
        //e.printStackTrace();

        //필요한경우 예외별로 별도의 추가 처리 간으
        if(e instanceof NetworkSendExceptionV4 sendException4) {
            System.out.println("[전송오류] 데이터 : "+sendException4.getSendData());
        }
    }
}
