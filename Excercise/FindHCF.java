class FindHCF {
    public static void main(String[] args) {
        
        
        int num1=10,num2=20;
        int max=0;
        for(int i=1;i<=num1;i++){
            if(num1%i==0){
                for(int j=1;j<=num2;j++){
                    if(num2%j==0){
                        if(i==j)
                            max=i;
                    }
                }
            }
        } 
        System.out.println(max);
    }      
}
