import java.util.*;

public class pairsarry
{
    public static void getpairs(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i;  j<arr.length; j++)
            {
                System.out.print("("+ arr[i] + "," +arr[j] +")");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a length of arry");
        int length=sc.nextInt();
        int arr[]=new int[length];
        System.out.println("enter a elements of arry");
        for(int i=0; i<length; i++)
        {
            arr[i]=sc.nextInt();
        }
        getpairs(arr);   
    }
}