import java.util.*;

public class binarysearch
{
    public static boolean binarysearch(int number[],int key)
    {
        int frist=0;
        int end=4;
        while(frist<=end)
        {
            int mid=(frist+end)/2;
            if(number[mid]==key)
            {
                return true;
            }
            else if(number[mid]>key)
            {
                end=mid-1;
            }
            else
            {
                frist=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a array elements");
        int arr[]=new int[5];
        for(int i=0; i<5; i++)
        {
            arr[i]=sc.nextInt();
        }
        if(binarysearch(arr,15))
        {
            System.out.println("Is Found");
        }
        else
        {
            System.out.println("NOt found");
        }
    }
}