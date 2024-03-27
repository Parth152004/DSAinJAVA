package Arrays;

public class Transpose {
    public static void transpose(int arr[][]){
        int arr1[][] = new int[arr[0].length][arr.length];
        for(int i=0; i<arr[0].length; i++){
            for(int j=0; j<arr.length; j++){
                arr1[i][j] = arr[j][i]; 
            }
        }
        for(int i = 0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {
            {3,6,1},
            {2,1,10},
        };

        transpose(arr);
    }
}
