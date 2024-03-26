package Sort;

public class Insertion {

    public static void swap(int arr[],int a, int b){
        int temp = arr[a];
        arr[a] =arr[b];
        arr[b] = temp;
    }

    public static void insertionsort(int arr[]){

        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int temp = i-1;
            while(temp >=  0 && arr[temp]> curr){
                arr[temp+1] = arr[temp];
                temp--;
            }
            arr[temp+1] = curr;
        }
    }

    public static void main(String[] args) {
        int arr[] ={5,4,1,3,2};

        insertionsort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
