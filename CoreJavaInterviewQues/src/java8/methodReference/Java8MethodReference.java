package java8.methodReference;

@FunctionalInterface
interface AbcInterface {

    public int operationX(int x);
}

public class Java8MethodReference {

    public static void main(String[] args) {
        //1. If we are using lambda expression below are code
        AbcInterface abcInterfaceLambdaExpression = (x) -> x*x;

        /*  // Or we can write this line using return keyword. Both scenario are same.
         * AbcInterface abcInterfaceLambdaExpression = (x) -> { return x*x; };
         */

        System.out.println("Calling operationX by using lambda expression ::: "+abcInterfaceLambdaExpression.operationX(5));

        //2. In the above code we are using lambda expression and defined FunctionalInterface(AbcInterface)'s body x*x.
        // but in case of method reference, we have to specify body for doing operation of functional interface abstract method.Below are the example.

        //	AbcInterface abcInterfaceMethodReference = Java8MethodReference.cubeX(5);
        //	Note : In the above line we cannot return FunctionalInterface(AbcInterface) directly from cube method.
        //  It throw compilation error "Type mismatch: cannot convert from int to AbcInterface"

        AbcInterface abcInterfaceMethodReference = Java8MethodReference :: cubeX;// This is the example of method reference using static method.
        System.out.println("Calling operationX by using method reference ::: "+abcInterfaceMethodReference.operationX(5));

        //  Note : We can use method reference by three ways - 1>By Static method 2> By Instance method(Creating object then call)
        //  3>By Constructor
    }

    public static int cubeX(int x) {
        return x*x*x;
    }

}
