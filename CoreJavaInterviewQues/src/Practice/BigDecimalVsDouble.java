
package Practice;

import java.math.BigDecimal;

public class BigDecimalVsDouble {


public static void main(String[] args) {
        Double a = 0.02;
        Double b = 0.03;
        Double c = b - a;

        System.out.println("Double subtraction : "+c);

        BigDecimal _a = new BigDecimal(0.02);
        BigDecimal _b = new BigDecimal(0.03);
        BigDecimal _c = _b.subtract(_a);

        System.out.println("Bigdecimal substraction : "+_c);

    }

}

