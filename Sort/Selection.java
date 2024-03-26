package Sort;

public class Selection {

    public static void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]= temp;
    }
    public static void selectionsort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]< arr[min]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};

        selectionsort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
