class TestTwo {
    public static void main(String[] args) {    
        String enames[]; // declaration
        enames= new String[5]; // creation
        enames[0]="Rahul"; // Initialization
        enames[1]="Priyanka";
        enames[2]="Modi";
        enames[3]="Sonia";
        
        // Reading Values
        System.out.println(enames[0]);
        System.out.println(enames[1]);
        System.out.println(enames[2]);
        System.out.println(enames[3]);
        System.out.println(enames[4]); // Default value: null
        System.out.println(enames); // Print address not value
    }   
}
