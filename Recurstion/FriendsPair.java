public class FriendsPair {
    
    public static int FriendsPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1 = FriendsPairing(n-1);

        int fnm2 = FriendsPairing(n-2);
        int ans = (n-1) *fnm2;

        return fnm1 + ans;
    }
    
    public static void main(String[] args) {
        int n = 3;
        System.out.println(FriendsPairing(n));
    }
}
