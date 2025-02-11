// Print 3 numbers in ascending order
class Program10 {
    public static void main(String[] args) {
        int a=100,b=140,c=20;
        if(a>b && a>c && b>c)
        {
            System.out.println(a+" "+b+" "+c+" ");
        }

        else if(a>b && a>c && c>b){
            System.out.println(a+" "+c+" "+b+" ");
        }

        else if(b>a && b>c && a>c){
            System.out.println(b+" "+a+" "+c+" ");
        }

        else if(b>a && b>c && c>a){
            System.out.println(b+" "+c+" "+a+" ");
        }

        else if(c>a && c>b && a>b){
            System.out.println(c+" "+a+" "+b+" ");
        }

        else if(c>a && c>b && b>a){
            System.out.println(c+" "+b+" "+a+" ");
        }
    }
}
