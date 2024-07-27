package java8.LocalDate;

import java.time.LocalDate;

public class LocalDateDemo {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println("year : "+localDate.getYear());
        System.out.println("month name : "+localDate.getMonth());
        System.out.println("month : "+localDate.getMonthValue());
        System.out.println("day of week : "+localDate.getDayOfWeek());
        System.out.println("today date : "+localDate.getDayOfMonth());

        LocalDate preetyDOB = LocalDate.of(1992,10,05);
        System.out.println("Preety DOB : "+preetyDOB);

        LocalDate soumyaDOB = LocalDate.parse("1999-09-21");
        System.out.println("Soumya DOB : "+soumyaDOB);

        //pludDays and minusDay in LocalDate
        System.out.println("Yesterday date : "+localDate.minusDays(1));

        System.out.println("Tomorrow date : "+localDate.plusDays(1));

    }

}
