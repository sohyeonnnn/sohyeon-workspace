package ch10;

import java.time.*;
import java.time.temporal.*;
import static java.time.DayOfWeek.*;
import static java.time.temporal.TemporalAdjusters.*;

class DayAfterTommorrow implements TemporalAdjuster {
	@Override
	public Temporal adjustInto(Temporal temporal) {
		return temporal.plus(2, ChronoUnit.DAYS);
	}
}

public class NewTimeEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate date = today.with(new DayAfterTommorrow());

		p(today); // 오늘
		p(date); // 내일 모레
		p(today.with(firstDayOfNextMonth())); // 다음 달의 첫날
		p(today.with(firstDayOfMonth())); // 이 달의 첫날
		p(today.with(lastDayOfMonth())); // 이 달의 마지막날
		p(today.with(firstInMonth(TUESDAY))); // 이 달의 첫번째 화요일
		p(today.with(lastInMonth(TUESDAY))); // 이 달의 마지막 화요일
		p(today.with(previous(TUESDAY))); // 지난주 화요일
		p(today.with(previousOrSame(TUESDAY))); // 지난주 화요일(오늘 포함)
		p(today.with(next(TUESDAY))); // 다음주 화요일
		p(today.with(nextOrSame(TUESDAY))); // 다음주 화요일(오늘 포함)
		p(today.with(dayOfWeekInMonth(4, TUESDAY))); // 이 달의 4번째 화요일
	}

	static void p(Object obj) {
		System.out.println(obj);
	}
}
