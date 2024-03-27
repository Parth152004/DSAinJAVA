package Arrays;

public class Spiral {

    public static void printspirel(int arr[][]){
        int left = 0;
        int right = arr[0].length-1;
        int top = 0;
        int bottom = arr.length-1;

        while(left < right && top < bottom){
            for(int i=left; i<=right; i++){
                System.err.print(arr[top][i] +" ");
            }
            for(int i=top+1; i<=bottom; i++){
                System.out.print(arr[i][right] +" ");
            }
            for(int i=right-1; i>=left; i--){
                System.out.print(arr[bottom][i]+" ");
            }
            for(int i=bottom-1; i>=top+1; i--){
                System.out.print(arr[i][left]+" ");
            }
            left++;
            top++;
            right--;
            bottom--;
            
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        
        printspirel(arr);
        
    }
}
