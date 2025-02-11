// Print first 5 values which are divisible by 2,3 and 5
class Problem7 {
    public static void main(String[] args) {
        int i=1,count=0;

        while(i>0){
            if(i%2==0 && i%3==0 && i%5==0){
                count++;
                System.out.println(i);
            }

            if(count>=5)
            break;

            i++;
        }
    }    
}
