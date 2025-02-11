// Print reverse of digits of number
class Program4 {
    public static void main(String[] args) {
        int num=-120,rem=0,rev=0,temp=num,count=0;

        // Count the number
        // If number is positive
        if(num>=0){
            while(temp>0){
            temp=temp/10;
            count++;
            }
        }
        // If number is negative
        else{
            while(temp<0){
                temp=temp/10;
                count++;
            }
        }

        // Reverse the number
        for(int i=0;i<count;i++){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
    }
}
