// Print Sum of Array Elements
class TestSeven {
    public static void main(String[] args) {
        int[] nums={7,18,14,281,41,13,46,5,9};
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        System.out.println("Sum of Array is:"+sum);
    }
}
