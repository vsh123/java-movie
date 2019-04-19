package view;

import domain.Movie;
import domain.PlaySchedule;
import domain.ResultPay;
import reservation.MovieReservation;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static int inputMovieId() {
        try {
            System.out.println("## 예약할 영화를 선택하세요.");
            return MovieReservation.checkExistList(Integer.parseInt(scanner.nextLine().trim()));
        } catch (IllegalArgumentException e) {
            System.out.println("올바르지 않은 입력입니다.");
            return inputMovieId();
        }
    }

    public static PlaySchedule inputPlaySchedule(Movie selectedMovie) {
        try {
            System.out.println("##예약할 시간표를 선택하세요.(첫번째 상영 시간이 1번)");
            return MovieReservation.checkExistSchedule(selectedMovie,
                    Integer.parseInt(scanner.nextLine().trim()));
        } catch (IllegalArgumentException e) {
            System.out.println("올바르지 않은 입력입니다.");
            return inputPlaySchedule(selectedMovie);
        }
    }

    public static int inputReservationPeople(PlaySchedule schedule) {
        try {
            System.out.println("## 예약할 인원을 입력하세요.");
            return schedule.checkValidReservation(Integer.parseInt(scanner.nextLine().trim()));
        } catch (IllegalArgumentException e) {
            System.out.println("올바르지 않은 입력입니다.");
            return inputReservationPeople(schedule);
        }
    }

    public static boolean inputContinueReservation() {
        try {
            System.out.println("## 예약을 종료하고 결제를 진행하려면 1번, 추가 예약을 진행하려면 2번");
            return checkContinue(Integer.parseInt(scanner.nextLine().trim()));
        } catch (IllegalArgumentException e) {
            System.out.println("올바르지 않은 입력입니다.");
            return inputContinueReservation();
        }
    }

    private static boolean checkContinue(int userInput){
        if(userInput == 1){
            return false;
        }
        if(userInput == 2){
            return true;
        }
        throw new IllegalArgumentException();
    }

    public static int inputPoint() {
        try {
            System.out.println("## 포인트 사용 금액을 입력하세요, 포인트가 없으면 0 입력");
            return ResultPay.checkPoint(Integer.parseInt(scanner.nextLine().trim()));
        } catch (IllegalArgumentException e) {
            System.out.println("올바르지 않은 입력입니다.");
            return inputPoint();
        }
    }

    public static int selectPaymentMethod() {
        try {
            System.out.println("## 신용카드는 1번, 현금은 2번");
            return ResultPay.checkPaymentMethod(Integer.parseInt(scanner.nextLine().trim()));
        } catch (IllegalArgumentException e) {
            System.out.println("올바르지 않은 입력입니다.");
            return inputPoint();
        }
    }
}
