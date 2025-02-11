// Find largest Prime Factor of a number
class Problem6 {
    public static void main(String[] args) {
        int num=51,count=0,max=0;
        for(int i=1;i<=num;i++){
            // check i is a factor of number num
            if(num%i==0){
                // check whether i is a prime number
                for(int j=1;j<=i;j++){
                    if(i%j==0)
                        count++;
                }

                if(count==2){
                    System.out.println(i+" is a Prime Factor");
                    if(i>max)
                        max=i;
                }
                // Reset Counter 
                count=0;
            }
        }
        System.out.println(max+" is a largest Prime factor of a "+num);
    }
}
