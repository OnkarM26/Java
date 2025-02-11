// No between 1 to 100 divisible by 3, 5 and both
class Problem5 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%3==0 && i%5==0)
            System.out.println(i);
        }
    }
}
