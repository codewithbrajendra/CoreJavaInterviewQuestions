package Practice;

public interface DefaultStaticMethod {

     default void default1() {
        System.out.println("This is first default method in DefaultStaticMethod.");
    }

    default void default2() {
        System.out.println("This is second method in DefaultStaticMethod.");
    }

    static void static1() {
         System.out.println("This is first static method in DefaultStaticMethod.");
    }

    static void static2() {
        System.out.println("This is second static method in DefaultStaticMethod.");
    }
}
