// Display all prime numbers from 1 to N 
class Problem8 {
    public static void main(String[] args) {
        int N=855, count=0;
        for(int i=1;i<=N;i++){
            if(N%i==0){
                for(int j=1;j<=i;j++){
                    if(i%j==0)
                        count++;
                }
            
                if(count==2)
                    System.out.println(i);

                count=0;
            }
        }
    }
}
