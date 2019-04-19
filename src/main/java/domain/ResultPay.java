package domain;

public class ResultPay {
    private static final int CARD = 1;
    private static final int MONEY = 2;
    private static final double CARD_RATIO = 0.95;
    private static final double MONEY_RATIO = 0.98;
    private static final int MIN_POINT = 0;
    private int pay;
    private int point;
    private int paymentMethod;

    public ResultPay(int pay, int point, int paymentMethod) {
        this.paymentMethod = paymentMethod;
        this.point = point;
        if (paymentMethod == CARD) {
            this.pay = (int) (pay * CARD_RATIO) - point;
        }
        if (paymentMethod == MONEY) {
            this.pay = (int) (pay * MONEY_RATIO) - point;
        }
        if(this.pay < 0){
            this.pay = 0;
        }
    }

    public static int checkPoint(int point) {
        if (point < MIN_POINT) {
            throw new IllegalArgumentException();
        }
        return point;
    }

    public static int checkPaymentMethod(int paymentMethod) {
        if (paymentMethod == CARD || paymentMethod == MONEY) {
            return paymentMethod;
        }
        throw new IllegalArgumentException();
    }

    public void printResult() {
        System.out.println("최종 결제 금액은 " + pay + "입니다.");
        System.out.println("예매를 완료했습니다. 즐거운 영화 관람되세요.");
    }
}
