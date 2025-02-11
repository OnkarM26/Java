class Test {
    public static void main(String[] args) {
        byte b=100; // -128 to 127
        System.out.println(b+1);// work b'coz printing directly not storing somewhere
        /* byte c=b+1;        
        TestFour.java:5: error: incompatible types: possible lossy conversion from int to byte
                byte c=b+1;
        */

        int c=b+1;
     }
}
