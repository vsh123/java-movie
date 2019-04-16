package domain;

import java.time.LocalDateTime;

import static utils.DateTimeUtils.format;

public class PlaySchedule {
    private static final int MIN_RESERVATION_NUM = 0;
    private final LocalDateTime startDateTime;
    private int capacity;

    public PlaySchedule(LocalDateTime startDateTime, int capacity) {
        this.startDateTime = startDateTime;
        this.capacity = capacity;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int checkValidReservation(int reservePeopleNum) {
        if ((this.capacity >= reservePeopleNum) &&
                (reservePeopleNum > MIN_RESERVATION_NUM)) {
            return reservePeopleNum;
        }
        throw new IllegalArgumentException();
    }

    void reduce(int peopleNum){
        capacity -= peopleNum;
    }

    @Override
    public String toString() {
        return "시작시간: " + format(startDateTime) + " 예약가능인원: " + capacity + "\n";
    }


}
