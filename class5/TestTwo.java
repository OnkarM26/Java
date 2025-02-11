class Test {

    public static void m1(){
        int a;
        // System.out.println(a);  error: variable a might not have been initialized
        a=100;
        System.out.println(a);        
    }

    public static void m2(){
        int b;
        b=200;
         /*  System.out.println(a+b); error: cannot find symbol
             System.out.println(a+b);
             symbol:   variable a
             location: class Test
       */
    }
    public static void main(String[] args) {
        m1();
        m2();
    }
}
