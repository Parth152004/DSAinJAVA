public class AllPattern {

    public static void printstarpattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printinvertedstarepatten(int n){
        for(int i=0; i<n; ++i){
            for(int j=0; j<n-i; ++j){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printcharacterPattern(int n){
        char start = 65;
        for(int i=0; i<n; ++i){
            for(int j=0; j<=i; ++j){
                System.out.print(start);
                start++;
            }
            System.out.println();
        }
    }

    public static void printhollowrectanglepattern(int m,int n){
        for(int i=0; i<n; ++i){
            for(int j=0; j<n-i-1; ++j){
                System.out.print(" ");
            }
            for(int j=0; j<m; ++j){
                if( i==0 || j==0 || i==n-1||j==m-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        System.out.println("Star Pattern");
        printstarpattern(4);

        System.out.println("Inverted Stare Pattern");
        printinvertedstarepatten(4);

        System.out.println("Character Pattern");
        printcharacterPattern(4);

        System.out.println("Hollow rectangle");
        printhollowrectanglepattern(4,5);
    }
}