package Practice;

public class InnerClassTest {

    public int count = 0;
    public static void main(String[] args) {
        String details = "";
        InnerClassTest obj = new InnerClassTest() {
            public void execute() {
                for(int i=0;i < 10; i++) {
                   // details += count; //Compilation error
                }
            }
        };
    }
}
