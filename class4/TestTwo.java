

public class TestTwo {
    int a=100; // non-static or instance variable
    static int b=200; // static variable or class level var

    public static void main(String[] args) {
        int c=300; // local variable
       // System.out.println(a); error: non-static variable a cannot be referenced from a static context
        
        System.out.println(b); // 200
        System.out.println(c); // 300

    }
}
