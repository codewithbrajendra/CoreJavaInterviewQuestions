package Practice;

public class DefaultStaticMethodImpl implements DefaultStaticMethod{

    public void default1() {
        System.out.println("This is implementation of default1 method.");
    }
    public static void main(String[] args) {
        DefaultStaticMethod defaultStaticMethod = new DefaultStaticMethodImpl();
        defaultStaticMethod.default1();
        DefaultStaticMethodImpl defaultStaticMethodImpl = new DefaultStaticMethodImpl();
        defaultStaticMethodImpl.default1();
        defaultStaticMethodImpl.default2();
        DefaultStaticMethod.static1();
        DefaultStaticMethod.static2();
    }
}
