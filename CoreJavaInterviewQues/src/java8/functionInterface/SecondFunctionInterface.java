package java8.functionInterface;
import java.util.function.Function;

public class SecondFunctionInterface {
    //In this class we will test 'andThen' method and 'compose' method of Function interface.
    public static void main(String[] args) {

        Function<Integer,Integer> add = x -> x+3;

        Function<Integer, Integer> multiply = x -> x*2;

        //Below example of 'andthen' method. 'add' Funtion interface call 'andThen' method and passing 'multiply'
        // Funtion interface as parameter. At the end call 'apply' method and passing 2 as input integer.
        //  First 'add' Function interface 'apply' method call and then 'andThen' Function interface method call

        Integer resultandThen = add.andThen(multiply).apply(2);
        System.out.println("andThen result ::: "+resultandThen);

        //Below example of 'compose' method.	'add' Funtion interface call 'compose' method and passing 'multiply'
        // Funtion interface as parameter. At the end call 'apply' method and passing 2 as input integer.
        //	 If 'add' Function interface call 'compose' method and passing another Function interface that means
        //	 another Function interface call first and then 'add'. In that case 'mutiply' is another Function interface.
        //    So 'multiply' Function interface call 'apply' method then 'add' Function interface call 'apply' method.

        Integer resultcompose = add.compose(multiply).apply(2);
        System.out.println("compose result ::: "+resultcompose);

        //Note : 'compose' method just opposite work of 'andThen' method. This is called function chaining.
    }
}
