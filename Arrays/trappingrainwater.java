package Arrays;

public class trappingrainwater {
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};

        int Lmax[] = new int[7];
        int Rmax[] = new int[7];
        Lmax[0] = arr[0];
        for(int i=1; i<Lmax.length; i++){
            Lmax[i] = Math.max(arr[i], Lmax[i-1]);
        }
        Rmax[6] = arr[6];
        for(int j=5; j>=0; j--){
            Rmax[j] = Math.max(arr[j], Rmax[j+1]);
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(Lmax[i]+" ");
        }
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(Rmax[i]+" ");
        }
        System.out.println();
 
        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans += Math.min(Lmax[i], Rmax[i]) - arr[i];
        }
        System.out.println(ans);
    }
}
