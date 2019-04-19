package payment;

import domain.ResultPay;
import reservation.MovieReservation;
import view.InputView;
import view.OutputView;

public class PaymentMain {
    public static void paymentrun(MovieReservation reservations) {
        OutputView.paymentStart();
        ResultPay resultPay;
        int point = InputView.inputPoint();
        int pay = reservations.getPay();
        int paymentMethod = InputView.selectPaymentMethod();
        resultPay = new ResultPay(pay, point, paymentMethod);
        resultPay.printResult();
    }
}
