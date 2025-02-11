class TestFour {
    public static void main(String[] args) { 
        String[] enames;
        enames=new String[4];
        enames[0]="RG";
        enames[1]="PG";
        enames[3]="Modi";

        // String enames={"RG","PG",null,"Modi"};

        // Read Array Elements
        System.out.println(enames[0]);
        System.out.println(enames[1]);
        System.out.println(enames[3]);

        // Read Array element using for loop
        for(int i=0;i<=3;i++){
            System.out.println(enames[i]);
        }

        // Using while loop
        int i=0;
        while(i<=3){
            System.out.println(enames[i]);
            i++;
        }

        // Using for-each loop
        for(String ename:enames){
            System.out.println(ename);
        }
    }
    
}
