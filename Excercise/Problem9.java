// LCM of Two Numbers
class Problem9 {
    public static void main(String[] args) {
        int Num1=15,Num2=10,temp=Num1;
        int i=1;
        while(i>0){
            if(Num1%Num2==0){
                System.out.println("LCM of Given two Number is:"+Num1);
                break;
            }
            else{
                Num1=temp*i;
                System.out.println(Num1);
                i++;
            }
        }
    }
}
