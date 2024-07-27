package JD_Birla.JD_BirlaCoding;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FindAgeFromDOB_44 {
    public static void main(String[] args) {
        LocalDate dob = LocalDate.of(1989, 9, 23);
        LocalDate currentDate = LocalDate.now();

        System.out.println(ChronoUnit.YEARS.between(dob,currentDate));
    }
}
