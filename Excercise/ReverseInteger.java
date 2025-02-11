class ReverseInteger {
    public static void main(String[] args) {
        int num=230, y,z=0;
        int temp=num, count=0;
        while(temp>0){

            temp=temp/10;
            count++;
        }
        // System.out.println(count);

        for(int i=0;i<count;i++){
            y=num%10;
            z=z*10+y;
            num=num/10;
        }
        System.out.println(z);
    }
}
