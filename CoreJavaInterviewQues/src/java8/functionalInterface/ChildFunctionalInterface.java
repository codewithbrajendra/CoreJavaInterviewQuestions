package java8.functionalInterface;
@FunctionalInterface
public interface ChildFunctionalInterface extends ParentFunctionalInterface {

    //If we extend funtional interface to another functional interface then child interface can't contain any abstract method.
    //public void childPrint();

    default void defaultChildMethod() {
        System.out.println("default method");
    }

    static void staticChildMethod() {
        System.out.println("static method");
    }

    public class FunctionalInterfaceInheritance implements ChildFunctionalInterface {

        @Override
        public void print() {
            System.out.println("Print method of ParentFunctionalInterface.");
        }

    }
}
