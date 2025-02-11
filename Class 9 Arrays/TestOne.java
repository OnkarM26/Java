class TestOne {
    public static void main(String[] args) {
        int[] eids; // declaration
        eids=new int[4]; // creation
        eids[0]=101; // initialization
        eids[1]=102;
        eids[2]=103;

        // Reading elements
        System.out.println(eids[0]);
        System.out.println(eids[1]);
        System.out.println(eids[2]);
        System.out.println(eids[3]); // default value=0
        System.out.println(eids); // It will print address not values
    }    
}
