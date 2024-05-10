package java8.functionInterface;
import java.util.function.Function;

public class FirstFuntionInterface {

    public static void main(String[] args) {
        FirstFuntionInterface firstFuntionInterface = new FirstFuntionInterface();
        Function<Integer, Boolean> function = firstFuntionInterface :: checkAgeVaidity;
        System.out.println(function.apply(23));
    }

    public Boolean checkAgeVaidity(Integer age) {
        return age > 18 ? Boolean.TRUE : Boolean.FALSE;
    }
}
