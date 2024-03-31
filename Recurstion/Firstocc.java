public class Firstocc {

    public static int occinarr(int arr[],int key,int inx){
        if(inx == arr.length-1){
            return -1;
        }
        if(arr[inx] == key){
            return inx;
        }
        return occinarr(arr, key, inx+1);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};

        System.out.println(occinarr(arr,5,0));
    }
}
