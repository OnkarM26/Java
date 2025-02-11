
class Test {
    public static void main(String[] args) {
        int a=10;
        int b=++a;
        System.out.println(a); //11
        System.out.println(b); // 11
        
        int x=10;
        int y=x++;
        System.out.println(y); //10
        System.out.println(x); //11

        System.out.println(x++);
        System.out.println(++y);
    }   
}
