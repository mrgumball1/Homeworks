package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {
    private LocalDate start;
    private LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public  DatePeriod intersection(DatePeriod nextPeriod) {
        LocalDate intersectionStart = start.isAfter(nextPeriod.getStart()) ? start : nextPeriod.getStart();
        LocalDate intersectionEnd = end.isBefore(nextPeriod.getEnd()) ? end : nextPeriod.getEnd();
        if (intersectionStart.isAfter(intersectionEnd)) {
            return null;
        }
        return new DatePeriod(intersectionStart, intersectionEnd);
    }
}
