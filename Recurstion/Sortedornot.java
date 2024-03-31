public class Sortedornot {

    public static boolean issorted(int arr[],int inx){
        if(inx == arr.length-1){
            return true;
        }
        if(arr[inx] < arr[inx+1]){
           return issorted(arr, inx+1);
        }else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        int arr[] = {1,10,4,5,6,7,8};

        System.err.println(issorted(arr,0));
    }
}
