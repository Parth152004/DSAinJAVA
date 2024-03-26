package Sort;


public class Bubble {

    public static void swap(int arr[], int a,int b){
        int temp = arr[a];
        arr[a] =arr[b];
        arr[b] = temp;
    }

    public static void bubblesort(int arr[]){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] >arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};

        bubblesort(arr);

        for(int i=0; i<arr.length; i++){
            System.err.print(arr[i]+" ");
        }
        System.out.println();
    }
}
