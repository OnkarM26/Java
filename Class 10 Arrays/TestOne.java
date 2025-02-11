// Recreate AIOBException - Runtime exception
class TestOne {
    public static void main(String[] args) {
        int[] eids;
        eids=new int[4];

        // Read Array elements
        System.out.println(eids[0]);
        System.out.println(eids[1]);
        System.out.println(eids[2]);
        System.out.println(eids[3]);
        System.out.println(eids[10]);
        // Runtime Error:0 Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 4
    }
}
    

