import java.util.Scanner;

public class Codeforce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            int n = sc.nextInt();
            String str = sc.next();
            int ans = 0;
            for(int i=0; i<n; i++){
                if(str.charAt(i) == '1'){
                    ans++;
                }
            }
            if(ans % 2 != 0 ){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
