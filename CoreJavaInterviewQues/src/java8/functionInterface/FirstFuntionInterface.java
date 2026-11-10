package java8.functionInterface;
import java.util.function.Function;

public class FirstFuntionInterface {

    public static void main(String[] args) {
        FirstFuntionInterface firstFuntionInterface = new FirstFuntionInterface();

        // Three ways to implements Function Interface
      // 1. Method Reference - A method reference is useful when you already have a method that matches the
    // functional interface's required signature. Java creates a functional-interface instance whose apply() behavior delegates to the referenced method.
  //You don't have to write an explicit implementation class yourself.
        Function<Integer, Boolean> methodReferenceFunction = firstFuntionInterface :: checkAgeVaidity;
        System.out.println("Method Reference Function Example "+methodReferenceFunction.apply(23));

       //2. Anonymous class (traditional Java)
     // Here, you explicitly provide the apply() method body. Java creates an instance of the anonymous implementation class.
        Function<Integer, Boolean> anonymousFunction =
                new Function<Integer, Boolean>() {
                    @Override
                    public Boolean apply(Integer age) {
                        return age > 18;
                    }
                };

        System.out.println("Anonymous Function Example "+anonymousFunction.apply(15));

      // Lambda expression - The lambda expression provides the implementation of apply().
        Function<Integer, Boolean> lambdaFunction =
                age -> age > 18;

        System.out.println("Lambda expression Function Example "+lambdaFunction.apply(19));
    }



    public Boolean checkAgeVaidity(Integer age) {
        return age > 18 ? Boolean.TRUE : Boolean.FALSE;
    }
}
