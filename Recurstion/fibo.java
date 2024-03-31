public class fibo {

    public static int printfibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return printfibo(n-1) + printfibo(n-2);
        
    }
    public static void main(String[] args) {
        int n= 5;

        System.out.println(printfibo(n));
    }
}
